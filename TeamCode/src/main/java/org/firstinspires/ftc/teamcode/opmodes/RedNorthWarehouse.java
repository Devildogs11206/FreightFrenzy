package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RedNorthWarehouse extends BlueNorth {
    @Override
    protected void execute() {
        super.execute();

        robot.drive(-1,0,90,60);
        robot.lift(FORWARD);
    }
}
