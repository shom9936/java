package modifier;

public class Ex05 {
	
	// 정적 메소드
	
	public static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		
		Ex05 ex = new Ex05();
		System.out.println(ex.add(10, 20));
		// 정적메소드는 원칙적으로 클래스 이름으로 접근
		// 객체로 접근 시 이클립스에서 경고표시
		
		System.out.println(Ex05.add(10, 20));
	}

}
