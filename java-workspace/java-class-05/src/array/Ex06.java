package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// 5개의 숫자를 입력받아 작은 수부터 나열하세요
		// 배열, for문 if문 Scanner 사용
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int temp;
		
		for(int i=0; i<num.length; i++) {
			System.out.print("숫자 입력: ");
			num[i] = scan.nextInt();
		}
		
		for(int i =0; i<num.length; i++) {
			for(int j=i+1; j <num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i=0; i<num.length; i++) System.out.println(num[i]);
		
		scan.close();

	}

}
