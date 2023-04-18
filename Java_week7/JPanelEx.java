package java0418;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//설계도
public class JPanelEx extends JFrame{
	//생성자
	JPanelEx(){
		this.setTitle("패널 예제 학번 이름");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		
		JButton btnyes = new JButton("Yes");
		JButton btnno = new JButton("No");
		JPanel pan = new JPanel();
		pan.add(new JLabel("아이스크림을 좋아하나요?"));
		pan.add(btnyes);
		btnyes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("예, 아이스크림을 좋아합니다.");
			}
		});
		pan.add(btnno);
		btnno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("아니오. 아이스크림을 좋아하지 않습니다.");
			}
		});
		con.add(pan);
		this.setSize(350,250);
		this.setVisible(true);
	}
}
