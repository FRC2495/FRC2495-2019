/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class Hab1LeftToShip extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public Hab1LeftToShip() {
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

		// Move forward 76 in. (started off on LS) 
		addSequential(new DrivetrainMoveDistance(76));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 42 in. 
		addSequential(new DrivetrainMoveDistance(42));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Vision targeting (CSLF) 
		// TODO

		// Reverse 2 ft. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 124 in. 
		addSequential(new DrivetrainMoveDistance(124));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 76 in. (to LH)
		addSequential(new DrivetrainMoveDistance(76)); 

		// ?

		// Reverse 76 in. (from LH) 
		addSequential(new DrivetrainMoveDistance(-76));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 145 in. (to line up with CSRF) 
		addSequential(new DrivetrainMoveDistance(145));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Vision targeting (CSRF) 
		// TODO

		// Reverse 2 ft. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 145 in. 
		addSequential(new DrivetrainMoveDistance(145));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 76 in. (to LH) 
		addSequential(new DrivetrainMoveDistance(76));

		// ?

		// Reverse 2 ft  
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));  

		// Move forward 177 in. 
		addSequential(new DrivetrainMoveDistance(177));

		// ?

		// Reverse 2 ft 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// Move forward 177 in.
		addSequential(new DrivetrainMoveDistance(177));

		// ?

		// Reverse 76 in. 
		addSequential(new DrivetrainMoveDistance(-76));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 124 in. 
		addSequential(new DrivetrainMoveDistance(124));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 106  
		addSequential(new DrivetrainMoveDistance(106));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Reverse 2 ft. 
		addSequential(new DrivetrainMoveDistance(-24));

		// is something missing here?

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 160 in. (is that the right distance?)
		addSequential(new DrivetrainMoveDistance(160));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 76 in. 
		addSequential(new DrivetrainMoveDistance(76));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 230 in. 
		addSequential(new DrivetrainMoveDistance(230));

	}
}
