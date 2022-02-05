package org.firstinspires.ftc.teamcode.controllers;

import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.BLACK;
import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.GREEN;
import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.HEARTBEAT_RED;
import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.ORANGE;
import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.RED;

import static org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit.INCH;

import org.firstinspires.ftc.teamcode.opmodes.OpMode;

public class LightsController extends RobotController {
    public LightsController(OpMode opMode) {
        super(opMode);
    }

    public void execute() {
        if (opMode.time >= 75 && opMode.time <= 100) robot.setLights(HEARTBEAT_RED);
        else if (robot.distanceSensor.getDistance(INCH) <= 1.5) robot.setLights(GREEN); //changed from 1.3 to 1.5
        else robot.setLights(BLACK);

    }
}