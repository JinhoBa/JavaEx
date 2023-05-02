package java0522;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.*;

public class RadioButtonEx extends JFrame{
	RadioButtonEx(){
		this.setTitle("체크박스 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherryimage.jpg");
		
		//RabidButton은 그룹 추가가 있다.그룹중에 하나만 선택
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton rb_apple = new JRadioButton("사과");
		JRadioButton rb_pear = new JRadioButton("배", true);
		JRadioButton rb_cherry = new JRadioButton("체리",cherryIcon);
		rb_cherry.setBorderPainted(true);
		rb_cherry.setSelectedIcon(cherryIcon);
		
		// 그룹에 추가
		g.add(rb_apple); 
		g.add(rb_pear);
		g.add(rb_cherry);
		
		c.add(rb_apple);
		c.add(rb_pear);
		c.add(rb_cherry);		
		
		this.setSize(400,600);
		setVisible(true);
	}

}
