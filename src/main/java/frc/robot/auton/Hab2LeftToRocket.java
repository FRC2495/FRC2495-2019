/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class Hab2LeftToRocket extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public Hab2LeftToRocket() {
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

		// Move forward 125 in.  (Started on LS) 
		addSequential(new DrivetrainMoveDistance(125));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 70 in. 
		addSequential(new DrivetrainMoveDistance(70));  

		// Turn 45 degrees to the right  
		addSequential(new DrivetrainTurnAngleUsingPidController(45));

		// Vision delivery (to RLF1) 
		// TODO

		// Turn 135 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-135));

		// Move forward 177 in.  
		addSequential(new DrivetrainMoveDistance(177)); 

		// (another hatch received from LH)

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(24));

		// Turn 180 degrees to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// Move forward 177 in.  
		addSequential(new DrivetrainMoveDistance(177));

		// Vision delivery (to RLF2) 
		// TODO

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// Move forward 177 in.
		addSequential(new DrivetrainMoveDistance(177));

		// (another hatch received from LH)

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 145 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-145)); 

		// Move 258 in. forward  
		addSequential(new DrivetrainMoveDistance(258));

		// Turn 35 degrees to the right
		addSequential(new DrivetrainTurnAngleUsingPidController(35));  

		// Vision target (to CSL3) 
		// TODO

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 110 degrees to the right  
		addSequential(new DrivetrainTurnAngleUsingPidController(110));

		// Move forward 258 in.
		addSequential(new DrivetrainMoveDistance(258));

		// (another hatch received from LH)

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 113 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-113));

		// Move forward 278 in.  
		addSequential(new DrivetrainMoveDistance(278));

		// Turn 67 degrees to the right  
		addSequential(new DrivetrainTurnAngleUsingPidController(67));

		// Vision target (to CSL2) 
		// TODO

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 110 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(-110));

		// Move forward 254 in.
		addSequential(new DrivetrainMoveDistance(254)); 

		// (received another hatch from LH)

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 116 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(116));

		// Move forward 276 in.
		addSequential(new DrivetrainMoveDistance(276));

		// Turn 64 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(64));

		// Visual targeting (to CSL1) 
		// TODO

		// Move backwards 24 in. 
		addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 205 in. (robot is now in front of HAB)
		addSequential(new DrivetrainMoveDistance(205)); 
	}
}
