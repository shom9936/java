package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		// 예약 시스템 만들어보기
		
		Scanner scan = new Scanner(System.in);
		
		int inwon;
		
		System.out.println("예약 인원수를 입력하세요 : ");
		inwon = scan.nextInt();
		
		String person[] = new String[inwon];
		
		for(int i=0; i< inwon; i++) {
			System.out.println(i+1 + "번째 예약 손님 : ");
			person[i]  = scan.next();
		}
		
		System.out.println("총 인원은 "+ inwon + "명입니다.");
		
		for(int i=0; i<person.length; i++) {
			System.out.println(i+1 + "번째 손님은 "+ person[i]+ "님 입니다.");
		}
		
		scan.close();

	}

}
