package org.usfirst.frc.team2059.robot.subsystems;

import org.usfirst.frc.team2059.robot.RobotMap;
import org.usfirst.frc.team2059.robot.commands.Drive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;

public class DriveBase extends Subsystem {
	Spark leftMotorFront = new Spark(RobotMap.driveLeftMotorFront);
	Spark leftMotorBack = new Spark(RobotMap.driveLeftMotorBack);
	Spark rightMotorFront = new Spark(RobotMap.driveRightMotorFront);
	Spark rightMotorBack = new Spark(RobotMap.driveRightMotorBack);
	 public void initDefaultCommand() {
		    setDefaultCommand(new Drive());
		  }
		  public void driveMechanum(double x, double y, double z, double sensitivity) {
		    leftMotorFront.set((x+y+z)*-1);
		    leftMotorBack.set((-x+y+z)*-1);
		    rightMotorFront.set(-x+y-z);
		    rightMotorBack.set(x+y-z);
		  }

}
