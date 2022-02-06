package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RedSouthWarehouse extends RedSouth {
    @Override
    protected void execute() {
        super.execute();
        if (robot.drivePower < 6) robot.drivePower = .6;
        robot.drive(-1,0,180,4);  // changed from 5 to 4 in an experiment
        robot.drive(2,0,-90,111); // changed from 132 to 111 inches
        robot.lift(FORWARD);
    }
}