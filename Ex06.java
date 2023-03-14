
public class Ex06 {
	static int var = 100;
	public static void main(String[] args) {
		int num1 = 100, num2 = 0;
		try {
			System.out.println(num1/num2);
		} catch (Exception e) {
			System.out.println("문제가 있습니다.");
			e.printStackTrace();
		}
	}
}
