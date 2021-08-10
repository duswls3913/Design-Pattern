package MP05.factoryPattern;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape {
	Point[] points;
	String type;
	public Shape(String type,Point[] points) {
		this.points = points;
		this.type = type;
	}
	
	abstract double calcArea();
	
	public String toString() {
		
		return(type+"\n"+Arrays.toString(points)+"\n"+"area : "+calcArea());

	}
	

}
