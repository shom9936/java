package condition;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//정수를 입력받아 3의 배수인지 5의 배수인지 알아보기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if(a % 3 == 0 && a % 5 == 0) System.out.println("입력한 수는 3과 5의 배수입니다");
		else if(a % 3 == 0) System.out.println("입력한 수는 3의 배수입니다");
		else if(a % 5 == 0) System.out.println("입력한 수는 5의 배수입니다");
		else System.out.println("입력한 수는 3의 배수도 5의 배수도 아닙니다");
		
		scan.close();

	}

}
