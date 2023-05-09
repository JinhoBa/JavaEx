package java0509;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame{
	private JLabel colorLabel;
	private JSlider[] slider = new JSlider[3];
	int r,g,b;
	public SliderChangeEx(){ //확인 취소 버튼 추가
		this.setTitle("슬라이더 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel toppn = new JPanel();
		JPanel botpn = new JPanel();
		
		c.setLayout(new FlowLayout());
		toppn.setLayout(new GridLayout(4,1));
		
		for (int i = 0; i < slider.length; i++) {
			slider[i] = new JSlider(JSlider.HORIZONTAL,0,255,128);
			slider[i].setPaintLabels(true);
			slider[i].setPaintTrack(true);
			slider[i].setPaintTicks(true);
			slider[i].setMajorTickSpacing(50);
			slider[i].setMinorTickSpacing(50);
			toppn.add(slider[i]);
		}
		slider[0].setForeground(Color.RED);
		slider[1].setForeground(Color.GREEN);
		slider[2].setForeground(Color.BLUE);

		colorLabel = new JLabel(" SLIDER EXAMPLE ");
		toppn.add(colorLabel);
		colorLabel.setOpaque(true);
		
		JButton btnOk = new JButton("확인");
		JButton btnCel = new JButton("취소");
		botpn.add(btnOk);
		botpn.add(btnCel);
		
		r = slider[0].getValue();
		g = slider[1].getValue();
		b = slider[2].getValue();
		colorLabel.setBackground(new Color(r,g,b));
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r = slider[0].getValue();
				g = slider[1].getValue();
				b = slider[2].getValue();
				colorLabel.setBackground(new Color(r,g,b));
				
			}
		});
		
		btnCel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				slider[0].setValue(128);
				slider[1].setValue(128);
				slider[2].setValue(128);				
				colorLabel.setBackground(new Color(128,128,128));
				
			}
		});
		
		c.add(toppn);
		c.add(botpn);
		
		
		this.setSize(300,300);
		this.setVisible(true);
	}
}
