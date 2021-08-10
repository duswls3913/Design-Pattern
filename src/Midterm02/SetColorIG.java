package Midterm02;
import java.awt.Color;

public class SetColorIG extends ColorDecorator{
	SetColor s;
	

    public Color outputColor(Color color) {
		
		s=new SetColorInversion( new SetColorGrey( new OriginalColorConverter()));
		return s.outputColor(color);

	}

}
