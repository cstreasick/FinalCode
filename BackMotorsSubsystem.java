/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5247.TestDrive.subsystems;

import org.usfirst.frc5247.TestDrive.commands.PneumaticsCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 * Add your docs here.
 */
public class BackMotorsSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
//  public static Talon backMotor = new Talon(5);
  //public static Victor frontMotor = new Victor(6);
	
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new PneumaticsCommand());
  }
  public void inwardBackMotors() {
    //The three states are, what it means, what I want it to do
    //.-5, going in, stop
    //0, not moving, turn to -.5
    //.5, going out, stop
    //if (backMotor.get() == 0) {
      //backMotor.set(-.5);
//    }else backMotor.set(0);
  }
  public void inwardFrontMotors() {
  //  if (frontMotor.get() == 0) {
  //    frontMotor.set(-.5);
    //}else frontMotor.set(0);
  }
  public void thrustsBackMotors() {
    /* if (backMotor.get() == 0) {backMotor.set(.5);
    }else backMotor.set(0); */

}
public void thrustsFrontMotors() {
 // if (frontMotor.get() == 0) {frontMotor.set(.5);
 // }else frontMotor.set(0);

}

public void thrustMotors() {
 /*  if (frontMotor.get() == 0 ) {
    if ( backMotor.get() == 0) {
      backMotor.set(-.5);
      frontMotor.set(-.5);
    }
  }
} */
}
}