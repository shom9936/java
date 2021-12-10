package exception;

// 예외처리 예제(클래스)
class MyException extends Exception{
	
	private String message;
	
	public MyException(String str) {
		super(str);
		System.out.println("MyException에서 예외 처리!");
	}
	
	@Override
	public String getMessage() {
		message = super.getMessage() + "나의 예외 처리!";
		return message;
	}
	
}

public class Ex06 {

	public static void main(String[] args) {
		
		try {
			throw new MyException("Ex06 class : ");
			// MyException 클래스에서 예외처리
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
