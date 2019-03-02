/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;


public class CargoHab1LeftToShip extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public CargoHab1LeftToShip() {
	
		addSequential(new DrivetrainMoveDistance(195.3));

		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		addSequential(new HatchPanelDeliver(1));

		addSequential(new DrivetrainTurnAngleUsingPidController(108));

		addSequential(new DrivetrainTurnAngleUsingPidController(-18));

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
