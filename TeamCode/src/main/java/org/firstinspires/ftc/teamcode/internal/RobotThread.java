package org.firstinspires.ftc.teamcode.internal;

public abstract class RobotThread extends Thread {
    protected Robot robot;

    public RobotThread(Robot robot) {
        this.robot = robot;

        try {
            init();
            start();
        } catch (Exception e) {
            robot.error = e.toString();
            //robot.addTelemetry();
            //robot.opMode.telemetry.update();
        }
    }

    @Override
    public void run() {
        try {
            execute();
        } catch (Exception e) {
            robot.error = e.toString();
            //robot.addTelemetry();
            //robot.opMode.telemetry.update();
        }
    }

    protected void init() throws Exception { }

    protected abstract void execute() throws Exception;
}
