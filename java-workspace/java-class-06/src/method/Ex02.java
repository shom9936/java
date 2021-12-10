package method;

public class Ex02 {
	
	public static void hello() {
		for(int i=0; i<5; i++) {
			System.out.println("hello");
			if(i==3) return; // return 값이 없는 void 메소드에서 return을 쓰면 메소드 강제종료
		}
	}
	
	public static void name() {
		System.out.println("저는 홍길동입니다");
	}

	public static void main(String[] args) {
		
		name();
		hello();

	}

}
