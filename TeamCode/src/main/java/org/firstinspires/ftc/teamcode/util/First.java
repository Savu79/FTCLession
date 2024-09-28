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
    DcMotorEx motor;
    Servo servo1;
    boolean bpress = true;

    @Override
    public void runOpMode() throws InterruptedException {

        servo1=hardwareMap.get(Servo.class, "servo1");
        servo1.setPosition(0);
        motor1= hardwareMap.get(DcMotorEx.class, "motor1");
        motor.setPower(1);

        waitForStart();
        while (opModeIsActive()) {
            if(gamepad1.a){
                if(bpress){
                    servo1.setPosition(1);
                    bpress = false;
                    sleep(1000);
                }
                else {
                    servo1.setPosition(0);
                    bpress = true;
                    sleep(1000);
                }
            }
        }
    }
}