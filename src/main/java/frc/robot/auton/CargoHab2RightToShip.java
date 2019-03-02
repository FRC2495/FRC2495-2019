/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class CargoHab2RightToShip extends CommandGroup {

	public CargoHab2RightToShip() {
				// move forward 210 in
				addSequential(new DrivetrainMoveDistance(210));

				// turn 90 degrees right
				addSequential(new DrivetrainTurnAngleUsingPidController(90));
				
				// move forward 91in
				addSequential(new DrivetrainMoveDistance(91));

				// |---> vision target RRC1
				addSequential(new HatchPanelDeliver());

				// reverse 24in
				addSequential(new DrivetrainMoveDistance(-24));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 205in
				addSequential(new DrivetrainMoveDistance(205));

				// turn left 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(-90));

				// move forward 24in
				addSequential(new DrivetrainMoveDistance(24));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// |--> version target feeder
				addSequential(new HatchPanelPickup());

				// turn right 180deg
				addSequential(new DrivetrainTurnAngleUsingPidController(180));

				// move forward 210in
				addSequential(new DrivetrainMoveDistance(210));

				// |--> vision target RRF
				// TODO: is this the correct command?
				addSequential(new HatchPanelDeliver());

				// turn right 180deg
				addSequential(new DrivetrainTurnAngleUsingPidController(180));

				// move forward 210in
				addSequential(new DrivetrainMoveDistance(210));

				// |--> vision target feeder (received hatch)
				addSequential(new HatchPanelPickup());

				// turn right 180deg
				// addSequential(new DrivetrainTurnAngleUsingPidController(180));

				// reverse 208in
				addSequential(new DrivetrainMoveDistance(-208));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 106in
				addSequential(new DrivetrainMoveDistance(106));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// |--> vision target CSRF
				addSequential(new HatchPanelDeliver());

				// reverse 24in
				addSequential(new DrivetrainMoveDistance(-24));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 106in
				addSequential(new DrivetrainMoveDistance(106));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 208in
				addSequential(new DrivetrainMoveDistance(208));

				// |--> version target feeder
				addSequential(new HatchPanelPickup());

				// reverse 208in
				addSequential(new DrivetrainMoveDistance(208));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 93in
				addSequential(new DrivetrainMoveDistance(93));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 40in (?)
				addSequential(new DrivetrainMoveDistance(40));

				// turn left 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(-90));

				// |--> vision target CSR3
				addSequential(new HatchPanelDeliver());

				// reverse 40in
				addSequential(new DrivetrainMoveDistance(-40));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 93in
				addSequential(new DrivetrainMoveDistance(93));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 208in
				addSequential(new DrivetrainMoveDistance(208));

				// |--> vision target feeder
				addSequential(new HatchPanelPickup());

				// reverse 208in
				addSequential(new DrivetrainMoveDistance(-208));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 93in
				addSequential(new DrivetrainMoveDistance(93));

				// turn right 90deg
				addSequential(new DrivetrainTurnAngleUsingPidController(90));

				// move forward 44 in
				addSequential(new DrivetrainMoveDistance(44));

				// |--> CSR2
				addSequential(new HatchPanelDeliver());
	}
}
