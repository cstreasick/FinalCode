package org.usfirst.frc5247.TestDrive.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.usfirst.frc5247.TestDrive.OI;
import org.usfirst.frc5247.TestDrive.Robot;
import org.usfirst.frc5247.TestDrive.subsystems.SpinMotor;

public class SpinStop extends Command {
    
     public SpinStop() {
    	
        requires(Robot.spinMotor);

    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }
    
        
    public void teleopPeriodic() {
        Scheduler.getInstance().run();	
    }
    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
       
        
        // double moveValue = 0 - OI.driveStick.getY();
  
      
        Robot.spinMotor.spin(0);
    }

    
    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
       // Robot.spinMotor.spin(0);
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.spinMotor.spin(0);
    	//Robot.subsystem1.stopMet();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	//Robot.subsystem1.stopMe();
    }
}
