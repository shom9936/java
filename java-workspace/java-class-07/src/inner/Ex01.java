package inner;

// Inner 클래스에서 Outer 클래스 멤버 접근 예제

class Outer1{
	
	// 필드
	private int x = 100;
	private static int y = 200;
	
	// 메소드
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	class Inner1{
		
		private int y = 300;
		// private static int z = 400; // 사용안된다.
		public void disp() {
			System.out.println("Outer x : " + x);
			System.out.println("Inner y : " + y);
			System.out.println("Inner y : " + this.y);
			System.out.println("Outer y : " + Outer1.y);
			outerMethod1();
			outerMethod2();
		}
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		Outer1 out = new Outer1();
		// 우선 outer1 클래스 객체 생성 해준다.
		
		Outer1.Inner1 inner = out.new Inner1();
		// 생성된 객체로 Inner1 클래스 객체 생성
		
		inner.disp();
		
		
		
	}

}
