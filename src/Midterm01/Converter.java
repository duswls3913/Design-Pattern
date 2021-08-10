package Midterm01;
import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Converter {
	private SetColor setcolor = null;
	
	public Converter(SetColor setcolor) {
		this.setcolor = setcolor;
	}
	
	public void choiceColor(SetColor setcolor) {
		this.setcolor = setcolor;
	}
	
	public void convert(BufferedImage image) {
		for(int y = 0; y < image.getHeight(); y++) {
			for(int x = 0; x < image.getWidth(); x++) {
				// (x, y)�� �ش�Ǵ� �ȼ��� RGB ������ �޾Ƽ� Color�� ����
            
				Color color = new Color(image.getRGB(x, y));//������� ����
            
				if(setcolor!=null) {
					// ���� ������� RGB ���� (x, y)��ǥ �ȼ� �÷��� ����           
					image.setRGB(x, y, setcolor.outputColor(color).getRGB());
				}
        }
     }
		
	}

}
