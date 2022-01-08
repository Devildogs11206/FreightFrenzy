package org.firstinspires.ftc.teamcode.opmodes;


import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class BlueSouthWearhouse extends BlueSouth {
    @Override
    protected void execute() {
       super.execute();

        robot.drive(-1,0,180,5);
        robot.drive(2,0,90,120);
        robot.lift(FORWARD);
    }
}