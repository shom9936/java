package method;

public class Ex04 {
	
	// 전원을 키는 powerOn() 메소드와
	// 매개변수 2개를 받아서 더하는 add(int x , int y) 메소드를 만들어보자
	
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static int add(int x, int y) {
		return x+y;
	}
	

	public static void main(String[] args) {
		
		powerOn();
		int plus = add(100, 200); // add() 메소드 호출시 매개값을 준다.
		// int형 메소드를 호출 시 리턴값을 int형으로 받는다.
		System.out.println(plus);

	}

}
