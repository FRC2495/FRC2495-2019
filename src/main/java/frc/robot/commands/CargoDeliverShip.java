/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import frc.robot.sensors.*;

public class CargoDeliverShip extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public CargoDeliverShip() {
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.

		addSequential(new HingeMoveMidway());

		//addSequential(new DrivetrainTurnUsingCameraPidController());
		//addSequential(new DrivetrainMoveUsingCameraPidControllerWithStallDetection(LimelightCamera.OFFSET_CAMERA_PORT_INCHES));
		addSequential(new DrivetrainDriveUsingCamera(LimelightCamera.OFFSET_CAMERA_PORT_INCHES));
		
		addSequential(new ElevatorMoveMidway());

		addSequential(new DrivetrainMoveDistanceWithStallDetection(12)); // TODO consider removing

		addSequential(new GrasperTimedRelease(2));
		addParallel(new HingeMoveUp());  
		addSequential(new DrivetrainMoveDistance(-24 + LimelightCamera.OFFSET_CAMERA_PORT_INCHES-LimelightCamera.OFFSET_CAMERA_HATCH_INCHES));
	
		addSequential(new ElevatorMoveDown());
	}
}
