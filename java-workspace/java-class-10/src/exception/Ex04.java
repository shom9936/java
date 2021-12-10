package exception;

public class Ex04 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1/0);
			System.out.println("예외발생시 실행안됨");
		}
		catch(ArithmeticException ae){
			ae.printStackTrace(); // 어떤 예외, 어디서 발생했는지 알려줌
			System.out.println("메세지 : " + ae.getMessage());
		}
		
		try {
			Exception e = new Exception("예외발생!");
			// Exception 인스턴스를 생성할 때 생성자에 String을 넣어주면
			// 이 String이 Exception 인스턴스에 메세지로 저장된다.
			// 이 메세지는 getMessage() 메소드를 이용해서 얻을 수 있다.
			
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("메세지 : " + e.getMessage());
		}
	}

}
