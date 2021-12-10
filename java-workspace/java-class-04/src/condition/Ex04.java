package condition;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		// 정수를 입력받아 홀수인지 짝수인지 알아보기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if(a % 2 == 0) System.out.println("입력하신 수는 짝수입니다");
		else System.out.println("입력하신 수는 홀수입니다");
		
		scan.close();
	}
}
