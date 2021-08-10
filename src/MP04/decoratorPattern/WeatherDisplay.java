package MP04.decoratorPattern;
import java.awt.Dimension;

import javax.swing.*;

public class WeatherDisplay extends DisplayDecorator{
	Display displayComponent;
	JPanel panel;
	
	LabelPanel labelPanel;
	int width;
	int height;
	
	public WeatherDisplay(Display display, int width, int height){
		super(display,width,height);
		this.displayComponent = display;
		this.width=width;
		this.height = height;
		
	}
	public JPanel create() {
		//originPanel = new JPanel();
		panel = new JPanel();
		
        // ���̺� �Ǵ� �ٸ� �г��� �߰��� �� ���� �������� �����ǵ��� ���̾ƿ� ����
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // �ּ� ũ��� ��ȣ�ϴ� ũ�⸦ �����ϰ� ���� �г� �ʺ�� ���̸� ���� ��Ŵ
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        // ���ڿ��� ���� ���̺� ����
        labelPanel = new LabelPanel();
        // �гο� ���̺��� ����. 
        panel.add(displayComponent.create());
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        
        
        return panel;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		displayComponent.show();
		labelPanel.updateText("weather : �µ�:20��, ����:60");
		
	}
	
	public int getHeight() {
        return displayComponent.getHeight() + this.height;
    }
	
}
