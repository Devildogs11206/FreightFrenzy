package org.firstinspires.ftc.teamcode.opmodes;


import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RedSouthWarehouse extends RedSouth {
    @Override
    protected void execute() {
        super.execute();
        robot.drivePower = .6;
        robot.drive(-1,0,180,5);
        robot.drive(2,0,-90,132);
        robot.lift(FORWARD);
    }
}