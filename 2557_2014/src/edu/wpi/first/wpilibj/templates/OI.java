
package edu.wpi.first.wpilibj.templates;

//import edu.wpi.first.wpilibj.buttons.Button;
//import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //Defines left and right joysticks.
    Joystick leftJoy = new Joystick(RobotMap.leftJoyP); //Defines left joystick.
    Joystick rightJoy = new Joystick(RobotMap.rightJoyP); //Defines right joystick.
    //Defines the drive motors.
    RobotDrive drive = new RobotDrive(RobotMap.leftDriveMP,RobotMap.rightDriveMP); //Defines left and right driving motors.
    //Defines Talon by their jobs.
    Talon intakeM = new Talon(RobotMap.intakeMP); //Defines ball pickup motor.
    Talon winchM = new Talon(RobotMap.winchMP); //Defines winch motor.
    //Defines encoders by what motor they are connected to.
    Encoder winchEn = new Encoder(RobotMap.winchEnAP,RobotMap.winchEnBP); //Defines winch encoder.
    Encoder leftDriveEn = new Encoder(RobotMap.leftEnAP,RobotMap.leftEnBP); //Defines left drive encoders.
    Encoder rightDriveEn = new Encoder(RobotMap.rightEnAP,RobotMap.rightEnBP); //Defines right drive encoders.
    //Defines Compressor.
    Compressor compress = new Compressor(RobotMap.compressorAP,RobotMap.compressorBP);//Defines the compressor as compressor.
    //Defines solenoids of the pneumatics by their jobs.
    Solenoid intakeUp = new Solenoid(RobotMap.intakeUpP); //Defines intake arm moving up.
    Solenoid intakeDown = new Solenoid(RobotMap.intakeDownP); //Defines intake arm moving down.
    Solenoid unShift = new Solenoid(RobotMap.unshiftP); //Defines unshift gears on supershift.
    Solenoid shift = new Solenoid(RobotMap.shiftP); //Defines shift gears on supershifter.
    Solenoid fireCata = new Solenoid(RobotMap.unlatchedP); //Defines unlatching catapult arm.
    Solenoid latchCata = new Solenoid(RobotMap.latchedP); //Defines latching catapult arm.
    //Defines digital inputs by jobs.
    DigitalInput cataLim = new DigitalInput(RobotMap.cataLimP); //Defines sensor that detects catapult limit.
    //Defines digital ouputs based on jobs.
    DigitalOutput ledFlash1 = new DigitalOutput(8); //Defines led "place type of flash here".
    DigitalOutput ledFlash2 = new DigitalOutput(9); //Defines led "place type of flash here".
    DigitalOutput ledFlash3 = new DigitalOutput(10); //Defines led "place type of flash here".
    DigitalOutput ledFlash4 = new DigitalOutput(11); //Defines led "place type of flash here".
    DigitalOutput ledFlash5 = new DigitalOutput(12); //Defines led "place type of flash here".
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
