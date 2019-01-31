

package frc.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

/**
 *
 */
public class IfRobotEnabled extends ConditionalCommand {

	public IfRobotEnabled(Command commandIfEnabled, Command commandIfNotEnabled) {
		super(commandIfEnabled, commandIfNotEnabled);

		setRunWhenDisabled(true); // allows running of command when robot is disabled
	}

	@Override
	protected boolean condition() {
		return DriverStation.getInstance().isEnabled();
	}
}
