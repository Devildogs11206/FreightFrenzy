package org.firstinspires.ftc.teamcode.internal;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.tfrec.Detector;
import org.firstinspires.ftc.teamcode.tfrec.classification.Classifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrenzyDetector extends Thread {
    private LinearOpMode opMode;
    private Detector detector;

    private String modelFileName = "ffrn.tflite";
    private String labelFileName = "ffrn.txt";

    public FrenzyDetector(LinearOpMode opMode) {
        try {
            this.opMode = opMode;

            detector = new Detector(
                Classifier.Model.FLOAT_EFFICIENTNET,
                modelFileName,
                labelFileName,
                opMode.hardwareMap.appContext,
                opMode.telemetry
            );

            detector.activate();
        } catch (Exception e) {
            opMode.telemetry.addData("Error", e.toString());
            opMode.telemetry.update();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            opMode.telemetry.update();

            opMode.waitForStart();

            while (opMode.opModeIsActive()) {
                List<Classifier.Recognition> results = detector.getLastResults();
                if (results == null || results.isEmpty()) continue;
                for (Classifier.Recognition recognition : results)
                    opMode.telemetry.addData(recognition.getTitle(), "%.2f", recognition.getConfidence());
                opMode.telemetry.update();
            }

            detector.stopProcessing();
        } catch (Exception e) {
            opMode.telemetry.addData("Error", e.toString());
            opMode.telemetry.update();
        }
    }
}
