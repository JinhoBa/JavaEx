package java0328;

import java.io.*;

public class Ex8_1 {
	public static void main(String[] args) {
		try {
			//FileReader fin = new FileReader("C:\\inputfile.txt"); //��ü ����
			BufferedReader bin = new BufferedReader( new FileReader("C:\\inputfile.txt"));
			//FileWriter fout = new FileWriter("C:\\outputfile.txt");
			BufferedWriter bout = new BufferedWriter(new FileWriter("C:\\outputfile.txt"));
			int c = 0;
			while ((c = bin.read()) != -1) {
				System.out.print((char)c+" ");
				bout.write(c);
			}
			System.out.println();
			System.out.println("������ ����߽��ϴ�.");
			
			bin.close();
			bout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���� �߻�!!");
		}
	}
}
