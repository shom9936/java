package exception;

public class Ex01 {

	public static void main(String[] args) {
		
//		system.out.println(); // <- System
		// 컴파일 에러 : 컴파일 자체가 안됨
		// javac.exe : 자바 컴파일러
		// 자바 컴파일러 역할 : 번역(구문체크)
		
		// System.out.println(args[0]);
		// 실행에러 : 
		
		try {
			System.out.println(args[0]);
			// 예외가 발생할 가능성이 있는 문장들을 넣는다.
		}
		catch(Exception e) {
			// 예외 처리를 위한 문장을 넣는다.
			System.out.println("예외 발생");
			
		}
		finally {
			System.out.println("항상 수행");
			// 예외의 발생 여부에 관계없이 항상 수행되어야 하는 문장들을 넣는다.
			// finally 블럭은 try - catch 문의 맨 마지막에 위치해야 한다.
		}
	}

}
