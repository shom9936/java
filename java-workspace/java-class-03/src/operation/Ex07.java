package operation;

public class Ex07 {
	public static void main(String[] args) {
		// 3항 연산자에 대해 알아보자
		
		boolean a = false;
		String str = (!a)? "참입니다." : "거짓입니다.";
		System.out.println(str);
	}
}
