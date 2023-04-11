package java_0411;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class IndepListener extends JFrame {
	public IndepListener() {
		this.setTitle("이벤트 예제 1 독립클래스");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		
		con.setLayout(new FlowLayout());
		con.setBackground(Color.yellow);
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());//리스너 추가
		con.add(btn);
		
		this.setSize(350,150);
		this.setVisible(true);
	}
}
//new class  독립클래스 사용 , public을 한번만 사용가능
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) { //오버라이딩
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("한글액션");
		else
			b.setText("Action");
	}
}
