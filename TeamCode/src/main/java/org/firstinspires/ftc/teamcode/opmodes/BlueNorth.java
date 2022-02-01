package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MAX;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

public abstract class BlueNorth extends BlueOpMode {
    @Override
    public String getDetectorFileName() {
        return "ffbn";
    }

    @Override
    protected void execute() {
        robot.drivePower = 0.5;
        robot.detectAndLift();
        robot.drive(1,0,0, 24);
        robot.drive(1,0,-45,8);
        robot.intake(OUT,500);
        robot.drive(-1,0,-45,4);
    }
}
