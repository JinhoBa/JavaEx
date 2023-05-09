package java0509;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class NumberGame extends JFrame{
	private JTextField tf = new JTextField(10);
	Random random = new Random();
	int rn_num = random.nextInt(100)+1;
	NumberGame(){
		this.setTitle("숫자 맞추기 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel top_pan = new JPanel();
		JPanel mid_pan = new JPanel();
		JPanel bot_pan = new JPanel();
		
		top_pan.add(new JLabel("숫자 추측 : "));
		top_pan.add(tf);
		
		JLabel an = new JLabel("시작(1~100) 숫자 입력");
		an.setOpaque(true);
		mid_pan.add(an);
		
		
		JButton bt_re = new JButton("다시한번");
		JButton bt_end = new JButton("종료");
		bot_pan.add(bt_re);
		bot_pan.add(bt_end);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tf.getText());
				if (num < rn_num) {
					an.setText(" up ");
					an.setBackground(Color.RED);
					tf.setText("");
				}
				else if (num > rn_num) {
					an.setText("down");
					tf.setText("");
					an.setBackground(Color.CYAN);
				}
				else {
					an.setText(" 정답 ");
					an.setBackground(Color.GREEN);
				}
				System.out.println("정답: "+rn_num);
			}
		});
		
		bt_re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				Random random = new Random();
				rn_num = random.nextInt(100)+1;
			}
		});
		
		
		bt_end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("시스템 종료");
				System.exit(0);
			}
		});
		
		c.add(top_pan);
		c.add(mid_pan);
		c.add(bot_pan);
		
		
		this.setSize(300,200);
		setVisible(true);
	}
}
