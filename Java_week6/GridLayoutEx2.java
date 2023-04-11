package java_0411;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GridLayoutEx2 extends JFrame{
	ArrayList<Student> stulist = new ArrayList<>();
	public GridLayoutEx2() {
		this.setTitle("GridLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(6,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel(" 이름"));
		JTextField txtname = new JTextField("");
		c.add(txtname);
		c.add(new JLabel(" 학번"));
		JTextField txtHb = new JTextField("");
		c.add(txtHb);
		c.add(new JLabel(" 학과"));
		JTextField txtHk = new JTextField("");
		c.add(txtHk);
		c.add(new JLabel(" 과목"));
		JTextField txtGm = new JTextField("");
		c.add(txtGm);
		JButton btnOK = new JButton("확인");
		c.add(btnOK);
		btnOK.addActionListener(new ActionListener() {// 확인버튼 리스너 추가
			public void actionPerformed(ActionEvent e) {
				String name = txtname.getText();
				String Hb = txtHb.getText();
				String Hk = txtHk.getText();
				String Gm = txtGm.getText();
				System.out.println(name + Hb + Hk + Gm);
				stulist.add(new Student(name,Hb,Hk,Gm));
			}
		});
		JButton btnCANCEL = new JButton("취소");
		c.add(btnCANCEL);
		btnCANCEL.addActionListener(new ActionListener() { //취소버튼 리스너 추가
			public void actionPerformed(ActionEvent e) {
				txtname.setText("");
				txtHb.setText("");
				txtHk.setText("");
				txtGm.setText("");
				System.out.println("입력 취소");
			}
		});
		JButton btnGH = new JButton("조회");
		c.add(btnGH);
		btnGH.addActionListener(new ActionListener() { //취소버튼 리스너 추가
			public void actionPerformed(ActionEvent e) {
				for (Student student : stulist) {
					System.out.println(student);
				}
			}
		});
		
		this.setSize(300,200);
		this.setVisible(true);
	}
}
