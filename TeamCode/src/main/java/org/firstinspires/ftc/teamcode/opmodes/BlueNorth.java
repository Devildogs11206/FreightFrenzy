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
        double offset = robot.detectLiftAndGetOffset();
        robot.drive(1,0,-24.1, 24 + offset);
        robot.intake(OUT,500);
        robot.drive(-1,0,-24.1,offset + 6);
    }
}
