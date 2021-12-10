package clazz.field;

class Car4{
	private int speed;
	// private는 외부 접근 허용안됨
	// 데이터 보호를 위해 사용

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			this.speed = 50;
		}
		else {
			this.speed = speed;
		}
	}
	
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Car4 car = new Car4();
		// car.speed = 100; <- 접근 불가능
		car.setSpeed(100);
		System.out.println(car.getSpeed());
		
		car.setSpeed(-100);
		System.out.println(car.getSpeed());
	}

}
