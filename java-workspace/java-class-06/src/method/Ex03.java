package method;

import java.util.Scanner;

public class Ex03 {

	//이름과 나이를 입력받아 출력하는 profilePrint 메소드를 만들어보자
	
	public static void profilePrint(String name, int age) { // 매개변수
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 30;
		profilePrint(name, age); // 매개변수가 있는 메소드 호출
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름이 뭐에요?");
		String name2 = scan.next();
		System.out.println("나이가 몇살?");
		int age2 = scan.nextInt();
		
		profilePrint(name2,age2);
		// 입력받은 정보로 profilePrint 메소드 호출
		
		scan.close();

	}

}
