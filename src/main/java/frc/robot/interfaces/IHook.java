package frc.robot.interfaces;


public interface IHook {

	public enum Position {
		UP, // hook is facing up
		DOWN, // hook is facing downward 
		UNKNOWN;
	}	

	public void setPosition(Position pos);	
	
	public Position getPosition();
}
