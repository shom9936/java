package clazz.field;

class Car{
	// 필드 : field (class에 선언된 변수를 필드라고 한다)
	// class에 선언된 변수(필드)와 메소드에 선언된 변수와는 다르다.
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed; // default : 0 (자동으로 초기화 , 기본값이 0이 된다.)
}

public class Ex01 {

	public static void main(String[] args) {
		
		Car myCar = new Car(); // 객체 생성
		
		// 객체 사용
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		//myCar.speed = 10;
		System.out.println("현재 속도 : "+ myCar.speed);

	}

}
