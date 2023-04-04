package java0404;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

//JFrame의 디폴트 레이아웃은 BorderLayout이다.

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		this.setTitle("버튼추가 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setBackground(Color.ORANGE);
		con.setLayout(new FlowLayout());
		JButton btnok = new JButton("확인");
		con.add(btnok);
		JButton btncancel = new JButton("취소");
		con.add(btncancel);
		con.add(new JButton("ignore"));
		
		this.setSize(300,150);
		this.setVisible(true);
	}
}
