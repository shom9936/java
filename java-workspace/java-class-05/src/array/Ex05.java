package array;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		// 배열과 for문을 이용해서 5명의 국어점수를 입력받고
		// 각 학생의 국어점수를 출력하고
		// 총 국어점수의 합과 평균을 구해보세요
		
		Scanner scan = new Scanner(System.in);
		
		int[] kor = new int[5];
		int sum = 0;
		
		for(int i=0; i<kor.length; i++) {
			System.out.print((i+1) + "번째 학생의 국어점수 입력 :");
			kor[i] = scan.nextInt();
			sum += kor[i];
		}
		
		for(int i=0; i<kor.length; i++) {
			System.out.println((i+1)+ "번째 학생의 국어점수 :" + kor[i]);
		}
		System.out.println("총 국어점수의 합 : " + sum);
		System.out.println("국어점수 평균 : " + sum/(double)kor.length);
		
		scan.close();
		
	}
}
