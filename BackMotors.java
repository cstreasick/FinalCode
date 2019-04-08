/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5247.TestDrive.commands;

import org.usfirst.frc5247.TestDrive.Robot;
import org.usfirst.frc5247.TestDrive.subsystems.PneumaticsSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class BackMotors extends Command {
  public BackMotors() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.motors);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.oi.opStick.getRawButtonPressed(4)) {
        Robot.motors.thrustMotors();
    }
    if(Robot.oi.opStick.getRawButtonPressed(10)) Robot.motors.thrustsFrontMotors();
    if(Robot.oi.opStick.getRawButtonPressed(12)) Robot.motors.thrustsBackMotors();
    if(Robot.oi.opStick.getRawButtonPressed(9)) Robot.motors.inwardFrontMotors();
    if(Robot.oi.opStick.getRawButtonPressed(11)) Robot.motors.inwardBackMotors();
  }


  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
