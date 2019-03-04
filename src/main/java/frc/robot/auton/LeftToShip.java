/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class LeftToShip extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public LeftToShip() {
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

		//TODO Add in specfically where to target

		//Pickup hatchpanel
		addSequential(new HatchPanelPickup());

		//Turn around to face the rocket (not precise, but in that direction)
		addSequential(new DrivetrainTurnAngleUsingPidController(AutonConstants.LOADING_TO_SHIP_ANGLE));

/* Commented by Manoj as the Auton strategy has changed
		// Move backwards 24 inches 
		//addSequential(new DrivetrainMoveDistance(-24));

		// Move backward -70 in
		addSequential(new DrivetrainMoveDistance(-70));

		// Turn 90 to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		//move 218 in forward 
		addSequential(new DrivetrainMoveDistance(218));

		//moce 90 to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// move 54 forward 
		addSequential(new DrivetrainMoveDistance(54));

		//moce 90 to the left  
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// (another hatch received by LH)
		addSequential(new HatchPanelPickup());

		// move back 24 
		//

		//turn 90 to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// move 54 forward 
		addSequential(new DrivetrainMoveDistance(54));

		//turn 90 to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		//move 254 in forward 
		addSequential(new DrivetrainMoveDistance(254));

		//turn 90 to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Vision targeting (CSLT) 
		addSequential(new HatchPanelDeliver());

		//move back 70 in
		addSequential(new DrivetrainMoveDistance(-70));

		// turn right 90 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// turn right 90 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// move forward 54 
		addSequential(new DrivetrainMoveDistance(54));

		//turn 90 to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));
		
		// (another hatch received by LH)
		addSequential(new HatchPanelPickup());

		// move backward 128 in 
		addSequential(new DrivetrainMoveDistance(-128));

		// trun 90 to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// move forward 86 
		addSequential(new DrivetrainMoveDistance(86));

		//rotate around 180 (left) 
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// deilver CSLF
		addSequential(new HatchPanelDeliver());

		// move 90 to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// move xxx forward 
		addSequential(new DrivetrainMoveDistance(116));

		// turn 90 left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// move forward 113
		addSequential(new DrivetrainMoveDistance(113));

		// turn right 90 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// move forward 39 in 
		addSequential(new DrivetrainMoveDistance(39));

		// turn 90 left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// (another hatch received by LH)
		addSequential(new HatchPanelPickup());

		// turn 180 (left)
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));

		// move forward xx
		addSequential(new DrivetrainMoveDistance(177));

		//turn 90 right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));
		
		// move forward 24 in
		addSequential(new DrivetrainMoveDistance(24));

		// turn left 90 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// move forward xxx 
		addSequential(new DrivetrainMoveDistance(35));

		// turn left 90 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// deilver RLC1
		addSequential(new HatchPanelDeliver());
		/*
		// Turn 90 degrees to the right 
		//addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 124 in. 
		addSequential(new DrivetrainMoveDistance(124));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 76 in. (to LH)
		addSequential(new DrivetrainMoveDistance(76)); 

		// (another hatch received by LH)
		addSequential(new HatchPanelPickup());

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
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 145 in. 
		addSequential(new DrivetrainMoveDistance(145));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 76 in. (to LH) 
		addSequential(new DrivetrainMoveDistance(76));

		// (another hatch recieved from LH)
		addSequential(new HatchPanelPickup());

		// Move backwards 24 in.  
		//addSequential(new DrivetrainMoveDistance(-24));

		// Turn 180 degrees to the left
		addSequential(new DrivetrainTurnAngleUsingPidController(-180));  

		// Move forward 177 in. 
		addSequential(new DrivetrainMoveDistance(177));

		// ?

		// Move backwards 24 in. 
		//addSequential(new DrivetrainMoveDistance(-24));

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
		//addSequential(new DrivetrainMoveDistance(-24));

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
		 */
	}
}

