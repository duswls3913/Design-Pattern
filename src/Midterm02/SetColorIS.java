package Midterm02;
import java.awt.Color;
public class SetColorIS extends ColorDecorator{
	SetColor s;
	

    public Color outputColor(Color color) {
		
		s=new SetColorInversion( new SetColorSepia( new OriginalColorConverter()));
		return s.outputColor(color);

	}

}
