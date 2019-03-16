/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class HatchPanelHab1LeftToRocket extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public HatchPanelHab1LeftToRocket(String autonOption) {
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

		final int TURN_DIRECTION = 1;  //When you are on Left side this is 1 and its -1 when on right side.

		//Robot is at an angle perpendicular to the long side. 
		//This is angle the rocket ship hatch face to the perpendicular line is 61deg.  
		//So turning 61 deg towards the long side will make it perpendicular and then 90 deg turn in the same direction will face loading station.
		//Make adjustment if necessary as the robot will not be facing directly to the loading station.
		//you may want to turn very few deg less if vision target has trouble reaching the loading station.
		int bayToLoadingTurnAngle = 151;  

		double bayToLoadingDistance = 100; //Move to AutonConstant if needed

		//Position robot diagonally facing the rocket near side hatch.  Rough aim at the target
		// moving straight a standard distance before vision targeting
		addSequential(new DrivetrainMoveDistance(AutonConstants.HAB1_CARGOSHIP_DISTANCE_BEFORE_TURN));

		// vision targeting
		addSequential (new HatchPanelDeliver());

		// Turn towards loading bay.     
		addSequential(new DrivetrainTurnAngleUsingPidController(-TURN_DIRECTION*(bayToLoadingTurnAngle)));

		//go towards loading station for an arbitrary distance to be near enough.
		addSequential(new DrivetrainMoveDistance(bayToLoadingDistance));

		//Calls the common command LeftToRocket for the rest of the tasks
		addSequential(new LeftToRocket());		

/*		// Move forward 119 in.  (Started on LS) 
		addSequential(new DrivetrainMoveDistance(119));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 80 in. 
		addSequential(new DrivetrainMoveDistance(80));  

		// Turn 61 degrees to the right  
		addSequential(new DrivetrainTurnAngleUsingPidController(61));

		// Calls the common command LeftToRocket 
		addSequential(new LeftToRocket());		
	*/
	}
}
