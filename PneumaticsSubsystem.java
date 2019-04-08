/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5247.TestDrive.subsystems;

import org.usfirst.frc5247.TestDrive.commands.PneumaticsCommand;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class PneumaticsSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
 public static Solenoid driveShifter = new Solenoid(0);
	public static DoubleSolenoid solenoidOne = new DoubleSolenoid(1, 2);
	public static DoubleSolenoid solenoidCenter = new DoubleSolenoid(5,6);
  public static DoubleSolenoid  clawer = new DoubleSolenoid(3,4);
  
	
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new PneumaticsCommand());
  }
  public void toggleSolenoidOne() {
	
   if(solenoidOne.get() == Value.kReverse) {solenoidOne.set(Value.kForward);
    }else solenoidOne.set(Value.kReverse);

}
public void toggleClawer() {
	
 if(clawer.get() == Value.kReverse) {clawer.set(Value.kForward);
  }else clawer.set(Value.kReverse);

}

public void toggleSolenoidCenter() {
	
 if(solenoidCenter.get() == Value.kReverse) {solenoidCenter.set(Value.kForward);
  }else solenoidCenter.set(Value.kReverse);

}
// public void toggleShifter() {
//   if (driveShifter.get() == false) {driveShifter.set(true);
// }else driveShifter.set(false);

// }
}
