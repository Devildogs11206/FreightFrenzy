package org.firstinspires.ftc.teamcode.controllers;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftMode.BACKWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftMode.FORWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftMode.STOPPED;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.LOWGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MIDGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.TELEOPHIGHGOAL;

import org.firstinspires.ftc.teamcode.internal.Robot;
import org.firstinspires.ftc.teamcode.opmodes.OpMode;

public class LiftController extends RobotController {
    public LiftController(OpMode opMode) {
        super(opMode);
    }

    @Override
    public void execute() {
        if (gamepad2.y) robot.lift(Robot.LiftPosition.CAROUSEL);
        else if (gamepad2.right_bumper) robot.lift(FORWARD);
        else if (gamepad2.left_bumper) robot.lift(BACKWARD);
        else if (!gamepad2.a && gamepad2.dpad_up) robot.lift(TELEOPHIGHGOAL);
        else if (!gamepad2.a && (gamepad2.dpad_right || gamepad2.dpad_left)) robot.lift(MIDGOAL);
        else if (!gamepad2.a && gamepad2.dpad_down) robot.lift(LOWGOAL);
        else robot.lift(STOPPED);
    }
}