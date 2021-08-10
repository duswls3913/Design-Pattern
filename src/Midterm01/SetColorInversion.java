package Midterm01;
import java.awt.Color;

public class SetColorInversion implements SetColor {

	@Override
	public Color outputColor(Color color) {
		
		return new Color(255-color.getRed(),255-color.getGreen(),255-color.getBlue());	
	}

}
