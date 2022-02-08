package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;

public abstract class RedNorth extends RedOpMode {
    @Override
    public String getDetectorFileName() {
        return "ffrn";
    }

    @Override
    protected void execute() {
        double offset = robot.detectLiftAndGetOffset();
        robot.drive(+1, 0, +24, 22 + offset);
        robot.intake(OUT, 500);
        robot.drive(-1, 0, +24, offset + 4);
    }
}
