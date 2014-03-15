/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.templates.RobotParts;
/**
 *
 * @author 4053
 */
public class Winch extends CommandBase {
    
    Command latch = new Latch(true);
    double winch = 0;
    boolean done = false;
    public Winch(double winch) {
        this.winch = winch;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        RobotParts.winchM.set(winch);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //Waits for the winch to get to 510 ticks and the limit switch to trigger.
        if(RobotParts.winchEn.get() >= 510 && RobotParts.cataLimIn.get()){
            RobotParts.winchM.stopMotor(); //Stops the winch.
            latch.start(); //Latches catapult.
            done = true; //Tell command to stop.
        }
        else{
            RobotParts.winchM.set(winch);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done; //Waits for catapult to be latched
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        RobotParts.winchM.stopMotor();
    }
}
