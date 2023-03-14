
public class Car {
	private String color;
	int speed = 0;
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
		carCount++;
	}
	public Car() {
		carCount++;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void upSpeed(int value) {
		if(speed + value >= 200)
			speed = 200;
	}
	public void downSpeed(int value) {
		if(speed - value <= 0)
			speed = 0;
		else
			speed  = speed - value;
	}
	
}
