package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.REVERSECAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.CAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MAX;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

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
        robot.drive(1,0, 180,12.5); //decreased inches from 13 to 11
        robot.drive(0,0,180,0);
        robot.intake(REVERSECAROUSEL,5000);

    }
}
