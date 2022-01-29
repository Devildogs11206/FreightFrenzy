package org.firstinspires.ftc.teamcode.internal;

public class TelemetryThread extends RobotThread {
    public TelemetryThread(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        while (!robot.opMode.isStopping()) {
            robot.addTelemetry();
            robot.opMode.telemetry.update();
        }
    }
}
