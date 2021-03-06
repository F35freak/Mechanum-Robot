package org.usfirst.frc.team2059.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	JoystickButton[][] joystickButtons;
	Joystick[] joysticks;
	public OI() {
		    joysticks = new Joystick[1];
		    joystickButtons = new JoystickButton[1][13];
		    // Create joysticks
		    joysticks[0] = new Joystick(0);
		    // Create buttons
		    for (int i = 0; i < 12; i++) {
		      joystickButtons[0][i] = new JoystickButton(joysticks[0], i + 1);
		     }
		    // Print log when button 1 pressed
		    //joystickButtons[0][0].whenPressed(new LogEncoder());
		    }
		  public Joystick[] getJoysticks() {
		    return joysticks;
		  }
		  public Joystick getJoystick(int stick) {
		    return joysticks[stick];
		  }
		  public JoystickButton[][] getJoystickButtons() {
		    return joystickButtons;
		  }
}

