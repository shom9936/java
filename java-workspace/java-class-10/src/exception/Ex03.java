package exception;

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1 / 0);
			// ArithmeticException 발생
			System.out.println("try 블록!"); // 실행 안됨
		}
		catch(ArithmeticException ae) {
			
			System.out.println("ArithmeticException 예외 발생!");
			
		}
		catch(Exception e) { // ArithmeticException 제외 한 모든 예외처리 가능
			// Exception은 모든 예외를 처리할 수 있다.
			// 그래서 제일 마지막에 와야한다.
			System.out.println("Exception 예외 발생!");
		}

	}

}
