package org.firstinspires.ftc.teamcode.opmodes;


import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.REVERSECAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.CAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.MAX;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous

public class RedCarouselWearhouse extends RedOpMode{
    @Override
    protected void execute() {
        robot.drivePower = 0.5;
        robot.lift(MAX);
        robot.drive(1,0,0, 24);
        robot.drive(1,0,-45,8);
        robot.intake(OUT,500);
        robot.drive(-1,0,-45,8);
        robot.drive(-1,0,-90, 30);
        robot.lift(CAROUSEL);
        robot.drive(1,0,-180,12.5);
        robot.drive(0,0,-180,0);
        robot.intake(REVERSECAROUSEL,5000);
        robot.drive(-1,0,-180,5);
        robot.drive(0,-1,-180,69);
        robot.drive(1,0,-90,0);
        robot.drive(1,0,-90,54);
        robot.lift(FORWARD);
    }
}
