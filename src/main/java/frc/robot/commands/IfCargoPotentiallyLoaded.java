

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.ConditionalCommand;
import frc.robot.Robot;

/**
 *
 */
public class IfCargoPotentiallyLoaded extends ConditionalCommand {

	public IfCargoPotentiallyLoaded(Command commandIfLoaded, Command commandIfNotLoaded) {
		super(commandIfLoaded, commandIfNotLoaded);
	}

	@Override
	protected boolean condition() {
		return !Robot.hingeControl.isUp(); // unless the hinge is up we assume that we may have a cargo
	}
}
