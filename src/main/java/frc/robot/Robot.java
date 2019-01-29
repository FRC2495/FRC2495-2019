/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;

import com.ctre.phoenix.motorcontrol.can.BaseMotorController;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

//import frc.robot.interfaces.*;
import frc.robot.sensors.*;
//import frc.robot.commands.*;
import frc.robot.subsystems.*;
//import frc.robot.util.*;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";

  // IMPORTANT MAKE SURE THAT THIS CONSTANT IS SET TO TRUE IF USING COMPETITION BOT!
	// use this constant to switch between competition and practice bot
  public static final boolean COMPETITION_BOT_CONFIG = true;

  public static OI oi;
  
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();


	// sensors
	
	HMCamera camera;
	
	public static ADXRS450_Gyro gyro; // gyro
	boolean hasGyroBeenManuallyCalibratedAtLeastOnce = false;
	
	Sonar sonar;
	
	HMAccelerometer accelerometer;
	
	// motorized devices
	
	public static /*I*/Drivetrain drivetrain;

	WPI_TalonSRX frontLeft;
	WPI_TalonSRX frontRight;
	BaseMotorController rearLeft; 
	BaseMotorController rearRight;
	
	public static /*I*/Elevator elevatorControl;
	
	WPI_TalonSRX elevator;
	
	public static /*I*/Grasper grasper;
	
	BaseMotorController grasperLeft;
  BaseMotorController grasperRight;
  

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);

    // sensors
			
		sonar = new Sonar(Ports.Analog.SONAR); 
			
		gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0); // we want to instantiate before we pass to drivetrain	

		gyro.calibrate(); 
		gyro.reset();

		camera = new HMCamera("GRIP/myContoursReport"); // TODO switch to Limelight

		accelerometer = new HMAccelerometer();

		// motorized devices

		frontLeft = new WPI_TalonSRX(Ports.CAN.LEFT_FRONT);
		frontRight = new WPI_TalonSRX(Ports.CAN.RIGHT_FRONT);
		rearLeft = new WPI_VictorSPX(Ports.CAN.LEFT_REAR);
		rearRight= new WPI_VictorSPX(Ports.CAN.RIGHT_REAR);

		elevator = new WPI_TalonSRX(Ports.CAN.ELEVATOR);

		grasperLeft = new WPI_VictorSPX(Ports.CAN.GRASPER_LEFT);
		grasperRight = new WPI_VictorSPX(Ports.CAN.GRASPER_RIGHT);

		grasper = new Grasper(grasperLeft, grasperRight, sonar, this);
    
    
		// OI must be constructed after subsystems. If the OI creates Commands
		//(which it very likely will), subsystems are not guaranteed to be
		// constructed yet. Thus, their requires() statements may grab null
		// pointers. Bad news. Don't move it.
    oi = new OI();
  } 

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to
   * the switch structure below with additional strings. If using the
   * SendableChooser make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    m_autoSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected);

		switch (m_autoSelected) {
      case kCustomAuto:
        // start custom auto command here
        break;
      case kDefaultAuto:
      default:
        // start default auto command here
        break;
    }
  }

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
	}

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
		Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
	
	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {	
		Scheduler.getInstance().run();
  }
  
  public void updateToSmartDash()
	{
  }
}
