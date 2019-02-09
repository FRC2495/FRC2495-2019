package frc.robot.interfaces;


public interface ISucker {

	public enum Position {
		INHALE, // pump is inhaling air 
		EXHALE, // pump is exhaling air
		UNKNOWN;
	}	

	public void setPosition(Position pos);	
	
	public Position getPosition();
}
