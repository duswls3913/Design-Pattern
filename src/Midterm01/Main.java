package Midterm01;
import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//닉네임 봉골레파스타
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String HOUSE = "house.png";
		try {       
            // 이미지 파일 데이터를 메모리에 넣음
            BufferedImage image = ImageIO.read(new File(HOUSE));
            
            Converter converter = new Converter(new SetColorGrey());
            converter.convert(image);
            ImageIO.write(image, "png", new File("g_" + HOUSE));//흑백이미지저장
            
            converter.choiceColor(new SetColorSepia());
            converter.convert(image);
            ImageIO.write(image, "png", new File("s_" + HOUSE));//세피아이미지저장
            
            converter.choiceColor(new SetColorInversion());
            converter.convert(image);
            ImageIO.write(image, "png", new File("i_" + HOUSE));//반전이미지저장
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
		
		

	}

}
