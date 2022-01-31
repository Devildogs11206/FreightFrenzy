package org.firstinspires.ftc.teamcode.internal;

public class TelemetryThread extends RobotThread {
    public TelemetryThread(Robot robot) {
        super(robot);
    }

    @Override
    protected void execute() throws Exception {
        while (!robot.opMode.isStopping()) {
            robot.addTelemetry();
            robot.opMode.telemetry.update();
        }
    }
}
