package java_0411;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;
public class InnerListener extends JFrame{
	public InnerListener() {
		this.setTitle("이벤트 예제 2 이너클래스");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		
		con.setLayout(new FlowLayout());
		con.setBackground(Color.green);
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());//리스너 추가
		con.add(btn);
		
		this.setSize(350,150);
		this.setVisible(true);
	} //생성자 끝
	class myActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("한글액션");
			else
				b.setText("Action");
		}
	}
}
