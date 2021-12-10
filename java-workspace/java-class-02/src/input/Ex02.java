package input;

import java.util.Scanner;

// Scanner라는 클래스는 java.utill 패키지 안에 있는데
// 이것을 가져와서 이 프로그램에서 사용하겠다.
// import 할 때는 ctrl + shift + 영문자 o

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = scan.next();
		// 공백전까지 문자열을 읽어온다.
		// 문자열을 입력받은 것을 String 변수에 담는다.
		System.out.println(str);
		
		System.out.println("정수를 입력하세요 : ");
		int a = scan.nextInt();
		// 정수 : nextInt()
		// 공백전까지 정수를 읽어온다.
		System.out.println(a);
		
		System.out.println("실수를 입력하세요 : ");
		double b = scan.nextDouble();
		// 실수 : nextFloat() , nextDouble()
		// 공백전까지 실수를 읽어온다.
		System.out.println(b);
		
		System.out.println("문자열을 입력하세요 : ");
		scan.nextLine(); // 엔터처리
		String str2 = scan.nextLine();
		// 문자열 : nextLine()
		// 라인전체(공백포함) 데이터를 읽어온다
		// 주의사항 : next()나 nextInt()등을 쓰고 nextLine()을 쓸 경우
		// 남아있는 엔터를 처리하기 때문에 남아있는 엔터를 처리해 주어야 한다.
		System.out.println(str2);
		
		scan.close();
		// I/O 사용시에는 연결을 맺고 끊음을 확실히 해줘야 한다.
	}
}
