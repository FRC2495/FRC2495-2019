/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class CargoHab2RightToShipBay1 extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public CargoHab2RightToShipBay1() {
		final int TURN_DIRECTION = -1;  //When you are on Left side this is 1 and its -1 when on right side.
		final int BAY_TO_LOADING_ADJUSTMENT = -30; //driving diagonaly from cargo ship towards loadingstation, if it is overshoots or under, use this to make adjustments
		double rise;
		double run;
		int bayToLoadingTurnAngle;
		double bayToLoadingDistance;
		//int bayPosition = 1 ;

		//Move straight from Hab2 RS to Bay 1
		//Since the straight line is very close the ship, robot may not turn.  So we will make a slight turn
		//THe full distance to bay is split as a straight path, then turn slightly and then cover the rest of the distance
		
		//Now move straight distance
		addSequential(new DrivetrainMoveDistance(AutonConstants.HAB2_CARGOSHIP_DISTANCE_BEFORE_TURN));

		//Make a slight turn
		addSequential(new DrivetrainTurnAngleUsingPidController(TURN_DIRECTION*AutonConstants.HAB_TO_BAY_ANGLE));
		
		//remainder of the distance
		addSequential(new DrivetrainMoveDistance(AutonConstants.HAB2_CARGOSHIP_BAY1_TOTAL_DISTANCE-AutonConstants.HAB2_CARGOSHIP_DISTANCE_BEFORE_TURN));

		//Turn right to face Bay 1
		//If Robot had gone straight it would have turned 90.  Since it made a slight turn, need to compensate for that too
		addSequential(new DrivetrainTurnAngleUsingPidController(-TURN_DIRECTION*(AutonConstants.HAB_TO_BAY_ANGLE+90)));

		//Deliver cargo.  Will use camera to align and go straight and deliver.
		//Then it will move back 24 inches.
		addSequential(new CargoDeliverShip());

		//Turn towards the Loading Station.   
		//Not eactly pointed to loading station but a few feet in front of it 
		//Calculate the angle turn from 2 feet from Bay (remember hatchpanel deliver will move back 2 feet)
		//...to crossline of Hab2line and line perpendicular to loading station
		//angle of turn is inverse tan (rise/run) -- calculate from center of robot
		rise = AutonConstants.SHIP_TO_LONGSIDE-AutonConstants.LOADINGSTATION_TO_LONGSIDE-AutonConstants.BACKUP_AFTER_DELIVERY-(AutonConstants.ROBOT_LENGTH/2);
		run  = AutonConstants.HAB2_CARGOSHIP_BAY1_TOTAL_DISTANCE;
		bayToLoadingTurnAngle = (int) Math.toDegrees(Math.atan(rise/run));

		addSequential(new DrivetrainTurnAngleUsingPidController(TURN_DIRECTION*(bayToLoadingTurnAngle+90)));

		//Drive torwards loading station.  This is the hypotnuse of the triangle between hab2line, bay1 and crossline 
		bayToLoadingDistance = Math.sqrt(Math.pow(rise,2)+Math.pow(run,2));
		addSequential(new DrivetrainMoveDistance(bayToLoadingDistance+BAY_TO_LOADING_ADJUSTMENT));

		//Turn and face the loading station
		addSequential(new DrivetrainTurnAngleUsingPidController(-TURN_DIRECTION*(bayToLoadingTurnAngle-90)));

		//Now robot is facing the loading station.  
		// Calls the common command RightToShip
		addSequential(new RightToShip());
	}
}
