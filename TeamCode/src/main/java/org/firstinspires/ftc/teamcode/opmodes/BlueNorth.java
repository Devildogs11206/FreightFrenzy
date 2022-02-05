package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;

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
