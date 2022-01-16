package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.IntakeMode.OUT;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class Calibrate extends BlueOpMode {
    @Override
    protected void execute() {
       robot.lift(HIGHGOAL);
       robot.start();
    }
}
