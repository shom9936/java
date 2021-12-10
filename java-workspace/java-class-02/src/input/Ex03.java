package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// Scanner를 이용해서 이름 나이 키 몸무게를 입력받아 출력해보세요
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		
		System.out.print("키 : ");
		double length = scan.nextDouble();
		
		
		System.out.print("몸무게 : ");
		double weight = scan.nextDouble();
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(length);
		System.out.println(weight);
		
		scan.close();
	}
}
