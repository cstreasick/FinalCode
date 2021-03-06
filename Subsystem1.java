// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5247.TestDrive.subsystems;

import org.usfirst.frc5247.TestDrive.RobotMap;
import org.usfirst.frc5247.TestDrive.commands.DriveCommand;
//import org.usfirst.frc5247.TestDrive.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.PWMTalonSRX;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Subsystem1 extends Subsystem {

	private Talon leftMotor =  new Talon(RobotMap.MOTOR_2NDRIGHT);
	private Talon rightMotor = new Talon(RobotMap.MOTOR_RIGHT);
	//public Victor reelUpTop = new Victor(RobotMap.REELUPTOP);
	public Victor rotateMotor = new Victor(RobotMap.LEFT_CASTOR);
	public static Victor backMotor = new Victor(7);
	public static Talon backDrive = new Talon(8);
	//public Victor CastorL = new Victor(RobotMap.LEFT_CASTOR);
	public Victor CastorR = new Victor(RobotMap.RIGHT_CASTOR);
	public Victor reelUpBottom = new Victor(RobotMap.REELUPDOWN);
	
	
	public static DifferentialDrive robotDrive;
        	
        	//public DifferentialDrive robotDrivet;
        	//public DifferentialDrive robotDrivet;
        	
    public Subsystem1() {
    	//Auton code runs here for sure
    	
    	robotDrive = new DifferentialDrive(leftMotor, rightMotor);
		robotDrive.setSafetyEnabled(false);
		//CastorL.setInverted(true);
    	
    	
    }
    
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
    	setDefaultCommand(new DriveCommand());
    }

    @Override
	public void periodic() {
        // Put code here to be run every loop

    }

	public static void driveMe(double moveValue, double rotateValue) {
		//System.out.println(moveValue);
		// TODO Auto-generated method stub
		robotDrive.arcadeDrive(moveValue , rotateValue);

		//System.out.println("drove");
	}
	//public void driveMet(double moveValuet, double rotateValuet) {
		
		//robotDrivet.arcadeDrive(moveValuet, rotateValuet);
	//}
	public void moveElevator(double speed) {
		//reelUpTop.set(speed * .2);
		reelUpBottom.set(speed * .5);
	}
	public void stopElevator() {
	//	reelUpTop.set(0);
		reelUpBottom.set(0);
	}
	public void rotate(double rotateSpeed) {
		rotateMotor.set(rotateSpeed);
	}
	public void rotateStop() {
		rotateMotor.set(0);
	}
	public void stopMe() {
		// TODO Auto-generated method stub
		robotDrive.tankDrive(0, 0);
		
	}
	public void stopMet()
	{
		//pairTwo.tankDrive(0, 0);
	}
	//public void stopMet() {
		
		//robotDrivet.tankDrive(0,  0);
	//}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

