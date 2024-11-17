package org.firstinspires.ftc.teamcode.util;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Hardware.RobotHardware;
import org.firstinspires.ftc.teamcode.Subsystems.MotorSubsystem;

@Config
@TeleOp(group ="tele0p")
public class Tele0p extends LinearOpMode {
    private RobotHardware robot= RobotHardware.getInstance();
    private MotorSubsystem motorSub;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        motorSub = new MotorSubsystem(robot);

        waitForStart();
        while (opModeIsActive()) {

            telemetry.update();
        }
    }
}





