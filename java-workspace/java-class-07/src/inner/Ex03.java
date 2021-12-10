package inner;

// outer 클래스의 static 멤버 inner 클래스 사용예제

class Outer3{
	private int x = 100;
	private static int y = 200;
	
	static class Inner3{
		private int z = 300;
		private static int zz = 400;
		
		public void disp() {
			//System.out.println("x : " + x); // 일반 멤버는 사용할 수 없다.
			System.out.println("Outer y : " + y);
			System.out.println("Inner z : " + z);
			System.out.println("Inner zz : " + zz);
			z++;
			zz++;
			
		}
		
		
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		Outer3.Inner3 in = new Outer3.Inner3();
		in.disp();
		
		Outer3.Inner3 in2 = new Outer3.Inner3();
		in2.disp();
		//System.out.println(Outer3.y);

	}

}
