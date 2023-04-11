package java_0411;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class AnonymousListener extends JFrame{
	public AnonymousListener() {
		this.setTitle("이벤트 예제 3 익명클래스");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		
		con.setLayout(new FlowLayout());
		con.setBackground(Color.red);
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("한글액션");
				else
					b.setText("Action");
			}
		});
		
		con.add(btn);
		this.setSize(350,150);
		this.setVisible(true);
	}
}
