package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RedNorthWarehouse extends RedNorth {
    @Override
    protected void execute() {
        super.execute();
        robot.drive(0,-1,90,35);
        robot.drive(-1,0,90,33);
        robot.drive(0,1,90,34);
        robot.drive(-1,0,90,29);
        robot.lift(FORWARD);
    }
}
