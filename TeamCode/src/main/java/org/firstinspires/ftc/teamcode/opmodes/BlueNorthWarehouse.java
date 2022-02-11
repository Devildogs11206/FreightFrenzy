package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class BlueNorthWarehouse extends BlueNorth {
    @Override
    protected void execute() {
        super.execute();
        robot.drive( 0,+1,-90,21);
        robot.drive(-1, 0,-90,39);
        robot.drive( 0,-1,-90,30);
        robot.drive(-1, 0,-90,24);
        robot.lift(FORWARD);
    }
}
