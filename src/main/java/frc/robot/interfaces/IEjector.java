package frc.robot.interfaces;


public interface IEjector {

	public enum Position {
		EXTENDED, // extended
		RETRACTED, // retracted
		UNKNOWN;
	}	

	public void setPosition(Position pos);	
	
	public Position getPosition();
}
