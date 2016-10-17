package org.usfirst.frc.team2059.robot.subsystems;

import org.usfirst.frc.team2059.robot.RobotMap;
import org.usfirst.frc.team2059.robot.commands.Drive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

public class DriveBase extends Subsystem {
	Victor leftMotorFront = new Victor(RobotMap.driveLeftMotorFront);
	Victor leftMotorBack = new Victor(RobotMap.driveLeftMotorBack);
	Victor rightMotorFront = new Victor(RobotMap.driveRightMotorFront);
	Victor rightMotorBack = new Victor(RobotMap.driveRightMotorBack);
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
