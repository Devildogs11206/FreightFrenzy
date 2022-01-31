package org.firstinspires.ftc.teamcode.internal;

public abstract class RobotThread extends Thread {
    protected Robot robot;

    public RobotThread(Robot robot) {
        this.robot = robot;

        try {
            init();
        } catch (Exception e) {
            robot.error = e.toString();
        }
    }

    @Override
    public void run() {
        try {
            execute();
        } catch (Exception e) {
            robot.error = e.toString();
        }
    }

    protected void init() throws Exception { }

    protected abstract void execute() throws Exception;
}
