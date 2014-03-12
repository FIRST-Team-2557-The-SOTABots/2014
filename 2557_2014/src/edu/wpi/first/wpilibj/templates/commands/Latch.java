/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotParts;

/**
 *
 * @author Antonio
 */
public class Latch extends CommandBase {
    boolean latch = false;
    public Latch(boolean latch) {
       this.latch = latch;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
       }

    // Called just before this Command runs the first time
    protected void initialize() {
        RobotParts.compressor.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    RobotParts.latchCataSol.set(latch);
    RobotParts.fireCataSol.set(!latch);
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
