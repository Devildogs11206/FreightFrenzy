package org.firstinspires.ftc.teamcode.internal;

public class ConfigThread extends RobotThread {
    public ConfigThread(Robot robot) {
        super(robot);
    }

    @Override
    protected void execute() throws Exception {
        while (!robot.opMode.isActive()) {
            //for autonomous delay
            if (robot.opMode.gamepad1.a && robot.opMode.gamepad1.dpad_up && robot.autonomousDelay < 30) {
                robot.autonomousDelay++;
                robot.opMode.sleep(400);
            } else if (robot.opMode.gamepad1.a && robot.opMode.gamepad1.dpad_down && robot.autonomousDelay > 0) {
                robot.autonomousDelay--;
                robot.opMode.sleep(400);
            }

            //for drive power
            if (robot.opMode.gamepad1.b && robot.opMode.gamepad1.dpad_up && robot.drivePower < 1) {
                robot.drivePower += .1;
                robot.opMode.sleep(400);
            } else if (robot.opMode.gamepad1.b && robot.opMode.gamepad1.dpad_down && robot.drivePower > 0) {
                robot.drivePower -= .1;
                robot.opMode.sleep(400);
            }
        }
    }
}
