/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class SuckerSuck extends CommandGroup {

	final double TIMEOUT_INHALE_FAST_S = 0.2;
	final double TIMEOUT_EXHALE_FAST_S =  0.2;  
	final int FAST_ITERATIONS = 15;

	final double TIMEOUT_INHALE_SLOW_S = 0.5;
	final double TIMEOUT_EXHALE_SLOW_S =  0.5;  
	final int SLOW_ITERATIONS = 25;

	/**
	 * Add your docs here.
	 */
	public SuckerSuck() {

		for (int i = 0; i < FAST_ITERATIONS; i++)
		{
			addSequential(new SuckerExhale());
			addSequential(new WaitCommand(TIMEOUT_EXHALE_FAST_S));
			addSequential(new SuckerInhale());
			addSequential(new WaitCommand(TIMEOUT_INHALE_FAST_S));
		}

		for (int i = 0; i < SLOW_ITERATIONS; i++)
		{
			addSequential(new SuckerExhale());
			addSequential(new WaitCommand(TIMEOUT_EXHALE_SLOW_S));
			addSequential(new SuckerInhale());
			addSequential(new WaitCommand(TIMEOUT_INHALE_SLOW_S));
		}		
	}
}
