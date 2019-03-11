/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.commands.*;

public class HatchPanelHab1CenterRightToShipBay0 extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public HatchPanelHab1CenterRightToShipBay0(String autonOption) {
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

		final int TURN_DIRECTION = -1;  //When you are on Left side this is 1 and its -1 when on right side.
		final int BAY_TO_LOADING_ADJUSTMENT = -30; //driving diagonaly from cargo ship towards loadingstation, if it is overshoots or under, use this to make adjustments
		double rise;
		double run;
		int bayToLoadingTurnAngle;
		double bayToLoadingDistance;

		// moving forward a standard distance before vision targeting
		addSequential(new DrivetrainMoveDistance(AutonConstants.HAB1_CARGOSHIP_DISTANCE_BEFORE_TURN));

		// vision targeting
		addSequential (new HatchPanelDeliver());

		if(autonOption == Robot.AUTON_OPTION_RELOAD) {
			//Turn towards the Loading Station.   
			//Not eactly pointed to loading station but a few feet in front of it 
			//Calculate the angle turn from 2 feet from Bay (remember hatchpanel deliver will move back 2 feet)
			//...to crossline of Hab1line and line perpendicular to loading station
			//angle of turn is inverse tan (rise/run) -- calculate from center of robot
			rise = AutonConstants.CENTERBAY_TO_LONGSIDE-AutonConstants.LOADINGSTATION_TO_LONGSIDE;
			run = AutonConstants.HAB_TO_CARGOSHIP-AutonConstants.BACKUP_AFTER_DELIVERY-(AutonConstants.ROBOT_LENGTH/2);
			bayToLoadingTurnAngle = (int) Math.toDegrees(Math.atan(rise/run));

			addSequential(new DrivetrainTurnAngleUsingPidController(-TURN_DIRECTION*(180-bayToLoadingTurnAngle)));

			//Drive torwards loading station.  This is the hypothenuse of the triangle between hab2line, bay1 and crossline 
			bayToLoadingDistance = Math.sqrt(Math.pow(rise,2)+Math.pow(run,2));
			addSequential(new DrivetrainMoveDistance(bayToLoadingDistance+BAY_TO_LOADING_ADJUSTMENT));

			//Turn and face the loading station
			addSequential(new DrivetrainTurnAngleUsingPidController(-TURN_DIRECTION*(bayToLoadingTurnAngle)));

			//Now robot is facing the loading station.  
			// Calls the common command LeftToShip
			addSequential(new LeftToShip());
		}
	}
}
