package org.usfirst.frc.team1571.robot.subsystems;

import org.usfirst.frc.team1571.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Feeder extends Subsystem {
	
	private CANTalon feederTalon = RobotMap.feederTalon;

    public void initDefaultCommand() {
		setDefaultCommand(null);
    }
    
    public void startFeeder() {
    	feederTalon.set(RobotMap.feederSpeed);
    }
    
    public void stopFeeder() {
    	feederTalon.set(0);
    }
}

