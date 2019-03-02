/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class HatchPanelHab1LeftToShip extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public HatchPanelHab1LeftToShip() {
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

		//Move straight from Hab1 LS to Bay 1
		addSequential(new DrivetrainMoveDistance(100));

		addSequential(new DrivetrainTurnAngleUsingPidController(-15));
		
		addSequential(new DrivetrainMoveDistance(95.3));

		//Turn right to face Bay 1
		addSequential(new DrivetrainTurnAngleUsingPidController(105));
/*
		//Deliver hatch panel
		addSequential(new HatchPanelDeliver(1));

		//Turn towards the Loading Station.   
		//Not eactly pointed to loading station but 1-2 feet in front of it 
		//so the straight drive can help correct any misalignments
		addSequential(new DrivetrainTurnAngleUsingPidController(108));

		//Drive torwards loading station 
		addSequential(new DrivetrainMoveDistance(205));

		//Turn and face the loading station
		addSequential(new DrivetrainTurnAngleUsingPidController(-18));

		//Pickup hatchpanel
		addSequential(new HatchPanelPickup());

		//Turn around to face the rocket (not precise, but in that direction)
		addSequential(new DrivetrainTurnAngleUsingPidController(180));

		//Drive some distance, until limelight can comfortably see the target
		addSequential(new DrivetrainMoveDistance(100));
		
		//Go deliver the hatchpanel at level 1.  Adjust the path to taget using vision
		addSequential(new HatchPanelDeliver(1));

		//Turn around to face the loading station (not precise, but in that direction)
		addSequential(new DrivetrainTurnAngleUsingPidController(180));

		//Drive some distance, until limelight can comfortably see the target
		addSequential(new DrivetrainMoveDistance(100));

		//Go pickup the hatchpanel.  Adjust the path to taget using vision
		addSequential(new HatchPanelPickup());

	/* Manoj: Commenting below as the path suggestion has changed.
		
		// moving forward 164 in.
		addSequential(new DrivetrainMoveDistance(116));

		// turn 90 to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// move forward 12 inch 
		addSequential(new DrivetrainMoveDistance(12));

		// turn 90 to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// mode forward 29 
		addSequential(new DrivetrainMoveDistance(29));

		// trun 90 to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));
		
		// vision targeting
		addSequential (new HatchPanelDeliver());
		
		// Calls the common command LeftToShip
		addSequential(new LeftToShip());
	*/
	}
}
