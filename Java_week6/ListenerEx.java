package java_0411;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//버튼 두개 예제
public class ListenerEx extends JFrame{
	public ListenerEx() {
		this.setTitle("이벤트 예제 4 two button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.pink);
		
		JButton btn = new JButton("확인");
		JButton btn2 = new JButton("취소");
		con.add(btn);
		con.add(btn2);
		
		btn.addActionListener(new ActionListener() {//확인 버튼
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인 버튼 클릭");
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("확인"))
					b.setText("ok");
				else
					b.setText("확인");
			}
		});
		btn2.addActionListener(new ActionListener() {//취소 버튼
			public void actionPerformed(ActionEvent e) {
				System.out.println("취소 버튼 클릭");
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("취소"))
					b.setText("cancel");
				else
					b.setText("취소");
			}
		});
		this.setSize(350,150);
		this.setVisible(true);
	}
}
