package java0418;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginFormEx extends JFrame{
	String myemail = "bse06119@naver.com";
	String mypw = "1234";
	public LoginFormEx(){
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(3,2);
		grid.setVgap(5);
		Container c = getContentPane();
		c.setLayout(grid);
		
		JLabel email = new JLabel("이메일");
		c.add(email);
		JTextField txtemail = new JTextField("");
		c.add(txtemail);
		JLabel pw = new JLabel("비밀번호"); 
		c.add(pw);
		JTextField txtpw = new JTextField("");
		c.add(txtpw);
		
		JButton btnlog = new JButton("로그인");
		c.add(btnlog);
		btnlog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtemail.getText().equals(myemail) &&txtpw.getText().equals(mypw))
					System.out.println("로그인 되었습니다.");
				else
					System.out.println("다시 입력하십시오");
			}
		});
		JButton btncel = new JButton("취소");
		c.add(btncel);
		btncel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtemail.setText("");
				txtpw.setText("");
				System.out.println("입력 취소");
			}
		});
		
		setSize(400,200);
		setVisible(true);
	}
}
