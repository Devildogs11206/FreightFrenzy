package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.internal.FrenzyDetector;


@TeleOp

public class FrenzyDetectMode extends LinearOpMode {

    private FrenzyDetector frenzyDetector = null;
    @Override
    public void runOpMode() {
        try {
            try {
                frenzyDetector = new FrenzyDetector(this.hardwareMap, this, telemetry);
                Thread detectThread = new Thread(frenzyDetector);
                detectThread.start();
                telemetry.update();
            } catch (Exception ex) {
                telemetry.addData("Error", String.format("Unable to initialize Detector. %s", ex.getMessage()));
                telemetry.update();
                sleep(5000);
                return;
            }

            // Wait for the game to start (driver presses PLAY)
            telemetry.update();
            waitForStart();

            String zone = null;

            // run until the end of the match (driver presses STOP)
            while (opModeIsActive()) {
                zone = frenzyDetector.returnZone();
                telemetry.addData("Detected Zone", zone);
            }
            frenzyDetector.stopDetection();
        } catch (Exception ex) {
            telemetry.addData("Init Error", ex.getMessage());
            telemetry.update();
        } finally {
            if (frenzyDetector != null) {
                frenzyDetector.stopDetection();
            }
        }
    }
}
