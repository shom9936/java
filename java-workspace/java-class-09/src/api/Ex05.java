package api;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		
		Random r = new Random(/*종자값*/System.currentTimeMillis());
		
		// 종자값(seed)을 설정하여 난수를 발생
		// 기본적으로 System.currentTimeMillis()로 해서
		// 종자값이 다르게 한다.
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(50));
		System.out.println(r.nextLong());
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		System.out.println(r.nextBoolean());
		
		byte[] by = new byte[3];
		r.nextBytes(by);
		// byte[]에 byte타입 난수를 발생해서 채워줌
		for(byte b : by) {
			System.out.println(b);
		}
		
	}

}
