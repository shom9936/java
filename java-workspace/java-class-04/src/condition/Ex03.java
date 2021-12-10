package condition;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//if else문을 사용해서
		//2개의 수를 입력받고 몇번째 입력받은 수가 큰 수 인지 확인하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력: ");
		int a = scan.nextInt();
		System.out.print("두 번째 수를 입력: ");
		int b = scan.nextInt();
		
		if(a > b) System.out.println("첫 번째 수가 큽니다.");
		else if(a < b) System.out.println("두 번째 수가 큽니다.");
		else System.out.println("두 수가 같습니다.");
		
		scan.close();
	}
}
