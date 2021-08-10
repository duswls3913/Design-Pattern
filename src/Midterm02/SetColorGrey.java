package Midterm02;
import java.awt.Color;

public class SetColorGrey extends ColorDecorator  {
	SetColor setColor;
	public SetColorGrey() {
		setColor = new OriginalColorConverter();
		
	}
	public SetColorGrey(SetColor setColor) {
		super(setColor);
		this.setColor = setColor;
		// TODO Auto-generated constructor stub
	}
	
	public Color outputColor(Color color) {
		Color color_ = super.outputColor(color);
		int grey =  (color_.getRed() + color_.getGreen() + color_.getBlue())/3;
		return new Color(grey,grey,grey);	
	}
	

}
