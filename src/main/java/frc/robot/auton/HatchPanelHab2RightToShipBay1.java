/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;
import frc.robot.auton.AutonConstants;

public class HatchPanelHab2RightToShipBay1 extends CommandGroup {
	/**
	 * Add your docs here.
	 */
	public HatchPanelHab2RightToShipBay1(String autonOption) {
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
		//int bayPosition = 1 ;

		//Move straight from Hab2 RS to Bay 1
		//Since the straight line is very close the ship, robot may not turn.  So we will make a slight turn
		//THe full distance to bay is split as a straight path, then turn slightly and then cover the rest of the distance
		
		// sets the initial heading as the first known heading
		addSequential(new GyroReset());
		
		//Now move straight distance
		addSequential(new DrivetrainMoveDistance(AutonConstants.HAB2_CARGOSHIP_DISTANCE_BEFORE_TURN));

		//straighten robot after jump
		addSequential(new DrivetrainTurnToPreviousKnownHeadingUsingPidController());
		
		//Make a slight turn
		addSequential(new DrivetrainTurnAngleUsingPidController(-TURN_DIRECTION*AutonConstants.HAB_TO_BAY_ANGLE));
		
		//remainder of the distance
		addSequential(new DrivetrainMoveDistanceHighSpeed((AutonConstants.HAB2_CARGOSHIP_BAY1_TOTAL_DISTANCE-AutonConstants.HAB2_CARGOSHIP_DISTANCE_BEFORE_TURN)/Math.cos(Math.toRadians(AutonConstants.HAB_TO_BAY_ANGLE))));

		//Turn right to face Bay 1
		//If Robot had gone straight it would have turned 90.  Since it made a slight turn, need to compensate for that too
		addSequential(new DrivetrainTurnAngleUsingPidController(TURN_DIRECTION*(AutonConstants.HAB_TO_BAY_ANGLE+90)));

		//Deliver hatch panel.  Will use camera to align and go straight and deliver.
		//Then it will move back 24 inches.
		addSequential(new HatchPanelDeliver());

		//Turn towards the Loading Station.   
		//Not eactly pointed to loading station but a few feet in front of it 
		//Calculate the angle turn from 2 feet from Bay (remember hatchpanel deliver will move back 2 feet)
		//...to crossline of Hab2line and line perpendicular to loading station
		//angle of turn is inverse tan (rise/run) -- calculate from center of robot
		rise = AutonConstants.SHIP_TO_LONGSIDE-AutonConstants.LOADINGSTATION_TO_LONGSIDE-AutonConstants.BACKUP_AFTER_DELIVERY-(AutonConstants.ROBOT_LENGTH/2);
		run = AutonConstants.HAB2_CARGOSHIP_BAY1_TOTAL_DISTANCE;
		bayToLoadingTurnAngle = (int) Math.toDegrees(Math.atan(rise/run));

		addSequential(new DrivetrainTurnAngleUsingPidController(TURN_DIRECTION*(bayToLoadingTurnAngle+90)));


		//Drive torwards loading station.  This is the hypotnuse of the triangle between hab2line, bay1 and crossline 
		bayToLoadingDistance = Math.sqrt(Math.pow(rise,2)+Math.pow(run,2));
		addSequential(new DrivetrainMoveDistance(bayToLoadingDistance+BAY_TO_LOADING_ADJUSTMENT));

		//Turn and face the loading station
		addSequential(new DrivetrainTurnAngleUsingPidController(-TURN_DIRECTION*(bayToLoadingTurnAngle)));

		//Now robot is facing the loading station.  
		// Calls the common command RightToShip
		addSequential(new RightToShip());


		//Drive some distance, until limelight can comfortably see the target
		/*addSequential(new DrivetrainMoveDistance(100));
		
		//Go deliver the hatchpanel at level 1.  Adjust the path to taget using vision
		addSequential(new HatchPanelDeliver(1));

		//Turn around to face the loading station (not precise, but in that direction)
		addSequential(new DrivetrainTurnAngleUsingPidController(180));

		//Drive some distance, until limelight can comfortably see the target
		addSequential(new DrivetrainMoveDistance(100));

		//Go pickup the hatchpanel.  Adjust the path to taget using vision
		addSequential(new HatchPanelPickup());

		/* Move forward 88 in. (from RS) 
		addSequential(new DrivetrainMoveDistance(88));		

		// Turn 90 degrees to the left 
		addSequential(new DrivetrainTurnAngleUsingPidController(-90));

		// Move forward 42 in. 
		addSequential(new DrivetrainMoveDistance(42));

		// Turn 90 degrees to the right 
		addSequential(new DrivetrainTurnAngleUsingPidController(90));

		// Vision Target
		addSequential(new HatchPanelDeliver());

		// moving forward 133 in.
		addSequential(new DrivetrainMoveDistance(133));

		// vision targeting
		addSequential (new HatchPanelDeliver());
		
		// Calls the common command RightToShips
		addSequential(new RightToShip());*/
	}
}
