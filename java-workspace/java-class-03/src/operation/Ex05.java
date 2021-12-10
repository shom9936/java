package operation;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		//두 정수를 입력받아 사칙연산 프로그램을 만들어보자
		
		int a, b;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		a = scan.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요 : ");
		b = scan.nextInt();
		
		result = a + b;
		System.out.printf("%d + %d = %d\n",a,b,result);

		result = a - b;
		System.out.printf("%d - %d = %d\n",a,b,result);

		result = a * b;
		System.out.printf("%d * %d = %d\n",a,b,result);

		result = a / b;
		System.out.printf("%d / %d = %d\n",a,b,result);
		
		scan.close();
	}
}
