package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit.INCH;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.REVERSECAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.CAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;

public abstract class RedSouth extends RedOpMode {
    @Override
    public String getDetectorFileName() {
        return "ffrs";
    }

    @Override
    protected void execute() {
        robot.drivePower = .5;
        robot.lift(HIGHGOAL);
        robot.drive(1,0,0, 24);
        robot.drive(1,0,-45,8);
        robot.intake(OUT,500);
        robot.drive(-1,0,-45,8);
        robot.drive(-1,0,-90, 30);
        robot.lift(CAROUSEL);
        double distance = robot.distanceSensor.getDistance(INCH) - 9.8;
        distance = Math.min(distance, 14);
        distance = Math.max(distance, 8);
        robot.drive(1, 0, -180, distance);
        robot.drive(0,0,-180,0);
        robot.intake(REVERSECAROUSEL,5000);
    }
}
