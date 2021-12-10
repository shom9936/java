package array;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		// 정수 5개를 입력받아 입력받은 정수 중에서 3의 배수만 출력해보자
		
		Scanner scan = new Scanner(System.in);
		
		int array[] = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("정수 입력 : ");
			array[i] = scan.nextInt();
			
		}
		
		for(int i=0; i<array.length; i++) {
			if(array[i] % 3 == 0) {
				System.out.printf("입력하신 수 %d는 3의 배수입니다\n",array[i]);
			}
		}
		scan.close();

	}

}
