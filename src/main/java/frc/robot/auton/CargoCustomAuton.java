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
	String autonOption;

	/**
	 * Add your docs here.
	 * 
	 * @param startPosition_in starting position
	 * @param mainTarget_in main target
	 * @param cameraOption_in camera option
	 * @param sonarOption_in sonar option
	 * @param release_in release option
	 * @param autonOption_in auton option
	 */
	public CargoCustomAuton(String startPosition_in, String mainTarget_in, String cameraOption_in,	String sonarOption_in, String release_in, String autonOption_in) {

		startPosition = startPosition_in;
		mainTarget = mainTarget_in;
		cameraOption = cameraOption_in;
		sonarOption = sonarOption_in;
		release = release_in;
		autonOption = autonOption_in;

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
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new CargoHab1LeftToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						addSequential(new CargoHab1LeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new CargoHab1LeftToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new CargoHab1LeftToShipBay3());
						break;
					default:
						// nothing
						break;
				}
				break;

			case Robot.START_POSITION_HAB1_CENTER_LEFT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						addSequential(new CargoHab1CenterLeftToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new CargoHab1CenterLeftToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						//addSequential(new CargoHab1CenterLeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						//addSequential(new CargoHab1CenterLeftToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						//addSequential(new CargoHab1CenterLeftToShipBay3());
						break;
					default:
						// nothing
						break;
				}			
				break;

				case Robot.START_POSITION_HAB1_CENTER_RIGHT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						addSequential(new CargoHab1CenterRightToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new CargoHab1CenterRightToShipBay0());
						break;	
					case Robot.MAIN_TARGET_SHIP_BAY1:
						//addSequential(new CargoHab1CenterRightToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						//addSequential(new CargoHab1CenterRightToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						//addSequential(new CargoHab1CenterRightToShipBay3());
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
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new CargoHab1RightToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
		 				addSequential(new CargoHab1RightToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new CargoHab1RightToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new CargoHab1RightToShipBay3());
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
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new CargoHab2LeftToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						addSequential(new CargoHab2LeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new CargoHab2LeftToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new CargoHab2LeftToShipBay3());
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
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new CargoHab2RightToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						addSequential(new CargoHab2RightToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new CargoHab2RightToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new CargoHab2RightToShipBay3());
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
