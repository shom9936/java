package clazz.field;

class Car3{
	
	String color;
	int speed;
	
	// 우클릭 -> source -> generate getter and setter
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
	
	
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		myCar.setColor("빨강");
		myCar.setSpeed(30);
		
		// myCar.speed = -100;
		
		System.out.println("자동차의 색상은 : " + myCar.getColor());
		System.out.println("자동차의 속도는 : " + myCar.getSpeed());

	}

}
