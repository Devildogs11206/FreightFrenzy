package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous

public class slowStrafeTest extends OpMode {
    public void execute() {
        robot.drivePower = .1;
        robot.drive(0,1,0,12);
    }
}