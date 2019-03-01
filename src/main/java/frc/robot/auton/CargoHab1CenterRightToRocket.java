/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class CargoHab1CenterRightToRocket extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public CargoHab1CenterRightToRocket() {
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

		// Move forward 95 in. (started off on RS) 
		addSequential(new DrivetrainMoveDistance(95));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Move forward 75 in. 
		addSequential(new DrivetrainMoveDistance(75));

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 23 in.  
		addSequential(new DrivetrainMoveDistance(23));

		// turn 90 degrees to the right 
		 addSequential(new DrivetrainMoveDistance(90));

		// Vision delivery (to RRC) 
		addSequential(new HatchPanelDeliver());	

		addSequential(new RightToRocket());
	}
}
