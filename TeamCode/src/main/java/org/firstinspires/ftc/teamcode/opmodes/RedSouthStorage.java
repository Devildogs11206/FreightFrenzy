package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RedSouthStorage extends RedSouth {
    @Override
    protected void execute() {
        super.execute();

        robot.drive(-1,0,-180,12.5);
        robot.lift(FORWARD);
    }
}
