/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

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
 *
 * @author SOTA
 */
public class RobotParts {
    //Defines the drive motors.
    public static RobotDrive drive = new RobotDrive(RobotMap.leftDriveMP,RobotMap.rightDriveMP); //Defines left and right driving motors.
    //Defines Talon by their jobs.
    public static Talon intakeM = new Talon(RobotMap.intakeMP); //Defines ball pickup motor.
    public static Talon winchM = new Talon(RobotMap.winchMP); //Defines winch motor.
    //Defines encoders by what motor they are connected to.
    public static Encoder winchEn = new Encoder(RobotMap.winchEnAP,RobotMap.winchEnBP); //Defines winch encoder.
    public static Encoder leftDriveEn = new Encoder(RobotMap.leftEnAP,RobotMap.leftEnBP); //Defines left drive encoders.
    public static Encoder rightDriveEn = new Encoder(RobotMap.rightEnAP,RobotMap.rightEnBP); //Defines right drive encoders.
    //Defines Compressor.
    public static Compressor compressor = new Compressor(RobotMap.compressorAP,RobotMap.compressorBP);//Defines the compressor as compressor.
    //Defines solenoids of the pneumatics by their jobs.
    public static Solenoid intakeUpSol = new Solenoid(RobotMap.intakeUpP); //Defines intake arm moving up.
    public static Solenoid intakeDownSol = new Solenoid(RobotMap.intakeDownP); //Defines intake arm moving down.
    public static Solenoid unShiftSol = new Solenoid(RobotMap.unshiftP); //Defines unshift gears on supershift.
    public static Solenoid shiftSol = new Solenoid(RobotMap.shiftP); //Defines shift gears on supershifter.
    public static Solenoid fireCataSol = new Solenoid(RobotMap.unlatchedP); //Defines unlatching catapult arm.
    public static Solenoid latchCataSol = new Solenoid(RobotMap.latchedP); //Defines latching catapult arm.
    //Defines digital inputs by jobs.
    static DigitalInput cataLimIn = new DigitalInput(RobotMap.cataLimP); //Defines sensor that detects catapult limit.
    //Defines digital ouputs based on jobs.
    static DigitalOutput ledYlwOut = new DigitalOutput(RobotMap.ledFlash1P); //Defines led Yellow.
    static DigitalOutput ledBluOut = new DigitalOutput(RobotMap.ledFlash2P); //Defines led Blue.
    static DigitalOutput ledRedOut = new DigitalOutput(RobotMap.ledFlash3P); //Defines led Red.
    static DigitalOutput ledMuricaOut = new DigitalOutput(RobotMap.ledFlash4P); //Defines led Murica.
    static DigitalOutput ledGroovyOut = new DigitalOutput(RobotMap.ledFlash5P); //Defines led Groovy.
    //Defines SmartDashboard.
    static SmartDashboard driveStation = new SmartDashboard(); //Defines a SmartDashboard as dash for ease of reference.
    //Defines Timer.
    public static Timer timer = new Timer(); //Defines a Timer as timer for ease of reference.
}
