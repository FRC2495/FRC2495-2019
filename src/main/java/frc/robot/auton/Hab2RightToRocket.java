/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Hab2RightToRocket extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public Hab2RightToRocket() {
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

		// Move forward 125 in. (started off on RS) 

		// Turn 90 degrees to the right 

		// Move forward 70 in. 

		// Turn 45 degrees to the left 

		// Vision target (RRF1) 

		// Move backwards 24 in. 

		// Turn 135 degrees to the right 

		// Move forward 177 in. (another hatch received from RH) 

		// Move backwards 24 in. 

		// Turn 180 degrees 

		// Move forward 177 in. 

		// Vision target (to RRF2) 

		// Move backwards 24 in. 

		// Turn 180 degrees 

		// Move forward 177 in. (another hatch received from RH) 

		// Move backwards 24 in. 

		// Turn 145 degrees to the right  

		// Move forward 234 in. 

		// Turn 35 degrees to the left 

		// Vision target (to CSR3) 

		// Move backwards 24 in. 

		// Turn 110 degrees to the left 

		// Move forward 250 in. (another hatch received form RH) 

		// Move backward 24 in.  

		// Turn 113 degrees to the right 

		// Move forward 254 in. 

		// Turn 67 degrees to the left 

		// Vision target (to CSR2) 

		// Move backwards 24 in. 

		// Turn 110 degrees to the left 

		// Move forward 254 in. (another hatch received from RH) 

		// Move backwards 24 in.  

		// Turn 116 degrees to the left 

		// Move forward 276 in. 

		// Turn 64 degrees to the right  

		// Visual delivery (CSL1) 

		// Move backwards 24 in. 

		// Turn 90 degrees to the left  

		// Move fow205 in. (robot is now in front of HAB)   
	}
}
