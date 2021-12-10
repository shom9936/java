package interface1;

// 매개변수의 다형성

interface Vehicle{
	public void run();
}

class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
}

class Taxi implements Vehicle{
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
		
	}
}

class Driver{
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			//((Bus) vehicle).checkFare(); // 아래 코드랑 동일
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		Driver driver = new Driver();
		driver.drive(vehicle);
		vehicle = new Taxi();
		driver.drive(vehicle);
	}

}
