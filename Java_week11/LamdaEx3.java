package java0516;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class LamdaEx3 extends JFrame{
	LamdaEx3(){
		this.setTitle("체크박스 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple =new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		c.add(apple);
		c.add(pear);
		
		ImageIcon cherryIcon = new ImageIcon("images/cherryimage.jpg");
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(cherryIcon);
		c.add(cherry);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		
		apple.addItemListener(e -> {
				System.out.println("사용자 사과 클릭");
				if(apple.isSelected())
					System.out.println("사과 선택");
				else
					System.out.println("사과 선택해제");
			}
		);
		
		pear.addItemListener(e ->{
				System.out.println("사용자 배 클릭");
				if(pear.isSelected())
					System.out.println("배 선택");
				else
					System.out.println("배 선택해제");
			}
		);
		
		cherry.addItemListener(e-> {
				System.out.println("사용자 체리 클릭");
				if(cherry.isSelected())
					System.out.println("체리 선택");
				else
					System.out.println("체리 선택해제");
			}
		);
		
		slider.addChangeListener(e->
			System.out.println(slider.getValue() + "\t")
		);
		
		this.setSize(400,600);
		setVisible(true);
	}
}
