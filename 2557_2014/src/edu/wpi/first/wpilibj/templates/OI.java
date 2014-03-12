
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.Button;
//import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //Keeps track of all the Joysticks and Buttons.
    //L = left
    //Defines left and right joysticks.
    static Joystick leftJoy = new Joystick(RobotMap.leftJoyP); //Defines left joystick.
    static Joystick rightJoy = new Joystick(RobotMap.rightJoyP); //Defines right joystick.
    
//Defines the left joystick buttons.
    Button buttonL1 = new JoystickButton(leftJoy, 1); //Defines left joystick button 1
    Button buttonL2 = new JoystickButton(leftJoy, 2); //Defines left joystick button 2
    Button buttonL3 = new JoystickButton(leftJoy, 3); //Defines left joystick button 3
    Button buttonL4 = new JoystickButton(leftJoy, 4); //Defines left joystick button 4
    Button buttonL5 = new JoystickButton(leftJoy, 5); //Defines left joystick button 5
    Button buttonL6 = new JoystickButton(leftJoy, 6); //Defines left joystick button 6
    Button buttonL7 = new JoystickButton(leftJoy, 7); //Defines left joystick button 7
    Button buttonL8 = new JoystickButton(leftJoy, 8); //Defines left joystick button 8
    Button buttonL9 = new JoystickButton(leftJoy, 9); //Defines left joystick button 9
    Button buttonL10 = new JoystickButton(leftJoy, 10); //Defines left joystick button 10
    Button buttonL11 = new JoystickButton(leftJoy, 11); //Defines left joystick button 11
    Button buttonL12 = new JoystickButton(leftJoy, 12); //Defines left joystick button 12
   
//R = Right
//Defines the right Joystick buttons
    Button buttonR1 = new JoystickButton(rightJoy, 1); //Defines right joystick button 1
    Button buttonR2 = new JoystickButton(rightJoy, 2); //Defines right joystick button 2
    Button buttonR3 = new JoystickButton(rightJoy, 3); //Defines right joystick button 3
    Button buttonR4 = new JoystickButton(rightJoy, 4); //Defines right joystick button 4
    Button buttonR5 = new JoystickButton(rightJoy, 5); //Defines right joystick button 5
    Button buttonR6 = new JoystickButton(rightJoy, 6); //Defines right joystick button 6
    Button buttonR7 = new JoystickButton(rightJoy, 7); //Defines right joystick button 7
    Button buttonR8 = new JoystickButton(rightJoy, 8); //Defines right joystick button 8
    Button buttonR9 = new JoystickButton(rightJoy, 9); //Defines right joystick button 9
    Button buttonR10 = new JoystickButton(rightJoy, 10); //Defines right joystick button 10
    Button buttonR11 = new JoystickButton(rightJoy, 11); //Defines right joystick button 11
    Button buttonR12 = new JoystickButton(rightJoy, 12); //Defines right joystick button 12
    
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1); 
   
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}
