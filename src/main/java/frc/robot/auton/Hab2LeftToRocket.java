/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;

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

		// Turn 90 degrees to the left 

		// Move forward 70 in.   

		// Turn 45 degrees to the right  

		// Vision delivery (to RLF1) 

		// Turn 135 degrees to the left 

		// Move forward 177 in.  (another hatch received from LH) 

		// Move backwards 24 in. 

		// Turn 180 degrees to the left  

		// Move forward 177 in.  

		// Vision delivery (to RLF2) 

		// Move backwards 24 in. 

		// Turn 180 degrees to the left 

		// Move forward 177 in. (another hatch received from LH) 

		// Move backwards 24 in. 

		// Turn 145 degrees to the left 

		// Move 258 in. forward  

		// Turn 35 degrees to the right  

		// Vision target (to CSL3) 

		// Move backwards 24 in. 

		// Turn 110 degrees to the right  

		// Move forward 258 in. (another hatch received from LH) 

		// Move backwards 24 in. 

		// Turn 113 degrees to the left 

		// Move forward 278 in.  

		// Turn 67 degrees to the right  

		// Vision target (to CSL2) 

		// Move backwards 24 in. 

		// Turn 110 degrees to the right 

		// Move forward 254 in. (received another hatch from LH) 

		// Move backwards 24 in. 

		// Turn 116 degrees to the right 

		// Move forward 276 in.  

		// Turn 64 degrees to the right 

		// Visual targeting (to CSL1) 

		// Move backwards 24 in. 

		// Turn 90 degrees to the right 

		// Move forward 205 in. (robot is now in front of HAB) 
	}
}
