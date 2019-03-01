/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class LeftToRocket extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public LeftToRocket() {
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

		//TO DO find a way back in front of the HAB

		
		// Vision delivery (to RLF1) 
		addSequential(new HatchPanelDeliver());

		// Move 24 inches back
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 61 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-61));

		// Move forward 13 in.  
		addSequential(new DrivetrainMoveDistance(13)); 

		//Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		//Move foward 136 inches
		addSequential(new DrivetrainMoveDistance(136));

		// (another hatch received from LH)
		addSequential(new HatchPanelPickup()); 

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Move backwards 136 inches
		addSequential(new DrivetrainMoveDistance(-136));

		// Turn 90 degrees to the right  
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move backwards 13 in.  
		addSequential(new DrivetrainMoveDistance(13));

		//Turn 61 degrees to the right
		addSequential(new DrivetrainTurnAngleUsingPidController(61));

		// Vision delivery (to RLF2) 
		addSequential(new HatchPanelDeliver()); 

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 61 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-61));

		// Move forward 13 in.
		addSequential(new DrivetrainMoveDistance(13));

		// Turn 90 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move foward 136 inches 
		addSequential(new DrivetrainMoveDistance(136));

		// (another hatch received from LH)
		addSequential(new HatchPanelPickup());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Move back 136 inches 
		addSequential(new DrivetrainMoveDistance(136));

		// Turn 90 degrees to the right
		addSequential(new DrivetrainTurnAngleUsingPidController(90)); 

		// Move 13 in.forward 
		addSequential(new DrivetrainMoveDistance(13));

		// Turn 90 degrees to the right
		addSequential(new DrivetrainTurnAngleUsingPidController(90)); 
		
		// Move foward 106 inches
		addSequential(new DrivetrainMoveDistance(106));

		// Turn 90 degreesto the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move foward 64 inches
		addSequential(new DrivetrainMoveDistance(64));

		// Vision target (to CSL3) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		// addSequential(new DrivetrainMoveDistance(-24));

		// Move backwards 64 inches
		addSequential(new DrivetrainMoveDistance(-64));

		// Turn 90 degrees to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 13 in. 
		addSequential(new DrivetrainMoveDistance(13));

		// Turn 90 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move foward 136 inches 
		addSequential(new DrivetrainMoveDistance(136));

		// (another hatch received from LH)
		addSequential(new HatchPanelPickup());

		// Move backwards 24 in. 
		// addSequential(new DrivetrainMoveDistance(-24));

		// Move backwards 136 inches 
		addSequential(new DrivetrainMoveDistance(-136));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move backwards 13 in.
		addSequential(new DrivetrainMoveDistance(-13));

		// Turn 90 degrees to the right  
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move foward 127 inches 
		addSequential(new DrivetrainMoveDistance(127));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move foward 64 inches 
		addSequential(new DrivetrainMoveDistance(64));

		// Vision target (to CSL2) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		// addSequential(new DrivetrainMoveDistance(-24));

		// Move backwards 64 inches 
		addSequential(new DrivetrainMoveDistance(-64));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move backwards 127 in.
		addSequential(new DrivetrainMoveDistance(127)); 

		// Turn 90 degrees to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 13 in. 
		addSequential(new DrivetrainMoveDistance(13));

		// Turn 90 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move foward 136 inches 
		addSequential(new DrivetrainMoveDistance(136));

		// (received another hatch from LH)
		addSequential(new HatchPanelPickup());

		// Move backwards 24 in. 
		// addSequential(new DrivetrainMoveDistance(-24));

		// Move backwards 136 inches 
		addSequential(new DrivetrainMoveDistance(-136));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 13 in.
		addSequential(new DrivetrainMoveDistance(13));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move foward 149 inches
		addSequential(new DrivetrainMoveDistance(149));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move foward 64 inches 
		addSequential(new DrivetrainMoveDistance(64));

		// Visual targeting (to CSL1) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		// addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 205 in. (robot is now in front of HAB)
		addSequential(new DrivetrainMoveDistance(205)); 
	}
}
