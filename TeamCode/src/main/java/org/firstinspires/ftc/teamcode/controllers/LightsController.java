package org.firstinspires.ftc.teamcode.controllers;

import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.BLACK;
import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.GREEN;
import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.RED;

import static org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit.INCH;

import org.firstinspires.ftc.teamcode.opmodes.OpMode;

public class LightsController extends RobotController {
    public LightsController(OpMode opMode) {
        super(opMode);
    }

    public void execute() {
        if (opMode.time >= 75) robot.setLights(RED);
        else if (robot.distanceSensor.getDistance(INCH) <= 1.3) robot.setLights(GREEN);
        else robot.setLights(BLACK);
    }
}