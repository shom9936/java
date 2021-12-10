package clazz.field;

class Car2{
	
	String color;
	int speed;
	
	void upspeed(int speed) {
		// 필드와 매개변수의 이름이 같다면 매개변수의 우선순위가 높다.
		this.speed += speed;
		// 매개변수와 필드의 이름이 동일하기 때문에
		// (this.필드)는 this라는 참조변수로 필드를 사용
	}
	
	String getColor( ) { // get -> 가져오다 // 반대 set -> 저장하다
		return color; // String color 필드를 리턴한다.
	}
	
	int getSpeed() {
		return speed;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {

		Car2 myCar = new Car2();
		myCar.color = "빨강";
		myCar.speed = 0;
		
		myCar.upspeed(30);
		
		System.out.println("자동차 색상은 : " + myCar.color);
		System.out.println("자동차 속도는 : "+ myCar.speed);
		
		System.out.println("자동차 색상은 : " + myCar.getColor());
		System.out.println("자동차 속도는 : "+ myCar.getSpeed());


	}

}
