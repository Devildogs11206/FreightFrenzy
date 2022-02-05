package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.internal.Robot;

@Autonomous
public class BlueNorthStorage extends BlueNorth {
    @Override
    protected void execute() {
        super.execute();
        robot.lift(FORWARD);
        robot.drive(1, 0,-90,60);
        robot.drive(0,-1,-90,12);
    }
}
