package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RedNorthStorage extends RedNorth {
    @Override
    protected void execute() {
        super.execute();
        robot.drive(-1,0,-90,84);
        robot.lift(FORWARD);
    }
}
