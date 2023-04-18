package java0418;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class GridLayoutEx extends JFrame {
	ArrayList<Student> stulist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public GridLayoutEx() {
		setTitle("GridLayout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(6,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		JTextField txtname = new JTextField("");
		c.add(txtname);
		c.add(new JLabel("학번"));
		JTextField txtHb = new JTextField("");
		c.add(txtHb);
		c.add(new JLabel("학과"));
		JTextField txtHk = new JTextField("");
		c.add(txtHk);
		c.add(new JLabel("과목"));
		JTextField txtGm = new JTextField("");
		c.add(txtGm);
		JButton btnOk = new JButton("확인");
		c.add(btnOk);
		btnOk.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				String name = txtname.getText();
				String Hb = txtHb.getText();
				String Hk = txtHk.getText();
				String Gm = txtGm.getText();
				System.out.println(name+Hb+Hk+Gm);
				stulist.add(new Student(name,Hb,Hk,Gm));
			}
		});
		JButton btnCel = new JButton("취소");
		c.add(btnCel);
		btnCel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtname.setText("");
				txtHb.setText("");
				txtHk.setText("");
				txtGm.setText("");
				System.out.println("입력 취소");
			}
		});
		JButton btnGh = new JButton("조회");
		c.add(btnGh);
		btnGh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(Student student : stulist) {
					System.out.println(student);
				}
			}
		});
		JButton btnname = new JButton("이름으로검색");
		c.add(btnname);
		btnname.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				for (Student student : stulist) {
					if(txtname.getText().equals(student.getName())) {
						System.out.println(student.getName()+
						student.getHb()+student.getHk()+student.getGm());
						i++;
						break;
					}	
				}
				if(i == 0)					
					System.out.println("조회한 이름이 없습니다.");
				
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}
}
