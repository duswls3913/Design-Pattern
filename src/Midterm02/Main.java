package Midterm02;
import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
//�г��� �����Ľ�Ÿ
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String HOUSE = "house.png";
		try {       
            // �̹��� ���� �����͸� �޸𸮿� ����
            BufferedImage image = ImageIO.read(new File(HOUSE));
            
            Converter converter = new Converter(new SetColorGrey());
            converter.convert(image);
            ImageIO.write(image, "png", new File("g_" + HOUSE));
            
            converter.choiceColor(new SetColorSepia());
            converter.convert(image);
            ImageIO.write(image, "png", new File("s_" + HOUSE));
            
            converter.choiceColor(new SetColorInversion());
            converter.convert(image);
            ImageIO.write(image, "png", new File("i_" + HOUSE));
                   
            converter.choiceColor(new SetColorIG());
            converter.convert(image);
            ImageIO.write(image, "png", new File("i_g_" + HOUSE));
            
            converter.choiceColor(new SetColorIS());
            converter.convert(image);
            ImageIO.write(image, "png", new File("i_s_" + HOUSE));
            
            converter.choiceColor(new SetColorSI());
            converter.convert(image);
            ImageIO.write(image, "png", new File("s_i_" + HOUSE));
            
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
		
		

	}

}
