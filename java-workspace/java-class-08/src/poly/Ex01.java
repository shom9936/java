package poly;

// 다형성 : 부모클래스 타입으로 자식객체를 얻는 것
// 1. 부모클래스가가지고 있는 모든 멤버들에 접근 할 수 있다.
// 단, 자식클래스에서 메소드 오버라이딩을 했다면 오버라이딩된 자식의 멤버에 접근된다.

// 멤버 필드의 경우, 부모클래스의 멤버필드에만 접근할 수 있다.
// 자식클래스의 멤버필드는 오버라이딩 된 자식클래스의 메소드에 의해서만 접근 할 수 있다.

class A{
	int x = 100;
	
	public void xPrint() {
		System.out.println("부모클래스 x : " + this.x);
	}
}

class B extends A{
	
	int x = 200;
	
	public void xPrint() {
		System.out.println("자식클래스 x : " + this.x);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		B poly = new B();
		System.out.println("poly.x : " + poly.x);
		System.out.println();
		
		A poly2 = poly; // 업캐스팅(자동 형변환)
		System.out.println("poly2.x : " + poly2.x);
		System.out.println();
		
		A poly3 = new B();
		System.out.println("poly3.x : " + poly3.x);
		// 필드는 재정의(오버라이딩)할 수 없다.
		System.out.println();
		
		poly3.xPrint();
		// 자식필드를 사용하고 싶으면 오버라이딩 메소드를 이용
		System.out.println();
		
		B poly4 = (B)poly3; // 다운캐스팅(강제 형변환)
		System.out.println("poly4.x : " + poly4.x);
		System.out.println();
		
	}

}
