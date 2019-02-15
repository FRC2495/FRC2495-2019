/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class Hab2LeftToShip extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public Hab2LeftToShip() {
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

		// Vision targeting (CRLF) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 inches 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 124 in. 
		addSequential(new DrivetrainMoveDistance(124));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 76 in. (to LH)
		addSequential(new DrivetrainMoveDistance(76)); 

		// (another hatch received by LH)

		// Reverse 76 in. (from LH) 
		addSequential(new DrivetrainMoveDistance(-76));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 145 in. (to line up with CSRF) 
		addSequential(new DrivetrainMoveDistance(145));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Vision targeting (CSLF) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 145 in. 
		addSequential(new DrivetrainMoveDistance(145));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 76 in. (to LH) 
		addSequential(new DrivetrainMoveDistance(76));

		// (another hatch recieved from LH)

		// Move backwards 24 in.  
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));  

		// Move forward 177 in. 
		addSequential(new DrivetrainMoveDistance(177));

		// ?

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// Move forward 177 in.
		addSequential(new DrivetrainMoveDistance(177));

		// ?

		// Move backwards 76 in. 
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

		// ??

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// another step is missing, will fix when recieved
		//(lines 144 through 152 need to be changed when correct info is given)

		// Move forward 160 in. 
		addSequential(new DrivetrainMoveDistance(160));

		// Turn 90 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 145 in. 
		addSequential(new DrivetrainMoveDistance(145));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 76 in. 
		addSequential(new DrivetrainMoveDistance(76));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));
		
		// Move forward 230 in. 
		addSequential(new DrivetrainMoveDistance(230));
	}
}
