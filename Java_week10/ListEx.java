package java0509;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame{
	ListEx(){
		this.setTitle("리스트예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		String[] fruits =  {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
		JList<String> strList = new JList<>(fruits);
		con.add(strList);
		
		Integer[] numbers = {100,200,300,400,500,600,700,800,900};
		JList<Integer> intList = new JList<>(numbers);
		con.add(intList);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
}
