

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

import frc.robot.Robot;

/**
 *
 */
public class IfNuclearOption extends ConditionalCommand {

	public IfNuclearOption(Command commandIfEnabled, Command commandIfNotEnabled) {
		super(commandIfEnabled, commandIfNotEnabled);
	}

	@Override
	protected boolean condition() {
		return false; // TODO
	}
}
