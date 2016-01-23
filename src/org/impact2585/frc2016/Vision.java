package org.impact2585.frc2016;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Vision {
	NetworkTable table;
	public void visionInit()
	{
		table = NetworkTable.getTable("GRIP/Robot");
	}
	public double[] centerX()
	{
		double[] defaultValue = new double[0];
		double[] centerX = table.getNumberArray("centerX", defaultValue);
		return centerX;
	}
}
