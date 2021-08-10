package Midterm01;
import java.awt.Color;

public class SetColorGrey implements SetColor {

	/*
	public int outputRed(Color color) {
		 return (color.getRed() + color.getGreen() + color.getBlue())/3;
	}
	public int outputGreen(Color color) {
		return (color.getRed() + color.getGreen() + color.getBlue())/3;
	}
	public int outputBlue(Color color) {
		return (color.getRed() + color.getGreen() + color.getBlue())/3;
	}*/
	public Color outputColor(Color color) {
		int grey =  (color.getRed() + color.getGreen() + color.getBlue())/3;
		return new Color(grey,grey,grey);	
	}


}
