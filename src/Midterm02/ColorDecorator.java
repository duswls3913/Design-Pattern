package Midterm02;
import java.awt.Color;

public abstract class ColorDecorator extends SetColor {
	private  SetColor setColor;
	public ColorDecorator() {
		setColor = new OriginalColorConverter();
		
	}
	public ColorDecorator(SetColor setColor) {
		this.setColor = setColor;
	}

	@Override
	public Color outputColor(Color color) {
		// TODO Auto-generated method stub
		return setColor.outputColor(color);
	}

}
