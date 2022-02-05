package org.firstinspires.ftc.teamcode.opmodes;

import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.BLACK;
import static com.qualcomm.hardware.rev.RevBlinkinLedDriver.BlinkinPattern.GREEN;
import static org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit.INCH;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.REVERSECAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.CAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.LOWGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MAX;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MIDGOAL;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

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
