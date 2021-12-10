package pack01;

// default 클래스는 다른 패키지에서는 접근할 수 없음.
class B{
	// 필드
	int x = 100;
	
	// 생성자
	public B() {
		System.out.println("클래스 B의 생성자입니다.");
		System.out.println("같은 패키지에서만 접근 가능합니다.");
	}
	
}

// public 클래스는 다른 패키지에서도 접근 가능
public class A {
	// 필드
	public int x = 10;
	
	// 생성자
	public  A() {
		System.out.println("클래스 A의 생성자입니다.");
		System.out.println("다른 패키지에서도 접근가능합니다.");
	}

}
