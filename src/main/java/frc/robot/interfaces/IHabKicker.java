package frc.robot.interfaces;


public interface IHabKicker {

	public enum Position {
		IN, // retract kicker 
		OUT, // extend kicker
		UNKNOWN;
	}	

	public void setPosition(Position pos);	
	
	public Position getPosition();
}
