package clazz.constructor;

// Car3 클래스를 만든다.
// 필드를 String color와 int speed를 외부접근금지가 되게 한다.
// 생성자에서 필드값을 받아서 속도(speed)는 0~200까지만 되게 한다.
// 속도가 0미만이거나 200을 초과할 경우 속도를 50으로 셋팅한다.
// get 메소드를 만들어서 color필드와 speed필드를 사용할 수 있게 한다.

class Car3{
	// 필드
	private String color;
	private int speed;
	
	public Car3(String color, int speed) {
		this.color = color;
		if(speed > 200 || speed <0) this.speed = 50;
		else this.speed = speed;
	}
	
	public Car3(String color) {
		this(color,0);
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}



public class Ex03 {

	public static void main(String[] args) {
		
		Car3 car1 = new Car3("검정", 190);
		System.out.println("색상 : " + car1.getColor() + ", 속도 : " + car1.getSpeed());

		Car3 car2 = new Car3("하양", 330);
		System.out.println("색상 : " + car2.getColor() + ", 속도 : " + car2.getSpeed());
		
		Car3 car3 = new Car3("회색");
		System.out.println("색상 : " + car3.getColor() + ", 속도 : " + car3.getSpeed());

	}

}
