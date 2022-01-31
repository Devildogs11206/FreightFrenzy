package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.internal.FrenzyDetector;

@TeleOp
public class FrenzyDetectMode extends LinearOpMode {
    @Override
    public void runOpMode() {
        new FrenzyDetector(this).start();
        waitForStart();
        while (opModeIsActive()) Thread.yield();
    }
}
