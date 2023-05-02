package java0522;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextAreaEx extends JFrame{
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	TextAreaEx(){
		this.setTitle("텍스트 에리어 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				//append() 끝에다 추가
				ta.append(t.getText()+"\n");
				t.setText("");
			}
		});
		//초기화 버튼
		JButton bt = new JButton("초기화");
		c.add(bt);
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ta.setText("");
			}
		});
		this.setSize(300,300);
		setVisible(true);
	}
}
