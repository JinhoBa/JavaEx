package java0516;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LamdaEx2 extends JFrame{
	LamdaEx2(){
		this.setTitle("패널 예제 학번 이름");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		JButton btnyes = new JButton("Yes");
		JButton btnno = new JButton("No");
		JPanel pan = new JPanel();
		
		pan.add(new JLabel("아이스크림을 좋아하나요?"));
		pan.add(btnyes);
		pan.add(btnno);
		con.add(pan);
		
		btnyes.addActionListener(e->
			System.out.println("아이스크림을 좋아합니다.")
		);
		btnno.addActionListener (e ->
			System.out.println("아니오. 아이스크림을 좋아하지 않습니다.")
		);
			
		this.setSize(350,250);
		this.setVisible(true);
	}
}
