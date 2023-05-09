package java0509;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.*;

public class ComboBoxEx1 extends JFrame{
	ComboBoxEx1(){
		this.setTitle("리스트예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		String[] fruits =  {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
		JComboBox<String> strCombo = new JComboBox<>(fruits);
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String selitem = (String)strCombo.getSelectedItem();
				System.out.println("선택한 과일: " + selitem);
			}
		});
		
		Integer[] numbers = {100,200,300,400,500,600,700,800,900};
		JComboBox<Integer> intCombo = new JComboBox<>(); //number대신 for문 사용
		
		for (int i = 0; i < numbers.length; i++) {
			intCombo.addItem(numbers[i]); //아이템 추가 addItem()
		}
		/*for (Integer item : numbers) {
			intCombo.addItem(item);
		}*/
		intCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Integer selnum = (Integer)intCombo.getSelectedItem();
				System.out.println("선택한 숫자: " + selnum);
			}
		});
		con.add(strCombo);
		con.add(intCombo);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
}
