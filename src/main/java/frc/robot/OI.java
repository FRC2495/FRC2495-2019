// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

import frc.robot.commands.*;
import frc.robot.Ports;
import frc.robot.ControllerBase;
import frc.robot.util.GamepadAxis;
import frc.robot.sensors.LimelightCamera;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released  and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());


	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public JoystickButton joyLeftBtn2;
	public JoystickButton joyLeftBtn3;
	public JoystickButton joyLeftBtn4;
	public JoystickButton joyLeftBtn5;
	public JoystickButton joyLeftBtn6;
	public JoystickButton joyLeftBtn7;
	public JoystickButton joyLeftBtn8;
	public JoystickButton joyLeftBtn9;
	public JoystickButton joyLeftBtn10;
	public JoystickButton joyLeftBtn11;
	public Joystick joyLeft;

	public JoystickButton joyRightBtn2;
	public JoystickButton joyRightBtn3;
	public JoystickButton joyRightBtn4;
	public JoystickButton joyRightBtn5;
	public JoystickButton joyRightBtn6;
	public JoystickButton joyRightBtn7;
	public JoystickButton joyRightBtn8;
	public JoystickButton joyRightBtn9;
	public JoystickButton joyRightBtn10;
	public JoystickButton joyRightBtn11;
	public Joystick joyRight;

	public JoystickButton gamepadA;
	public JoystickButton gamepadB;
	public JoystickButton gamepadX;
	public JoystickButton gamepadY;
	public JoystickButton gamepadLB;
	public JoystickButton gamepadRB;
	public JoystickButton gamepadBack;
	public JoystickButton gamePadStart;
	public JoystickButton gamepadLS;
	public JoystickButton gamepadRS;
	public GamepadAxis gamepadLXp;
	public GamepadAxis gamepadLXn;
	public GamepadAxis gamepadLYp;
	public GamepadAxis gamepadLYn;
	public GamepadAxis gamepadLT;
	public GamepadAxis gamepadRT;
	public GamepadAxis gamepadRXp;
	public GamepadAxis gamepadRXn;
	public GamepadAxis gamepadRYp;
	public GamepadAxis gamepadRYn;
	public Joystick gamepad;
	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	public OI() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

		gamepad = new Joystick(Ports.USB.GAMEPAD);

		gamepadRYp = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.RY);
		gamepadRYp.whenPressed(new HingeMoveUp());

		gamepadRYn = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.RY,false);
		gamepadRYn.whenPressed(new HingeMoveUp());

		gamepadRXp = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.RX);
		gamepadRXp.whenPressed(new HingeMoveUp());

		gamepadRXn = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.RX,false);
		gamepadRXn.whenPressed(new HingeMoveUp());

		gamepadRT = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.RT);
		//gamepadRT.whenPressed(new HingeMoveDown());
		gamepadRT.whenPressed(new HingeDownWithEjectorRetracted());

		gamepadLT = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.LT);
		gamepadLT.whenPressed(new ElevatorMoveDown()); // always fully down regardless of hinge position
		//gamepadLT.whenPressed(new IfCargoPotentiallyLoaded(new ElevatorMoveDownPlus(),new ElevatorMoveDown()));

		gamepadLYp = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.LY);
		//gamepadLYp.whenPressed(new ElevatorMoveUp());
		gamepadLYp.whenPressed(new IfCargoPotentiallyLoaded(new ElevatorMoveUp/*Plus*/(),new ElevatorMoveUp()));

		gamepadLYn = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.LY,false);
		//gamepadLYn.whenPressed(new ElevatorMoveUp());
		gamepadLYn.whenPressed(new IfCargoPotentiallyLoaded(new ElevatorMoveUp/*Plus*/(),new ElevatorMoveUp()));

		gamepadLXp = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.LX);
		//gamepadLXp.whenPressed(new ElevatorMoveUp());
		gamepadLXp.whenPressed(new IfCargoPotentiallyLoaded(new ElevatorMoveUp/*Plus*/(),new ElevatorMoveUp()));

		gamepadLXn = new GamepadAxis(gamepad, ControllerBase.GamepadAxes.LX,false);
		//gamepadLXn.whenPressed(new ElevatorMoveUp());
		gamepadLXn.whenPressed(new IfCargoPotentiallyLoaded(new ElevatorMoveUp/*Plus*/(),new ElevatorMoveUp()));
		
		
		gamepadRS = new JoystickButton(gamepad, ControllerBase.GamepadButtons.RS);
		//gamepadRS.whenPressed();

		gamepadLS = new JoystickButton(gamepad, ControllerBase.GamepadButtons.LS);
		gamepadLS.whenPressed(new ElevatorMoveDownPlus()); // This is so that the down button always goes down

		gamePadStart = new JoystickButton(gamepad, ControllerBase.GamepadButtons.START);
		gamePadStart.whenPressed(new HingeHome());
		//gamePadStart.whenPressed(new HookSwitchUp());

		gamepadBack = new JoystickButton(gamepad, ControllerBase.GamepadButtons.BACK);
		//gamepadBack.whenPressed(new ElevatorHome());
		//gamepadBack.whenPressed(new HookSwitchDown());
		gamepadBack.whileHeld(new FullCalibrateAndReset());

		gamepadRB = new JoystickButton(gamepad, ControllerBase.GamepadButtons.RB);
		gamepadRB.whenPressed(new HingeMoveMidway());

		gamepadLB = new JoystickButton(gamepad, ControllerBase.GamepadButtons.LB);
		//gamepadLB.whenPressed(new ElevatorMoveMidway());
		gamepadLB.whenPressed(new IfCargoPotentiallyLoaded(new ElevatorMoveMidwayPlus(),new ElevatorMoveMidway()));

		gamepadY = new JoystickButton(gamepad, ControllerBase.GamepadButtons.Y);
		//gamepadY.whileHeld(new GamepadRumble(true)); // to demonstrate whileHeld()/whenReleased()
		//gamepadY.whenReleased(new GamepadRumble(false));
		//gamepadY.whenPressed(new HabElevatorMoveUp());
		//gamepadY.whenPressed(new SuckerSuck());
		//gamepadY.whenPressed(new EndGame());
		gamepadY.whenPressed(new IfNuclearOptionEnabled(new EndGame(), new DoNothing()));

		gamepadX = new JoystickButton(gamepad, ControllerBase.GamepadButtons.X);
		gamepadX.whenPressed(new HingeElevatorsAndGrasperStop());

		gamepadB = new JoystickButton(gamepad, ControllerBase.GamepadButtons.B);
		//gamepadB.whenPressed(new GrasperTimedRelease(2));
		//gamepadB.whenPressed(new HookSwitchDown());
		//gamepadB.whileHeld(new HookSwitchDown());
		gamepadB.whileHeld(new GrasperRelease());

		gamepadA = new JoystickButton(gamepad, ControllerBase.GamepadButtons.A);
		//gamepadA.whenPressed(new IfRobotEnabled(new GrasperTimedGrasp(2),new FullCalibrateAndReset()));
		//gamepadA.whenPressed(new IfRobotEnabled(new HookSwitchUp(),new FullCalibrateAndReset()));
		//gamepadA.whileHeld(new IfRobotEnabled(new GrasperGrasp(),new FullCalibrateAndReset()));
		gamepadA.whileHeld(new GrasperGrasp());

		joyRight = new Joystick(Ports.USB.RIGHT);

		joyRightBtn11 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN11); // currently used for nuclear option
		//joyRightBtn11.whenPressed(xxx);

		joyRightBtn10 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN10);
		joyRightBtn10.whenPressed(new CargoDeliverRocket());
		//joyRightBtn10.whenPressed(new CargoDeliverShip());

		joyRightBtn9 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN9);
		joyRightBtn9.whenPressed(new HatchPanelDeliver());

		joyRightBtn8 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN8);
		joyRightBtn8.whenPressed(new HatchPanelPickup());
		
		joyRightBtn7 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN7);
		joyRightBtn7.whenPressed(new DrivetrainStop());

		joyRightBtn6 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN6);
		joyRightBtn6.whenPressed(new DrivetrainResetEncoders());

		joyRightBtn5 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN5);
		//joyRightBtn5.whenPressed(new DrivetrainMoveUsingCameraPidController(LimelightCamera.OFFSET_CAMERA_HATCH_INCHES));
		final int MAGIC_DISTANCE_INCHES = 12;
		joyRightBtn5.whenPressed(new DrivetrainDriveUsingCamera(LimelightCamera.OFFSET_CAMERA_HATCH_INCHES + MAGIC_DISTANCE_INCHES));

		joyRightBtn4 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN4);
		joyRightBtn4.whenPressed(new DrivetrainTurnUsingCameraPidController());

		joyRightBtn3 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN3);
		//joyRightBtn3.whenPressed(new EjectorSetPosition(IEjector.Position.EXTENDED));
		//joyRightBtn3.whenPressed(new GrasperTimedRelease(2));
		//joyRightBtn3.whileHeld(new GrasperRelease());
		joyRightBtn3.whenPressed(new EjectorExtend());

		joyRightBtn2 = new JoystickButton(joyRight, ControllerBase.JoystickButtons.BTN2);
		//joyRightBtn2.whenPressed(new EjectorSetPosition(IEjector.Position.RETRACTED));
		//joyRightBtn2.whenPressed(new GrasperTimedGrasp(2));
		//joyRightBtn2.whileHeld(new GrasperGrasp());
		joyRightBtn2.whenPressed(new EjectorRetract());


		joyLeft = new Joystick(Ports.USB.LEFT);

		joyLeftBtn11 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN11);
		joyLeftBtn11.whileHeld(new HabElevatorJoystickControl());
		
		joyLeftBtn10 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN10);
		joyLeftBtn10.whileHeld(new GrasperJoystickControl());

		joyLeftBtn9 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN9);
		joyLeftBtn9.whileHeld(new HingeJoystickControl());

		joyLeftBtn8 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN8);
		joyLeftBtn8.whileHeld(new ElevatorJoystickControl());

		joyLeftBtn7 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN7);
		joyLeftBtn7.whenPressed(new DrivetrainStop());

		joyLeftBtn6 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN6);
		joyLeftBtn6.whenPressed(new DrivetrainAndGyroReset());

		joyLeftBtn5 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN5);
		joyLeftBtn5.whenPressed(new DrivetrainTurnAngleUsingPidController(90));

		joyLeftBtn4 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN4);
		joyLeftBtn4.whenPressed(new DrivetrainTurnAngleUsingPidController(-90));

		joyLeftBtn3 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN3);
		joyLeftBtn3.whenPressed(new DrivetrainMoveDistance(50));

		joyLeftBtn2 = new JoystickButton(joyLeft, ControllerBase.JoystickButtons.BTN2);
		//joyLeftBtn2.whenPressed(new DrivetrainTurnUsingCameraPidController());
		joyLeftBtn2.whileHeld(new HookSwitchDown());


		// SmartDashboard Buttons

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	}

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
	public Joystick getLeftJoystick() {
		return joyLeft;
	}

	public Joystick getRightJoystick() {
		return joyRight;
	}

	public Joystick getGamepad() {
		return gamepad;
	}
	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

