package java0328;
import java.io.*;

public class Ex8_2 {
	public static void main(String[] args) {
		try {
			//1
			//FileInputStream fin = new FileInputStream("C:\\flower.jpg");
			//BufferedInputStream bin = new BufferedInputStream(fin);
			//2 
			BufferedInputStream bin =new BufferedInputStream( new FileInputStream("C:\\flower.jpg"));
			FileOutputStream fout = new FileOutputStream("C:\\flowercopy.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int b;
			while ((b = bin.read()) != -1) {
				bout.write(b);
			}
			System.out.println("파일을 복사했습니다.");
			bin.close();
			bout.close();
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!!!");
		}
	}
}
