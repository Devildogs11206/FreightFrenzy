package org.firstinspires.ftc.teamcode.internal;

import org.firstinspires.ftc.teamcode.tfrec.Detector;
import org.firstinspires.ftc.teamcode.tfrec.classification.Classifier;

import java.util.ArrayList;
import java.util.List;

public class DetectorThread extends RobotThread {
    private Detector detector;

    public DetectorThread(Robot robot) {
        super(robot);
    }

    @Override
    protected void init() throws Exception {
        if (robot.opMode.getDetectorFileName() == null)
            return;

        detector = new Detector(
            Classifier.Model.FLOAT_EFFICIENTNET,
            robot.opMode.getDetectorFileName() + ".tflite",
            robot.opMode.getDetectorFileName() + ".txt",
            robot.opMode.hardwareMap.appContext,
            robot.opMode.telemetry
        );

        detector.activate();
    }

    @Override
    protected void execute() throws Exception {
        while (!robot.opMode.isStopping()) {
            List<Classifier.Recognition> results = detector.getLastResults();
            if (results == null || results.isEmpty()) continue;
            robot.recognitions = results;
        }

        detector.stopProcessing();
    }
}
