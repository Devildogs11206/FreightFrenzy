package org.firstinspires.ftc.teamcode.controllers;

import static org.firstinspires.ftc.teamcode.internal.Robot.ElementLiftPosition.HIGH;
import static org.firstinspires.ftc.teamcode.internal.Robot.ElementLiftPosition.LOW;
import static org.firstinspires.ftc.teamcode.internal.Robot.ElementLiftPosition.MID;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftMode.BACKWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftMode.FORWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftMode.STOPPED;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.LOWGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MIDGOAL;

import org.firstinspires.ftc.teamcode.internal.Robot;
import org.firstinspires.ftc.teamcode.opmodes.OpMode;

public class ElementLiftController extends RobotController {
    public ElementLiftController(OpMode opMode) {
        super(opMode);
    }

    @Override
    public void execute() {
        if (gamepad2.a && gamepad2.dpad_up) robot.elementLift(HIGH);
        else if (gamepad2.a && (gamepad2.dpad_right || gamepad2.dpad_left)) robot.elementLift(MID);
        else if (gamepad2.a && gamepad2.dpad_down) robot.elementLift(LOW);
    }
}