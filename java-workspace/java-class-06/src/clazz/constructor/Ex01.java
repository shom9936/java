package clazz.constructor;

class Car1{
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	
	// 생성자
	// 1. 기본생성자를 명시하지 않으면 컴파일러는 기본생성자를 자동으로 만들어준다.
	// 2. 그러나 생성자를 명시해주면 만들지않는다.
	// 3. 반환타입이 없다.
	// 4. 생성자는 클래스이름과 같은 이름을 써야 한다.
	
	public Car1() {
		System.out.println("Car1() 생성자를 생성했습니다");
		System.out.println("생성자는 객체생성시 호출되어 초기화 역할!!!");
		model = "소나타";
		color = "검정";
		speed = 100;
	}
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		Car1 car = new Car1(); // 객체 생성
		// 객체를 생성하면 생성자가 호출이되고 필드초기화와 메소드 호출 등
		// 객체를 사용할 준비를 한다.
		System.out.println("제작회사 : " + car.company);
		System.out.println("모델 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("속도 : " + car.speed);

	}

}
