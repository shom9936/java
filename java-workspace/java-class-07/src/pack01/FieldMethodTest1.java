package pack01;

public class FieldMethodTest1 {

	public static void main(String[] args) {
		
		FieldMethodEx ex = new FieldMethodEx();
		
		// 같은 클래스 안에선 모두 접근가능
		System.out.println(ex.str1);
		System.out.println(ex.str2);
		System.out.println(ex.str3);
		//System.out.println(ex.str4);
		System.out.println();
		
		ex.method1();
		ex.method2();
		ex.method3();
		//ex.method4();

	}

}
