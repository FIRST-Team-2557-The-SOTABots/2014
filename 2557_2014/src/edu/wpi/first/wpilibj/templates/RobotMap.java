package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //P = port, M = motor, En = encoder.
    //If port is zero port is not defined.
    //Defines Joysticks.
    public static final int leftJoyP = 1; //Defines left joystick port.
    public static final int rightJoyP = 2; //Defines right joystick port.
    //Defines Motor ports.
    public static final int leftDriveMP = 1; //Defines left drive motor on port 1.
    public static final int rightDriveMP = 2; //Defines right drive motor on port 2.
    public static final int intakeMP = 3; //Defines intake motor on port 3.
    public static final int winchMP = 4; //Defines winch motor on port 4.
    //Defines Digital ports.
    public static final int arduino1P = 0; //Defines arduino 1 digital port.
    public static final int arduino2P = 0; //Defines arduino 2 digital port.
    public static final int cataLimP = 1; //Defines catapult limit sensor digital port.
    //Defines Compressor ports.
    public static final int compressorAP = 14; //Defines compressor A port.
    public static final int compressorBP = 1; //Defines compressor B port.
    //Defines Solenoid ports.
    public static final int intakeUpP = 1; //Defines intake up Solennoid port.
    public static final int intakeDownP = 2; //Defines intake down Solenoid port.
    public static final int unshiftP = 3; //Defines gear unchange Solenoid port.
    public static final int shiftP = 4; //Defines gear change Solenoid port.
    public static final int unlatchedP = 5; //Defines unlatch catapult Solenoid port.
    public static final int latchedP = 6; //Defines latch catapult Solenoid port.
    //Defines Encoder ports.
    public static final int leftEnAP = 2; //Defines left drive encoder A port.
    public static final int leftEnBP = 3; //Defines left drive encoder B port.
    public static final int rightEnAP = 4; //Defines right drive encoder A port.
    public static final int rightEnBP = 5; //Defines right drive encoder B port.
    public static final int winchEnAP = 6; //Defines winch encoder A port.
    public static final int winchEnBP = 7; //Defines winch encoder B port.
    //Defines the Digital Output Ports
    public static final int ledFlash1P = 8;
    public static final int ledFlash2P = 9;
    public static final int ledFlash3P = 10;
    public static final int ledFlash4P = 11;
    public static final int ledFlash5P = 12;
    
    
}
