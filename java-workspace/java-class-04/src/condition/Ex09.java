package condition;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//주민등록번호를 입력받아 성별을 맞추는 프로그램을 만들어보자
		Scanner scan = new Scanner(System.in);
		char gender = ' '; // 성별
		String ssn = " "; // 주민등록번호
		
		System.out.println("당신의 주민등록번호를 입력하세요 : ");
		System.out.println("예시 : 123456 - 1234567");
		
		ssn = scan.nextLine();
		
		gender = ssn.charAt(7);
//		문자중에 0부터 시작해서 7번째 문자를 뽑는다
		
		switch(gender) {
		case '1':
		case '3' :
			System.out.println("당신은 남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다");
			break;
		default :
			System.out.println("유효하지 않은 주민등록번호입니다");
		}
		
		scan.close();

	}

}
