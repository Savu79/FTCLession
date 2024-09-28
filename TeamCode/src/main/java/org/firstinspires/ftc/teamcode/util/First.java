package org.firstinspires.ftc.teamcode.util;


import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

@Config
@TeleOp(group ="tele0p")
public class First extends LinearOpMode {

    DcMotorEx motor1;
    Servo servo1;

    @Override
    public void runOpMode() throws InterruptedException {

        servo1=hardwareMap.get(Servo.class, "servo1");
        motor1= hardwareMap.get(DcMotorEx.class, "motor1");

        waitForStart();
        while (opModeIsActive()) {

        }
    }
}
