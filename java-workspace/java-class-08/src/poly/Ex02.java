package poly;

class A1{
	
	int x = 100;
	
	public void aaa() {
		System.out.println("부모 aaa()메소드");
	}
	
	public void bbb() {
		System.out.println("부모 bbb()메소드");
	}
}

class B1 extends A1{
	
	int x = 200;
	int y = 300;
	
	@Override
	public void bbb() {
		System.out.println("자식 bbb() 오버라이딩 메소드");
		System.out.println("자식 x : " + this.x);
		System.out.println("자식 y : " + this.y);
		ccc();
	}
	
	public void ccc() {
		System.out.println("자식 ccc()메소드");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		A1 poly = new B1();
		// 다형성은 부모타입의 변수를 자식객체로 생성하는 것.
		// 부모위주이다.(부모필드와 부모메소드만 접근가능)
		
		System.out.println(poly.x); //부모필드로 접근
//		System.out.println(poly.x); // 자식멤버필드 접근 안됨
		
		poly.aaa();
		poly.bbb(); // 업캐스팅한 클래스의 자식클래스 개체 및 메소드를 이용하고싶다면 오버라이딩된 걸 이용 
//		poly.ccc(); // error

	}

}
