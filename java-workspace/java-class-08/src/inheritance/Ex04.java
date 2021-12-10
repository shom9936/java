package inheritance;

class Car{
	
	int speed;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(Car클래스) : " + this.speed);
	}
}

// Car클래스를 상속받은 Genesis 클래스를 만들고
// upSpeed()메소드를 재정의해보세요
// 속도는 최고속도 150

//Car클래스를 상속받은 Porter 클래스를 만들고
//upSpeed()메소드를 재정의해보세요
//속도는 최고속도 100

class Genesis extends Car{
	
	int speed;
	
	void upSpeed(int speed) { // 재정의된 자식클래스 메소드
		this.speed += speed;
		if(this.speed > 150) {
			System.out.println("제네시스의 최고속도는 150입니다.");
			this.speed = 150;
		}
		System.out.println("현재속도(Genesis클래스) : " + this.speed);
	}
	
}

class Porter extends Car{
	
	int speed;
	
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed > 100) {
			System.out.println("포터의 최고속도는 100입니다.");
			this.speed = 100;
		}
		System.out.println("현재속도(Porter클래스) : " + this.speed);
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.upSpeed(200);
		
		Genesis genesis = new Genesis();
		genesis.upSpeed(200);
		
		Porter porter = new Porter();
		porter.upSpeed(200);
	}

}
