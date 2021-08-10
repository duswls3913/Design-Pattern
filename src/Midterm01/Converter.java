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
				// (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
            
				Color color = new Color(image.getRGB(x, y));//여기까지 동일
            
				if(setcolor!=null) {
					// 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장           
					image.setRGB(x, y, setcolor.outputColor(color).getRGB());
				}
        }
     }
		
	}

}
