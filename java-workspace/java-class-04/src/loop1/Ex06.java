package loop1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//for문을 사용해서 숫자를 5번 입력받고, 입력받을 때마다 더해지는 프로그램을 만들어보자
		
		Scanner scan = new Scanner(System.in);
		
		int num, sum = 0;
		
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			num = scan.nextInt();
			sum += num;
			System.out.printf("%d번째 합계 : %d\n",i+1,sum);
		}
		
		scan.close();
		
	}

}
