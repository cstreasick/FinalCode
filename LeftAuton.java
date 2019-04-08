package org.usfirst.frc5247.TestDrive.commands;
//Old
import org.usfirst.frc5247.TestDrive.Robot;

//import org.usfirst.frc5247.TestDrive.pnumaticsCommandPlusPlus;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class LeftAuton extends Command {
	Timer timer;
	private boolean open;
	private static Solenoid solenoidAuton;
	private static DoubleSolenoid shooter;
	private static Solenoid unknown;
	
	public LeftAuton() {
		

        requires(Robot.subsystem1);
        timer = new Timer();

   		//if(solenoidAuton == null) {
   			
   	      //  unknown = pnumaticsCommandPlusPlus.solenoidThree;
   			//Solenoid solenoidAuton = new Solenoid(RobotMap.SOLENOID_ONE);
   		//solenoidTwo = new DoubleSolenoid(0,1,2);
   		
   		//}
   		
   		this.open = open;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.reset();
    	timer.start();
    	
    	if (open) {
    		solenoidAuton.set(true);
    	}
    	else {
    		//solenoidAuton.set(false);
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
	}
    	//}
  //  }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (timer.get()< 1) {
        return false;
    }
    	
    	else {
    	//solenoidAuton.set(false);	
     	return true; 
     	
    	}

    }
    // Called once after isFinished returns true
    protected void end() {
    	Robot.subsystem1.stopMe();
    	Robot.subsystem1.stopMet();
    	//Robot.subsystem1.stopMet();
    }

    protected void interrupted() {
    	//solenoidAuton.set(false);
    	end();
    }
}