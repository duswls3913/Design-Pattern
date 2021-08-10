package Midterm02;
import java.awt.Color;

public class SetColorInversion extends ColorDecorator {
	SetColor setColor;
	public SetColorInversion() {
		setColor = new OriginalColorConverter();
		
	}
	public SetColorInversion(SetColor setColor) {
		super(setColor);
		this.setColor = setColor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color outputColor(Color color) {
		Color color_ = super.outputColor(color);
		return new Color(255-color_.getRed(),255-color_.getGreen(),255-color_.getBlue());	
	}
	
	
}
