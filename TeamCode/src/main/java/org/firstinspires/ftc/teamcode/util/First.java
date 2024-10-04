package org.firstinspires.ftc.teamcode.util;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

@Config
@TeleOp(group ="tele0p")
public class First extends LinearOpMode {

    DcMotorEx motor1;
    DcMotorEx motor2;
    Servo servo1;
    boolean bpress = true;
    double dpress=0;

    @Override
    public void runOpMode() throws InterruptedException {

        servo1=hardwareMap.get(Servo.class, "servo1");
        servo1.setPosition(0);
        motor1=hardwareMap.get(DcMotorEx.class, "motor1");
        motor1.setPower(0);
        motor2=hardwareMap.get(DcMotorEx.class, "motor2");


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
            motor1.setPower(gamepad1.right_trigger - gamepad1.left_trigger);
            motor2.setPower(dpress);
            if(gamepad1.dpad_right)
            {
                dpress=1;
            } else if (gamepad1.dpad_left) {
                dpress=-1;
            } else if (gamepad1.dpad_down) {
                dpress=0;
            }

        }
    }
}