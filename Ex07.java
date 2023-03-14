import java.lang.Math;

public class Ex07 {
	public static void main(String[] args) {
	
		Car 내차 = new Car("빨강",0);
		Car 엄마차 = new Car("파랑",0);
		Car 제니차 = new Car("초록",0);
		
		내차.upSpeed(50);
		System.out.println("내차 색상은 " + 내차.getColor() + ", 내차 속도 : " + 내차.getSpeed());
		엄마차.upSpeed(300);
		엄마차.downSpeed(31);
		System.out.println("엄마차 색상은 " + 엄마차.getColor() + ", 엄마차 속도 : " + 엄마차.getSpeed());
		제니차.upSpeed(39);
		System.out.println("제니차 색상은 " + 제니차.getColor() + ", 제니차 속도 : " + 제니차.getSpeed());
		
		System.out.println("생산된 차의 대수 (정적 필드) -> " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) -> " + Car.currentCarCount());
		System.out.println("차의 최고 제한속도 -> " + Car.MAXSPEED);
		System.out.println("PI의 값 : " + Math.PI);
		System.out.println("3의 5제곱 : " + Math.pow(3, 5));
	}
}
