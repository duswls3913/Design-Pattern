package Midterm02;
import java.awt.Color;
public class SetColorSI extends ColorDecorator{
	SetColor s;


    public Color outputColor(Color color) {
		
		s=new SetColorSepia( new SetColorInversion( new OriginalColorConverter()));
		return s.outputColor(color);

	}

}
