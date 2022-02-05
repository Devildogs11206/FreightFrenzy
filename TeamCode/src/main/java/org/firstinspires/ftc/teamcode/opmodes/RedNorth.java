package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;

public class RedNorth extends RedOpMode {
    @Override
    public String getDetectorFileName() {
        return "ffrn";
    }

    @Override
    protected void execute() {
        robot.drivePower = 0.5;
        robot.detectAndLift();
        robot.drive(1,0,0, 24);
        robot.drive(1,0,45,8);
        robot.intake(OUT,500);
        robot.drive(-1,0,45,4);
    }
}
