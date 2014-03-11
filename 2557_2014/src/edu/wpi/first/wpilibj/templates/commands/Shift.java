/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.Library;

/**
 *
 * @author SOTA
 */
public class Shift extends CommandBase {
    boolean shift = false;
    public Shift(boolean shift) {
        this.shift = shift;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Library.shift.set(shift); //Makes shift Solenoid turn on or off dependent upon what was given.
        Library.unShift.set(!shift); //Makes the unshift Solenoid do the opposite of the shift Solenoid.
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
