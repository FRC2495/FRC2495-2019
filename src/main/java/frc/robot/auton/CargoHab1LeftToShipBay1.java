/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;


public class CargoHab1LeftToShipBay1 extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public CargoHab1LeftToShipBay1() {
	
		//Move straight from Hab1 LS to Bay 1
/*		addSequential(new DrivetrainMoveDistance(195.3));

		//Turn right to face Bay 1
		addSequential(new DrivetrainTurnAngleUsingPidController(90));
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
		// Move foward 133 inches
		addSequential(new DrivetrainMoveDistance(133));

		//Vision Delivery (to CSLF)
		addSequential(new CargoDeliverRocket());

		//Move back 24 inches
		//addSequential(new DrivetrainMoveDistance(-24));

		//Turn 90 degress to the right
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		//Move foward 105 inches foward
		addSequential(new DrivetrainMoveDistance(105));

		//Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		//Move foward 151 inches
		addSequential(new DrivetrainMoveDistance(151));

		//Recieve hatchpanel (from LH)
		addSequential(new HatchPanelPickup());

		//Turn 180 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(180));

		//Move foward 151 inches
		addSequential(new DrivetrainMoveDistance(151));

		//Turn 90 degress to the right
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		//Move foward 105 inches foward
		addSequential(new DrivetrainMoveDistance(105));

		//Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		//Move foward 44 inches 
		addSequential(new DrivetrainMoveDistance(44));

		//Vision Delivery (to CSLF)
		addSequential(new HatchPanelDeliver());
	*/
	}
}
