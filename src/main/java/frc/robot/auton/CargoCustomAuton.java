/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class CargoCustomAuton extends CommandGroup {

	String startPosition;
	String mainTarget;
	String cameraOption;
	String sonarOption;
	String release;

	/**
	 * Add your docs here.
	 * 
	 * @param startPosition_in starting position
	 * @param mainTarget_in main target
	 * @param cameraOption_in camera option
	 * @param sonarOption_in sonar option
	 * @param release_in release option
	 */
	public CargoCustomAuton(String startPosition_in, String mainTarget_in, String cameraOption_in,	String sonarOption_in, String release_in) {

		startPosition = startPosition_in;
		mainTarget = mainTarget_in;
		cameraOption = cameraOption_in;
		sonarOption = sonarOption_in;
		release = release_in; 

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

		switch (startPosition) {
			case Robot.START_POSITION_HAB1_LEFT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
		            	//addSequential(new CargoHab1LeftToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP:
						//addSequential(new CargoHab1LeftToShip());
						break;	
					default:
						// nothing
						break;
				}
				break;

			case Robot.START_POSITION_HAB1_CENTER_LEFT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						//addSequential(new CargoHab1CenterLeftToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP:
						//addSequential(new CargoHab1CenterLeftToShip());
						break;	
					default:
						// nothing
						break;
				}			
				break;

				case Robot.START_POSITION_HAB1_CENTER_RIGHT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						//addSequential(new CargoHab1CenterRightToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP:
						//addSequential(new CargoHab1CenterRightToShip());
						break;	
					default:
						// nothing
						break;
				}			
				break;
				
			case Robot.START_POSITION_HAB1_RIGHT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
		            	//addSequential(new CargoHab1RightToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP:
		                //addSequential(new CargoHab1RightToShip());
						break;	
					default:
						// nothing
						break;
				}
				break;

			case Robot.START_POSITION_HAB2_LEFT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						//addSequential(new CargoHab2LeftToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP:
						//addSequential(new CargoHab2LeftToShip());
						break;	
					default:
						// nothing
						break;
				}
				break;				

			case Robot.START_POSITION_HAB2_RIGHT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						//addSequential(new CargoHab2RightToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP:
						//addSequential(new CargoHab2RightToShip());
						break;	
					default:
						// nothing
						break;
				}
				break;

			default:
				// nothing
				break;
		} // end switch
	}
}