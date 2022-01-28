package org.firstinspires.ftc.teamcode.internal;

import org.firstinspires.ftc.teamcode.opmodes.OpMode;

public class TelemetryThread extends Thread {
    private OpMode opMode;
    private Robot robot;

    public TelemetryThread(OpMode opMode, Robot robot) {
        this.opMode = opMode;
        this.robot = robot;
    }

    @Override public void run() {
        while (!opMode.isStopping()) {
            robot.addTelemetry();
            opMode.telemetry.update();
        }
    }
}
