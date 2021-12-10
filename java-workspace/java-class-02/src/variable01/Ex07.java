package variable01;

public class Ex07 {
	public static void main(String[] args) {
		
//		byte a = 128; // 지정된 크기보다 더 큰 수를 담을 수 없다.
		byte b = 127;
		byte c = -128;
		
		System.out.println(b);
		System.out.println(c);
		
		long l = 1234567891234567891L;
		float f = 123456789123456789123f;
		//실수는 더 큰 수가 표현이 가능하다.
		double d = 123456789123456789123456789d; // or 123456789123456789123456789.0
		
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
	}
}
