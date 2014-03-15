/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.templates.commands.ArmLights;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;
import edu.wpi.first.wpilibj.templates.commands.Latch;
import edu.wpi.first.wpilibj.templates.commands.Winch;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Command autonomousCommand;
    double winchVal = 1.0;
    Command winchCom = new Winch(winchVal); //Command that latchs the 
    Command fireCataCom = new Latch(false); //Command that fires catapult.
    Command ledYlwCom = new ArmLights(1);
    Command ledBluCom = new ArmLights(2);
    Command ledRedCom = new ArmLights(3);
    Command ledMurica = new ArmLights(4);
    Command ledGroovy = new ArmLights(5);

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();
        RobotParts.compressor.start();

        // Initialize all subsystems
        CommandBase.init();
    }
    
    public void disableInit(){
        winchCom.cancel(); //Ends winch command if it is going.
        RobotParts.drive.stopMotor(); //Stops the drive.
        RobotParts.winchM.stopMotor();//Stops the winch.
        RobotParts.intakeM.stopMotor();//Stops the intake motor.
        //fireCataCom.start(); //Would turn on for competitions to get rid of balls.
        RobotParts.compressor.stop(); //Turns off the compressor.
        
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
        RobotParts.compressor.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
