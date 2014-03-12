/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotParts;
/**
 *
 * @author 4053
 */
public class IntakeUp extends CommandBase {
    
    boolean intakeUp = false;
    public IntakeUp(boolean intakeUp){
        this.intakeUp = intakeUp;
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        RobotParts.compressor.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        RobotParts.intakeUpSol.set(intakeUp);
        RobotParts.latchCataSol.set(!intakeUp);
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
