package org.usfirst.frc5247.TestDrive.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.usfirst.frc5247.TestDrive.OI;
import org.usfirst.frc5247.TestDrive.Robot;
import org.usfirst.frc5247.TestDrive.subsystems.SpinMotor;

public class SpinCommandFaster extends Command {
    int move;
     public SpinCommandFaster() {
    	
        requires(Robot.spinMotor);

    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        Robot.spinMotor.spin(0);
    }
    
        
    public void teleopPeriodic() {
        Scheduler.getInstance().run();	
    }
    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.spinMotor.spin(.3);
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
        
    	//Robot.subsystem1.stopMet();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	//Robot.subsystem1.stopMe();
    }
}
