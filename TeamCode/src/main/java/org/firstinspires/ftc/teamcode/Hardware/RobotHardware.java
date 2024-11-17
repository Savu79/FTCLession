package org.firstinspires.ftc.teamcode.Hardware;



import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;
@Config
public class RobotHardware {


    public DcMotorEx motor1;
    public DcMotorEx motor2;
    public Servo servo1;

    private static RobotHardware instance = null;

    public boolean enabled;

    public static RobotHardware getInstance() {
        if (instance == null) {
            instance = new RobotHardware();
        }
        instance.enabled = true;
        return instance;
    }
    public void init(HardwareMap hardwareMap) {
        //TODO declaram motoare
        servo1=hardwareMap.get(Servo.class, "servo1");
        servo1.setPosition(0);
        motor1=hardwareMap.get(DcMotorEx.class, "motor1");
        motor1.setPower(0);
        motor2=hardwareMap.get(DcMotorEx.class, "motor2");

    }

    public void loop() {

    }

    public void read() {
//        try {
//            intake.read();
//        } catch (Exception ignored) {
    }

    public void write() {
//            try {
//                intake.write();
//            } catch (Exception ignored){}
    }
}
