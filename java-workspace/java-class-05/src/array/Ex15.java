package array;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {


		// 정수 5번을 입력받아 array1 배열에 값을 넣은 후
		// 3과 나누어 떨어지는(3의 배수) 정수의 개수를
		// array2 배열의 길이로 만든 후 array2 배열에 담고 출력
		
		Scanner scan = new Scanner(System.in);
		int array1[] = new int[5];
		
		int num = 0;
		for(int i=0; i<array1.length; i++) {
			System.out.print("정수 입력 : ");
			array1[i] = scan.nextInt();
			if(array1[i] % 3 == 0) {
				num++;
			}
		}
		
		int[] array2 = new int[num];
		int inx = 0;
		for(int i=0; i<array1.length; i++) {
			if(array1[i]%3 == 0) {
				array2[inx++] = array1[i];
			}
		}
		
		for(int i=0; i<array2.length; i++) {
			System.out.println("array2["+ i + "] :" + array2[i]);
		}
		
		scan.close();
	}

}
