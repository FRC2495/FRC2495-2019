/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class RightToRocket extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public RightToRocket() {
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

		
		// Vision target (RRF1) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 150 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(150));

		// Move back 24 inches
		addSequential(new DrivetrainMoveDistance(-24));

		// Move forward 177 in.
		addSequential(new DrivetrainMoveDistance(177-48)); 

		// (another hatch received from RH)
		addSequential(new HatchPanelPickup());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// Move forward 177 in.
		addSequential(new DrivetrainMoveDistance(177-48)); 

		// Turn 35 to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-35));

		// Vision target (to RRF2) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 150 degrees to the right
		addSequential(new DrivetrainTurnAngleUsingPidController(150));

		// Move forward 177 in.
		addSequential(new DrivetrainMoveDistance(177-48)); 

		// (another hatch received from RH)
		addSequential(new HatchPanelPickup());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// undetermined below 
		
		// Move forward 234 in. 
		addSequential(new DrivetrainMoveDistance(234));

		// Turn 35 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-35));

		// Vision target (to CSR3) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 110 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-110)); 

		// Move forward 258 in.
		addSequential(new DrivetrainMoveDistance(258-48)); 

		// (another hatch received from RH)
		addSequential(new HatchPanelPickup());

		// Move backward 24 in.  
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 113 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(113));

		// Move forward 254 in. 
		addSequential(new DrivetrainMoveDistance(254));

		// Turn 67 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-67));

		// Vision target (to CSR2) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 110 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-110));

		// Move forward 254 in.
		addSequential(new DrivetrainMoveDistance(254-48));

		// (another hatch received from RH) 
		addSequential(new HatchPanelPickup());
		
		// Move backwards 24 in.  
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 116 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-116));

		// Move forward 276 in. 
		addSequential(new DrivetrainMoveDistance(276));

		// Turn 64 degrees to the right  
		addSequential(new DrivetrainTurnAngleUsingPidController(64));

		// Visual delivery (CSR1) 
		addSequential(new HatchPanelDeliver());

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move foward 205 in. (robot is now in front of HAB)
		addSequential(new DrivetrainMoveDistance(205));   
	}
}
