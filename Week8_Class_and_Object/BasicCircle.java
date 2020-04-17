package Week8_Class_and_Object;

import java.lang.Math.*;

public class BasicCircle {

	public int radius;
	
	public BasicCircle() {
		this.radius=1;
	}
	public BasicCircle(int radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		double circumference=2*Math.PI*radius;
		return Math.round(circumference * 100.0) / 100.0;
	}

	public double getArea() {
		double area=Math.PI*radius*radius;
		return Math.round(area * 100.0) / 100.0;
	}

}
