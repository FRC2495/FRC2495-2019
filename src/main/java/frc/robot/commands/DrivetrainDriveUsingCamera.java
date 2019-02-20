/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

public class DrivetrainDriveUsingCamera extends Command {

	private double offsetCameraTarget;

	// offset should be LimelightCamera.OFFSET_CAMERA_PORT_INCHES or LimelightCamera.OFFSET_CAMERA_HATCH_INCHES
	public DrivetrainDriveUsingCamera(double offset) {

		offsetCameraTarget = offset;

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		System.out.println("DrivetrainDriveUsingCamera: initialize");

		Robot.camera.setOffsetBetweenCameraAndTarget(offsetCameraTarget);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		// note: it is assumed that pidGet/Get2 return up-to-date information
		double pixelDisplacement = Robot.camera.pidGet(); // gets the pixel displacement *FROM*/compared to the target (error to use to turn/steer)
		double distance = Robot.camera.pidGet2(); // gets the distance/position *FROM*/compared to the target (error to use to move)

		double turnPctOutput = -pixelDisplacement * Drivetrain.TURN_USING_CAMERA_PROPORTIONAL_GAIN; // TODO double-check sign
		double movePctOutput = -distance * Drivetrain.MOVE_USING_CAMERA_PROPORTIONAL_GAIN; // TODO double-check sign

		if (Math.abs(pixelDisplacement) < Drivetrain.PIXEL_THRESHOLD)
		{
			turnPctOutput = 0;
		}
		if (Math.abs(turnPctOutput) < Drivetrain.MIN_TURN_USING_CAMERA_PCT_OUTPUT)
		{
			turnPctOutput = Math.signum(turnPctOutput) * Drivetrain.MIN_TURN_USING_CAMERA_PCT_OUTPUT;
		}

		if (Math.abs(distance) < Drivetrain.DISTANCE_THRESHOLD_INCHES)
		{
			movePctOutput = 0;
		}
		if (Math.abs(movePctOutput) < Drivetrain.MIN_MOVE_USING_CAMERA_PCT_OUTPUT)
		{
			movePctOutput = Math.signum(movePctOutput) * Drivetrain.MIN_MOVE_USING_CAMERA_PCT_OUTPUT;
		}

		Robot.drivetrain.arcadeDrive(movePctOutput, turnPctOutput);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false; // we run forever (unless interrupted) TODO add stop condition
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		System.out.println("DrivetrainDriveUsingCamera: end");
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		System.out.println("DrivetrainDriveUsingCamera: interrupted");
		end();
	}
}
