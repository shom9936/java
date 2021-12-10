package array;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		// 배열 중에 2개의 인덱스를 입력받아 값을 교환하기
		
		Scanner scan = new Scanner(System.in);
		int[] array = {1,2,3,4,5};
		System.out.println("교환전 array 배열");
		for(int i=0; i<array.length; i++) System.out.print(array[i]+ " ");
		System.out.println();
		
		System.out.print("첫번째 index 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 index 입력 : ");
		int num2 = scan.nextInt();
		
		int temp = array[num1];
		array[num1] = array[num2];
		array[num2] = temp;
		
		System.out.println("교환후 array 배열");
		for(int i=0; i<array.length; i++) System.out.print(array[i]+ " ");
		
		scan.close();
		
		
	}

}
