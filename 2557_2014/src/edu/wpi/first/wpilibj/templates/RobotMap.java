package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int leftDriveMotor = 1;
    public static final int rightDriveMmotor = 2;
    public static final int intakeMotor = 3;
    public static final int winchMotor = 4;
    public static final int arduino_1 = 1;
    public static final int arduino_2 = 2;
    public static final int limSwitchPort = 3;
    
    public static final int intakeUp = 1;
    public static final int intakeDown = 2;
    public static final int unshift = 3;
    public static final int shift = 4;
    public static final int unlatched = 5;
    public static final int latched = 6;
    
    public static final int leftEncoder_a = 5;
    public static final int leftEncoder_b = 6;
    public static final int rightEncoder_a = 7;
    public static final int rightEncoder_b = 8;
    
}
