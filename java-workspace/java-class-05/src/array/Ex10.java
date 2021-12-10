package array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// index를 입력받아 값 구하기
		
		int[] array = {100,200,300,400,500};
		Scanner scan = new Scanner(System.in);
		System.out.println("array배열의 인덱스는 0~4까지 입니다.");
		
		for(;;){
			System.out.println("인덱스를 입력하세요");
			int index = scan.nextInt();
			if(index >4 || index < 0) {
				System.out.println("array배열의 인덱스는 0~4까지 입니다.");
				continue;
			}
			System.out.printf("입력하신 인덱스의 값은 %d입니다\n",array[index]);
			break;
		}
		
		scan.close();

	}

}
