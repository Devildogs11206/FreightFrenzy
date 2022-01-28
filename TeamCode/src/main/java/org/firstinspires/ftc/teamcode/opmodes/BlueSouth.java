package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit.INCH;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.REVERSECAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.CAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MAX;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DistanceSensor;

public abstract class BlueSouth extends BlueOpMode {
    @Override
    protected void execute() {
        robot.drivePower = .5;
        robot.lift(HIGHGOAL);
        robot.drive(1,0,0, 24);
        robot.drive(1,0,45,8);
        robot.intake(OUT,500);
        robot.drive(-1,0,45,8);
        robot.drive(-1,0,90, 30);
        robot.lift(CAROUSEL);
        double distance = robot.distanceSensor.getDistance(INCH) - 9.8;
        robot.drive(1, 0, 180, Math.min(distance,14));
        robot.drive(0,0,180,0);
        robot.intake(REVERSECAROUSEL,5000);
    }
}
