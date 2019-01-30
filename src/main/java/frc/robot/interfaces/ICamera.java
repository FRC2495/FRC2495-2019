package frc.robot.interfaces;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

public interface ICamera extends PIDSource {

	public boolean isCoherent();

	public int getNumberOfTargets();

	public boolean acquireTargets(boolean waitForNewInfo);
	
	public boolean checkForOpening();

	public double getDistanceToCompositeTargetUsingVerticalFov();
	
	public double getDistanceToCompositeTargetUsingHorizontalFov();

	public double getAngleToTurnToCompositeTarget();
	
	public double getPixelDisplacementToCenterToCompositeTarget();

	public double[] getArea();

	public double[] getWidth();

	public double[] getHeight();

	public double[] getCenterX();

	public double[] getCenterY();
	
	public void setPIDSourceType(PIDSourceType pidSource);
	
	public PIDSourceType getPIDSourceType();
	
	public double pidGet();
}
