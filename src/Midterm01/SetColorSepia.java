package Midterm01;
import java.awt.Color;

public class SetColorSepia implements SetColor {
	
	@Override
	public Color outputColor(Color color) {
		int grey =  (color.getRed() + color.getGreen() + color.getBlue())/3;
		return new Color(230 * grey / 255,180 * grey / 255,150 * grey / 255);	
	}

}
