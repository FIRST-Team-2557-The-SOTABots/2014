/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotParts;

/**
 *
 * @author SpacemenRD
 */
public class ArmLights extends CommandBase {
    int lightMode = 1; //Initialize light mode as 1(yellow).
    
    public ArmLights(int lightMode) {
        this.lightMode = lightMode;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(lightMode == 1){
            RobotParts.ledYlwOut.set(true);
            RobotParts.ledBluOut.set(false);
            RobotParts.ledRedOut.set(false);
            RobotParts.ledMuricaOut.set(false);
            RobotParts.ledGroovyOut.set(false);
        }
        else if(lightMode ==2){
            RobotParts.ledYlwOut.set(false);
            RobotParts.ledBluOut.set(true);
            RobotParts.ledRedOut.set(false);
            RobotParts.ledMuricaOut.set(false);
            RobotParts.ledGroovyOut.set(false);
        }
        else if(lightMode == 3){
            RobotParts.ledYlwOut.set(false);
            RobotParts.ledBluOut.set(false);
            RobotParts.ledRedOut.set(true);
            RobotParts.ledMuricaOut.set(false);
            RobotParts.ledGroovyOut.set(false);
        }
        else if(lightMode == 4){
            RobotParts.ledYlwOut.set(false);
            RobotParts.ledBluOut.set(false);
            RobotParts.ledRedOut.set(false);
            RobotParts.ledMuricaOut.set(true);
            RobotParts.ledGroovyOut.set(false);
        }
        else if(lightMode == 5){
            RobotParts.ledYlwOut.set(false);
            RobotParts.ledBluOut.set(false);
            RobotParts.ledRedOut.set(false);
            RobotParts.ledMuricaOut.set(false);
            RobotParts.ledGroovyOut.set(true);
        }
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
