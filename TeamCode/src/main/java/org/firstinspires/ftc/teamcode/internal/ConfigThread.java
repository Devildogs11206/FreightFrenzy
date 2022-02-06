package org.firstinspires.ftc.teamcode.internal;

public class ConfigThread extends RobotThread {
    public ConfigThread(Robot robot) {
        super(robot);
    }

    @Override
    protected void execute() throws Exception {
        while (!robot.opMode.isActive()) {
            if (robot.opMode.gamepad1.a && robot.opMode.gamepad1.dpad_up && robot.autonomousDelay < 30) {
                robot.autonomousDelay++;
                robot.opMode.sleep(400);
            } else if (robot.opMode.gamepad1.a && robot.opMode.gamepad1.dpad_down && robot.autonomousDelay > 0) {
                robot.autonomousDelay--;
                robot.opMode.sleep(400);
            }
        }
    }
}
