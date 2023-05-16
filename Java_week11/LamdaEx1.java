package java0516;

@FunctionalInterface
interface SumInterface{
	int plus(int x, int y);
}
interface CalcInterface{
	int calc(int x, int y);
}

public class LamdaEx1 {
	static int add(int x, int y) {
		return x + y;
	}
	static int sub(int x, int y) {
		return x - y;
	}
	static int mul(int x, int y) {
		return x * y;
	}
	public static void main(String[] args) {
		System.out.println("더하기" + add(20,10));
		System.out.println("빼기" + sub(20,10));
		System.out.println("곱하기" + mul(20,10));
		
		SumInterface sum1 = (x, y)->x + y;
		CalcInterface add1 = (x, y)->x + y;
		CalcInterface sub1 = (x, y)->x - y;
		CalcInterface mul1 = (x, y)->x * y;
		CalcInterface div1 = (x, y)->x / y;
		CalcInterface n = (x, y)->x % y;
		
		System.out.println("람다를 이용한 더하기"+sum1.plus(4, 2));
		System.out.println("람다를 이용한 더하기"+add1.calc(10, 2));
		System.out.println("람다를 이용한 빼기"+sub1.calc(10, 2));
		System.out.println("람다를 이용한 곱하기"+mul1.calc(10, 2));
		System.out.println("람다를 이용한 나누기"+div1.calc(10, 2));
		System.out.println("람다를 이용한 나머지"+n.calc(10, 3));
		
		// 람다는 이름 없는 함수 혹은 람다함수로 불린다.
		// 자바에서는 람다식은 매개변수 리스트, 에로우 토큰 함수의 바디의 3부분으로 나뉜다.
		// 람다식은 매개변수의 타입 생략가능
		// 함수형 인터페이스란 추상메소드 하나만 있는 인터페이스를 말한다.
		// 
		
	}
}
