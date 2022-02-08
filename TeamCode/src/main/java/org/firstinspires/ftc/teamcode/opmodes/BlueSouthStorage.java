package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.FORWARD;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class BlueSouthStorage extends BlueSouth {
    @Override
    protected void execute() {
        super.execute();
        robot.drive(-1, 0, +180, 11);
        robot.lift(FORWARD);
    }
}
