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

public class PneumaticsCommand extends Command {
  public PneumaticsCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.pnumatics);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    //Robot.pnumatics.driveShifter.set(false);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.oi.opStick.getRawButtonPressed(5)) {
        Robot.pnumatics.toggleSolenoidOne();
    }
    if(Robot.oi.opStick.getRawButtonPressed(1)) Robot.pnumatics.toggleClawer();
    if(Robot.oi.opStick.getRawButtonPressed(3)) Robot.pnumatics.toggleSolenoidCenter();
    //if(Robot.oi.driveStick.getRawButtonPressed(1)) Robot.pnumatics.toggleShifter();
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
