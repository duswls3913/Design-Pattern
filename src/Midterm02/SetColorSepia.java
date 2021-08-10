package Midterm02;
import java.awt.Color;

public class SetColorSepia extends ColorDecorator{
	SetColor setColor;
	public SetColorSepia() {
		setColor = new OriginalColorConverter();
		
	}
	public SetColorSepia(SetColor setColor) {
		super(setColor);
		this.setColor = setColor;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Color outputColor(Color color) {
		Color color_ = super.outputColor(color);
		int grey =  (color_.getRed() + color_.getGreen() + color_.getBlue())/3;
		return new Color(230 * grey / 255,180 * grey / 255,150 * grey / 255);	
	}

}
