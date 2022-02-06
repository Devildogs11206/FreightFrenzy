package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.controllers.DriveController;
import org.firstinspires.ftc.teamcode.controllers.ElementLiftController;
import org.firstinspires.ftc.teamcode.controllers.IntakeController;
import org.firstinspires.ftc.teamcode.controllers.LiftController;
import org.firstinspires.ftc.teamcode.controllers.LightsController;
import org.firstinspires.ftc.teamcode.controllers.RecorderController;
import org.firstinspires.ftc.teamcode.controllers.RobotController;

@TeleOp
public class TeleOpMode extends OpMode {
    public TeleOpMode() {
        super(false);
    }

    @Override
    protected void execute() {
        RobotController[] robotControllers = new RobotController[] {
            new RecorderController(this),
            new DriveController(this),
            new LiftController(this),
            new IntakeController(this),
            new ElementLiftController(this),
            new LightsController(this)
        };

        while (isActive()) {
            for (RobotController controller : robotControllers) {
                controller.execute();
            }
        }
    }
}