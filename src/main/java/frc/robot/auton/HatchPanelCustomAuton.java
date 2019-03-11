/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class HatchPanelCustomAuton extends CommandGroup {

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
	public HatchPanelCustomAuton(String startPosition_in, String mainTarget_in, String cameraOption_in,	String sonarOption_in, String release_in, String autonOption_in) {

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
						addSequential(new HatchPanelHab1LeftToRocket(autonOption));
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new HatchPanelHab1LeftToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						addSequential(new HatchPanelHab1LeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new HatchPanelHab1LeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new HatchPanelHab1LeftToShipBay2());
						break;
					default:
						// nothing
						break;
				}
				break;

			case Robot.START_POSITION_HAB1_CENTER_LEFT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						//addSequential(new HatchPanelHab1CenterLeftToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						addSequential(new HatchPanelHab1CenterLeftToShipBay0(autonOption));
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						//addSequential(new HatchPanelHab1CenterLeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						//addSequential(new HatchPanelHab1CenterLeftToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						//addSequential(new HatchPanelHab1CenterLeftToShipbay3());
						break;
					default:
						// nothing
						break;
				}			
				break;

				case Robot.START_POSITION_HAB1_CENTER_RIGHT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						//addSequential(new HatchPanelHab1CenterRightToRocket());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						addSequential(new HatchPanelHab1CenterRightToShipBay0(autonOption));
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						//addSequential(new HatchPanelHab1CenterRightToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						//addSequential(new HatchPanelHab1CenterRightToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						//addSequential(new HatchPanelHab1CenterRightToShipBay3());
						break;
					default:
						// nothing
						break;
				}			
				break;
				
			case Robot.START_POSITION_HAB1_RIGHT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						addSequential(new HatchPanelHab1RightToRocket(autonOption));
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new HatchPanelHab1RightToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						addSequential(new HatchPanelHab1RightToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new HatchPanelHab1RightToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new HatchPanelHab1RightToShipBay3());
						break;	
					default:
						// nothing
						break;
				}
				break;

			case Robot.START_POSITION_HAB2_LEFT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						addSequential(new HatchPanelHab2LeftToRocket(autonOption));
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new HatchPanelHab2LeftToShipBay0());
						break;	
					case Robot.MAIN_TARGET_SHIP_BAY1:
						addSequential(new HatchPanelHab2LeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new HatchPanelHab2LeftToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new HatchPanelHab2LeftToShipBay2());
						break;
					default:
						// nothing
						break;
				}
				break;				

			case Robot.START_POSITION_HAB2_RIGHT:
				switch (mainTarget) {
					case Robot.MAIN_TARGET_ROCKET:
						addSequential(new HatchPanelHab2RightToRocket(autonOption));
						break;
					case Robot.MAIN_TARGET_SHIP_BAY0:
						//addSequential(new HatchPanelHab2RightToShipBay0());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY1:
						addSequential(new HatchPanelHab2RightToShipBay1());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY2:
						addSequential(new HatchPanelHab2RightToShipBay2());
						break;
					case Robot.MAIN_TARGET_SHIP_BAY3:
						addSequential(new HatchPanelHab2RightToShipBay3());
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
