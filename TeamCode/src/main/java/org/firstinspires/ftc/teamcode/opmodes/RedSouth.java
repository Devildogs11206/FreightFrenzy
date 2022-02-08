package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit.INCH;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.REVERSECAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.CAROUSEL;

public abstract class RedSouth extends RedOpMode {
    @Override
    public String getDetectorFileName() {
        return "ffrs";
    }

    @Override
    protected void execute() {
        double offset = robot.detectLiftAndGetOffset();
        robot.drive(+1, 0, -24, 22 + offset);
        robot.intake(OUT, 500);
        robot.drive(-1, 0, -24, offset + 4);
        robot.lift(CAROUSEL);
        robot.drive(-1, 0, -90, 43);
        double distance = robot.distanceSensor.getDistance(INCH) - 9.8;
        distance = Math.min(distance, 6);
        distance = Math.max(distance, 4);
        robot.drive(+1, 0, -180, distance);
        robot.drive( 0, 0, -180, 0);
        robot.intake(REVERSECAROUSEL, 5000);
    }
}
