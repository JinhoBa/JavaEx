
public class Ex10 {
	public static void main(String[] args) {
		Tiger tiger1 = new Tiger();
		Eagle eagle1 = new Eagle();
		
		tiger1.name = "시베리아 호랑이";
		System.out.println(tiger1.name);
		tiger1.move();
		tiger1.eat();
		
		eagle1.name = "백두산 독수리";
		System.out.println(eagle1.name);
		eagle1.move();
		eagle1.eat();
	}
}
