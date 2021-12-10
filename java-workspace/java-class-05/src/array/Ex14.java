package array;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		// 동전교환 프로그램 만들어보기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("동전으로 교환할 금액을 입력하세요: ");
		int money = scan.nextInt();
		int[] coin = {500, 100, 50, 10, 1};
		System.out.println("교환할 돈 : " + money + "원");
		
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i] + "원 : "+ money / coin[i] + "개");
			money = money % coin[i];
		}
		scan.close();

	}

}
