package inner;

// 로컬클래스 예제

class LocalEx{
	
	void method() {
		final int x = 100;
		// final로 선언해야 한다.
		
		class LocalInner{
			int y = 200;
			//static int z = 300; // static은 사용할 수 없다.
			public void disp() {
				//x= 200; // 변경안됨
				System.out.println("method x : " + x);
				System.out.println("methidInner y : " + y);
			}
		}
		
		LocalInner inner = new LocalInner();
		inner.disp();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		LocalEx ex = new LocalEx();
		ex.method();

	}

}
