/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
//import edu.wpi.first.wpilibj.command.TimedCommand;

import frc.robot.sensors.*;

public class HatchPanelDeliver extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public HatchPanelDeliver(int level) {
		// check for target

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

		//addSequential(new DrivetrainTurnUsingCameraPidController());
		//addSequential(new DrivetrainMoveUsingCameraPidControllerWithStallDetection(LimelightCamera.OFFSET_CAMERA_HATCH_INCHES));
		final int MAGIC_DISTANCE_INCHES = 20;
		addSequential(new DrivetrainDriveUsingCamera(LimelightCamera.OFFSET_CAMERA_HATCH_INCHES + MAGIC_DISTANCE_INCHES));
		addSequential(new DrivetrainTurnUsingCameraPidController());

		switch(level){
			default:
			//nothing
			break;

			case 1:
			//addSequential(new ElevatorMoveDown()); // this would be a failure point - we don't do it!
			break;

			case 2:
			//Rocket Level 2
			addSequential(new ElevatorMoveMidway());
			break;

			case 3:
			//Rocket Level 3
			addSequential(new ElevatorMoveUp());
			break;
		}

		//addSequential(new TimedCommand(0.5));

		addSequential(new EjectorRetract()); // we retract only after moving

		addSequential(new DrivetrainMoveDistanceWithStallDetection(MAGIC_DISTANCE_INCHES + 12));

		addSequential(new EjectorExtend()); // we extend back

		addParallel(new HookTimedSwitchDown(2.0));
		addSequential(new DrivetrainMoveDistance(-24));

		addSequential(new EjectorExtend()); // we need to extend back before moving elevator

		if (level == 2 ||  level ==3) {
			addParallel(new ElevatorMoveDown()); // we only move down if needed
		}

		addSequential(new HookSwitchUp()); // forces hook up in case it somehow did not automatically get back up
	}

	public HatchPanelDeliver(){
		this(1);
	}

}
