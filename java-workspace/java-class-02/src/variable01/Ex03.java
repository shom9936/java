package variable01;

public class Ex03 {

	public static void main(String[] args) {
		// 변수명을 알아보자
		
		int price1 = 100;
		int $price = 200;
		int _price = 300;
//		int #price = 400; // $ , _ 외에 다른 특수기호 사용 못함
//		int 1price = 500; // 숫자로 시작할 수 없음
		// 특수기호는 되도록 사용하지 않도록 한다.
		
		System.out.println(price1);
		System.out.println($price);
		System.out.println(_price);
		
		String firstname = "java";
		String firstName = "자바";
		//String은 문자열을 저장한다.
		//자바의 변수는 대소문자를 구별한다.
		System.out.println(firstname);
		System.out.println(firstName);
		
	}

}
