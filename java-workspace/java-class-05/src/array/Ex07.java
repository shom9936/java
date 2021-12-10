package array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		// 학생 3명의 이름, 국어, 영어, 성적 입력받고
		// 총점과 순위를 나타내보자
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(i+1+"번째 학생의 이름 : ");
			name[i] = scan.next();
			System.out.print(i+1+"번째 학생의 국어점수 : ");
			kor[i] = scan.nextInt();
			System.out.print(i+1+"번째 학생의 영어점수 : ");
			eng[i] = scan.nextInt();
			total[i] = kor[i] + eng[i];
		}
		
//		int[] temp = new int[3];
//		
//		for(int i=0; i<3; i++) temp[i] = total[i];
//		
//		int index = 0;
//		for(int i=0; i<3; i++) {
//			int max = -1;
//			for(int j=0; j<3; j++) {
//				if(temp[j] > max) {
//					index = j;
//					max = temp[j];
//				}
//			}
//			temp[index] = -1;
//			rank[index] = i+1;
//		}
		// 위 코드는 동점이 있을경우 무의미
		
		for(int i=0; i<3; i++) {
			rank[i] = 1;
			for(int j=0; j<3; j++) {
				if(total[i] < total[j]) rank[i]++;
			}
		}
		// 쌤 코드 훨씬 깔끔
		
		for(int i=0; i<3; i++) {
			System.out.println("이름 : " + name[i]);
			System.out.println("총합 : "+ total[i]);
			System.out.println("순위 : " + rank[i]);
			System.out.println();
		}
		
		scan.close();

	}
}
