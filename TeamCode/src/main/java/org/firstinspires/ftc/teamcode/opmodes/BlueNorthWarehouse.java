package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class BlueNorthWarehouse extends BlueNorth {
    @Override
    protected void execute() {
        super.execute();

        robot.drive(-2,0,-90,60);
        robot.lift(FORWARD);
    }
}
