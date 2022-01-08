package org.firstinspires.ftc.teamcode.opmodes;


import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RedSouthWarehouse extends BlueSouth {
    @Override
    protected void execute() {
       super.execute();

        robot.drive(-1,0,-180,5);
        robot.drive(0,1,-180,69);
        robot.drive(1,0,-90,0);
        robot.drive(0,-1,-90,24);
        robot.drive(1,0,-90,72);
        robot.lift(FORWARD);
    }
}