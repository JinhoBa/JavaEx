package java0522;
import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	LabelEx(){
		this.setTitle("레이블 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lbText = new JLabel("사랑합니다.");
		c.add(lbText);
		ImageIcon beauty = new ImageIcon("images/h.jpg");
		JLabel lbImage = new JLabel(beauty);
		c.add(lbImage);
		this.setSize(400,600);
		setVisible(true);
	}
}
