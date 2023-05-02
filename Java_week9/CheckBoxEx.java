package java0522;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxEx extends JFrame{
	CheckBoxEx(){
		this.setTitle("체크박스 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple =new JCheckBox("사과");
		c.add(apple);
		JCheckBox pear = new JCheckBox("배", true);
		c.add(pear);
		ImageIcon cherryIcon = new ImageIcon("images/cherryimage.jpg");
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(cherryIcon);
		c.add(cherry);
		
		apple.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("사용자 사과 클릭");
				if(apple.isSelected())
					System.out.println("사과 선택");
				else
					System.out.println("사과 선택해제");
			}
		});
		
		pear.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("사용자 배 클릭");
				if(pear.isSelected())
					System.out.println("배 선택");
				else
					System.out.println("배 선택해제");
			}
		});
		
		cherry.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("사용자 체리 클릭");
				if(cherry.isSelected())
					System.out.println("체리 선택");
				else
					System.out.println("체리 선택해제");
			}
		});
		this.setSize(400,600);
		setVisible(true);
	}
}
