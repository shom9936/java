package array;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// 값을 입력받아 인덱스 구하기
		int[] array = {10,20,30,40,50};
		Scanner scan = new Scanner(System.in);
		System.out.println("array배열의 값은 10 20 30 40 50입니다");
		System.out.println("값을 입력 하세요");
		
		int value = scan.nextInt();
		
		int i = 0;
		while(i<5) {
			if(value == array[i]) {
				System.out.printf("입력하신 값(%d)의 인덱스는 %d입니다.\n",value,i);
				break;
			}
			i++;
		}
		
		scan.close();

	}

}
