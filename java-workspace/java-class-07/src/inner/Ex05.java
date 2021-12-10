package inner;

class Outer5{
	
	int y = 200;
	
	public Outer5() {
		this.disp();
	}
	
	public void disp() {
		System.out.println("Outer5 class");
	}
}

//익명 자식 객체 예제

public class Ex05 {

	public static void main(String[] args) {
		
		final int x = 100; // final로 선언해야 익명 클래스에서 사용 가능
		// final 생략이 가능하지만 익명객체에서 변경이 불가능
		
		new Outer5() {
			@Override
			public void disp() { // 오버라이딩, 재정의
				System.out.println("x : " + x);
				System.out.println("y : " + y);
			}
			
		}; // 세미콜론(;) 해준다.
		
		// 어노테이션
		// - 소스코드에 메타코드를 주는 것
		// - 컴파일러에게 코드 문법 에러를 체크하도록 정보제공
		// - 실행 시(런타임 시) 특정 기능을 실행하도록 정보제공
		
		// @Override 어노테이션
		// - 컴파일러에게 코드 문법 에러를 체크하도록 정보제공
		// - 메소드 선언 시 사용되며, 메소드가 오버라이드(재정의)된 것임을
		// 	 컴파일러에게 알려주어 컴파일러가 검사를 하도록 한다.
		// - 오버라이드가 되지 않았다면, 컴파일러는 에러를 발생시킨다.
		
	}

}
