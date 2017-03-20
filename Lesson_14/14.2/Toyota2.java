import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Toyota2 extends Car2
{
	private double x,y;
	
	public Toyota2()
	{
		x = 0;
		y = 0;
	}
	
	public Toyota2(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public Toyota2(String coordinates)
	{
		String[] parts = coordinates.split(",");
		x = Double.parseDouble(parts[0]);
		y = Double.parseDouble(parts[1]);
	}
	
	public Toyota2(double[] coordinates)
	{
		x = coordinates[0];
		y = coordinates[1];
	}
	
	public double[] getLoc()
	{
		double[] loc = {x,y};
		return loc;
	}
}