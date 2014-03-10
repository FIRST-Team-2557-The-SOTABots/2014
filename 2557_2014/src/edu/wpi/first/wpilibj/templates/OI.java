
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //Defines left and right joysticks.
    Joystick leftJoy = new Joystick(1); //Defines left joystick on port 1.
    Joystick rightJoy = new Joystick(2); //Defines right joystick on port 2.
    //Defines the drive motors.
    RobotDrive drive = new RobotDrive(1,2); //Defines talons on port 1 and 2 as the left and right driving motors.
    //Defines Talon by their jobs.
    Talon intakeM = new Talon(3); //Defines ball pickup motor on Talon port 3.
    Talon winchM = new Talon(4); //Defines winch motor on Talon port 4.
    //Defines encoders by what motor they are connected to.
    Encoder winchEn = new Encoder(6,7); //Defines winch encoder on digital in ports 6 and 7.
    Encoder leftDriveEn = new Encoder(2,3); //Defines left drive encoders on digital ports 2 and 3.
    Encoder rightDriveEn = new Encoder(4,5); //Defines right drive encoders on digital ports 4 and 5.
    //Defines Compressor.
    Compressor compress = new Compressor(14,1);//Defines the compressor as compressor.
    //Defines solenoids of the pneumatics by their jobs.
    Solenoid intakeUp = new Solenoid(1); //Defines intake arm moving up on Solenoid port 1.
    Solenoid intakeDown = new Solenoid(2); //Defines intake arm moving down on Solenoid port 2.
    Solenoid unShift = new Solenoid(3); //Defines unshift gears on supershift on Solenoid port 3.
    Solenoid shift = new Solenoid(4); //Defines shift gears on supershifter on Solenoid port 4.
    Solenoid fireCata = new Solenoid(5); //Defines unlatching catapult arm on Solenoid port 5.
    Solenoid latchCata = new Solenoid(6); //Defines latching catapult arm on Solenoid port 6.
    //Defines digital inputs by jobs.
    DigitalInput cataLim = new DigitalInput(1); //Defines sensor that detects catapult limit on digtil in port 1.
    //Have not finished all the DigitalInput ports.
    //Defines SmartDashboard.
    SmartDashboard dash = new SmartDashboard(); //Defines a SmartDashboard as dash for ease of reference.
    //Defines Timer.
    Timer timer = new Timer(); //Defines a Timer as timer for ease of reference.
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
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

