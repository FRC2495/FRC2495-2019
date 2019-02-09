/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;

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

		// Turn 90 degrees to the right 

		// Move forward 42 in. 

		// Turn 90 degrees to the left 

		// Vision targeting (CSLF) 

		// Reverse 2 ft. 

		// Turn 90 degrees to the left 

		// Move forward 124 in. 

		// Turn 90 degrees to the left 

		// Move forward 76 in. (to LH) 

		// Reverse 76 in. (from LH) 

		// Turn 90 degrees to the left 

		// Move forward 145 in. (to line up with CSRF)   

		// Turn 90 degrees to the left 

		// Vision targeting (CSRF) 

		// Reverse 2 ft. 

		// Turn 90 degrees to the right 

		// Move forward 145 in. 

		// Turn 90 degrees to the left 

		// Move forward 76 in. (to LH) 

		// Reverse 2 ft  

		// Turn 180 degrees to the left  

		// Move forward 177 in. 

		// Reverse 2 ft 

		// Turn 180 degrees to the left  

		// Move forward 177 in.  

		// Reverse 76 in. 

		// Turn 90 degrees to the left 

		// Move forward 124 in. 

		// Turn 90 degrees to the left 

		// Move forward 106  

		// Turn 90 degrees to the right 

		// Reverse 2 ft. 

		// Turn 90 degrees to the right 

		// Move forward 160 in. 

		// Turn 90 degrees to the right 

		// Move forward 76 in. 

		// Turn 90 degrees to the left 

		// Move forward 230 in. 
	}
}
