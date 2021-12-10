package clazz.constructor;

class Car2{
	// 필드
	String company = "기아자동차";
	String model;
	String color;
	int speed;
	
	// 기본생성자: 다른 생성자가 하나라도 존재할 시, 자바컴파일러가 자동으로 생성해주지않음
	Car2(){ 
		
	}
	
	// 생성자 오버로딩
	Car2(String model){
		// this.model = model;
		this(model, null); // 생성자 호출
	}
	
	Car2(String model, String color){
//		this.model = model;
//		this.color = color;
		this(model,color,0);
	}
	
	Car2(String model, String color, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Car2 car1 = new Car2(); // 객체 생성시 생성자 호출
		System.out.println("제작회사 : " + car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("K5");
		System.out.println("제작회사 : " + car2.company);
		System.out.println("모델 : " + car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("K7", "검정");
		System.out.println("제작회사 : " + car3.company);
		System.out.println("모델 : " + car3.model);
		System.out.println("색상 : " + car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("K9", "빨강", 200);
		System.out.println("제작회사 : " + car4.company);
		System.out.println("모델 : " + car4.model);
		System.out.println("색상 : " + car4.color);
		System.out.println("속도 : " + car4.speed);
		System.out.println();

	}

}
