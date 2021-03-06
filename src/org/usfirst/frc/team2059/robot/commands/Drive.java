package org.usfirst.frc.team2059.robot.commands;

import org.usfirst.frc.team2059.robot.Robot;
import org.usfirst.frc.team2059.robot.subsystems.DriveBase;
public class Drive extends CommandBase {
		  public Drive() {
		    requires(driveBase);
		  }
		  // Called just before this Command runs the first time
		  protected void initialize() {
		  }
		  // Called repeatedly when this Command is scheduled to run
		  protected void execute() {
		    double x = Robot.oi.getJoysticks()[0].getRawAxis(0);
		    double y = Robot.oi.getJoysticks()[0].getRawAxis(1);
		    double z = Robot.oi.getJoysticks()[0].getRawAxis(2);
		    driveBase.driveMechanum(x, y, z, 0);
		  }
		  // Make this return true when this Command no longer needs to run execute()
		  protected boolean isFinished() {
		    return false;
		  }
		  // Called once after isFinished returns true
		  protected void end() {
		  }
		  // Called when another command which requires one or more of the same
		  // subsystems is scheduled to run
		  protected void interrupted() {
		  }
}

