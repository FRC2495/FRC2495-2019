/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class CargoHab2RightToRocket extends CommandGroup {

	public CargoHab2RightToRocket() {
	// move forward 252 in
	addSequential(new DrivetrainMoveDistance(252));

	// turn Right 90
	addSequential(new DrivetrainTurnAngleUsingPidController(90));
	
	// move forward 79 in (original 100)
	addSequential(new DrivetrainMoveDistance(79));

	// vision target RFC1
	addSequential(new CargoDeliverRocket());

	// 
	addSequential(new RightToRocket());
	}
}
