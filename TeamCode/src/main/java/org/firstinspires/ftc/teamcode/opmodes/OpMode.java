package org.firstinspires.ftc.teamcode.opmodes;

import static org.firstinspires.ftc.teamcode.internal.Alliance.UNKNOWN;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.internal.Alliance;
import org.firstinspires.ftc.teamcode.internal.Robot;

public abstract class OpMode extends LinearOpMode {
    private final boolean calibrate;

    public Robot robot;

    public OpMode() {
        this(true);
    }

    public OpMode(boolean calibrate) {
        this.calibrate = calibrate;
    }

    @Override
    public void runOpMode() {
        robot = new Robot(this);
        robot.init();
        if (calibrate) robot.calibrate();
        waitForStart();
        resetStartTime();
        sleep(Math.max(250, robot.autonomousDelay * 1000));
        robot.start();
        sleep(250);
        execute();
    }

    public boolean isActive() {
        this.yield();
        return opModeIsActive();
    }

    public boolean isStopping() {
        this.yield();
        return isStopRequested() || gamepad1.back || gamepad2.back;
    }

    public String getDetectorFileName() { return null; }

    protected abstract void execute();

    protected Alliance getAlliance() {
        return UNKNOWN;
    }

    private void yield() {
        Thread.yield();
    }
}