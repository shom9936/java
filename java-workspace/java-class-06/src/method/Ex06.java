package method;

import java.util.Scanner;

public class Ex06 {
	
	// 사칙연산 계산 메소드를 하나씩 만들어보자.
	
	public static void powerOn() { // 매개변수 X , 리턴값 X
		System.out.println("전원을 켭니다");
	}
	
	public static void powerOff() {
		System.out.println("전원을 끕니다");
		System.exit(0); // 프로그램 강제 종료
	}
	
	public static int add(int x, int y) { //매개변수 O, 리턴값 O
		return x + y;
	}
	
	public static int subtract(int x, int y) { //매개변수 O, 리턴값 O
		return x - y;
	}
	
	public static int multiply(int x, int y) { //매개변수 O, 리턴값 O
		return x * y;
	}
	
	public static double divide(double x, double y) { //매개변수 O, 리턴값 O
		return x / y;
	}
	
	public static void output(int result) { // 매개변수 O, 리턴값 X
		System.out.println(result);
	}
	
	public static void output(double result) { // 매개변수 O, 리턴값 X
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("전원을 켤까요? (1)Yes (2)No");
		int power = scan.nextInt();
		
		if(power == 1) powerOn();
		else if(power == 2) powerOff();
		else{
			System.out.println("잘못 입력 하셨습니다");
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
		
		boolean bool = true;
		
		while(bool) {
			
			System.out.println("(1)더하기 (2)빼기 (3)곱하기 (4)나누기 (5)전원끄기");
			int choice = scan.nextInt();
			
			if(choice == 5) powerOff();
			
			switch(choice) {
			case 1:
				System.out.println("첫번째 수를 입력 : ");
				int x1 = scan.nextInt();
				System.out.println("두번째 수를 입력 : ");
				int y1 = scan.nextInt();
				int result1 = add(x1,y1);
				output(result1);
				break;
			case 2:
				System.out.println("첫번째 수를 입력 : ");
				int x2 = scan.nextInt();
				System.out.println("두번째 수를 입력 : ");
				int y2 = scan.nextInt();
				int result2 = subtract(x2,y2);
				output(result2);
				break;
			case 3:
				System.out.println("첫번째 수를 입력 : ");
				int x3 = scan.nextInt();
				System.out.println("두번째 수를 입력 : ");
				int y3 = scan.nextInt();
				int result3 = multiply(x3,y3);
				output(result3);
				break;
			case 4:
				System.out.println("첫번째 수를 입력 : ");
				int x4 = scan.nextInt();
				System.out.println("두번째 수를 입력 : ");
				int y4 = scan.nextInt();
				double result4 = divide(x4,y4);
				output(result4);
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			
			scan.close();
			
		}

	}

}
