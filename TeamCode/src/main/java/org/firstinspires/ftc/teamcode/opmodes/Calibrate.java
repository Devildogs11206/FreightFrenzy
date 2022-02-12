package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class Calibrate extends OpMode {
    @Override
    protected void execute() {
       robot.calibrate();
    }
}
