package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.CAROUSEL;
import static org.firstinspires.ftc.teamcode.internal.Robot.LiftPosition.HIGHGOAL;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class LiftTest extends BlueOpMode {
    @Override
    protected void execute() {
       robot.lift(CAROUSEL);
    }
}
