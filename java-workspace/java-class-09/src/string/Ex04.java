package string;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
		//String 메소드
		
		String str1 = "Hello world";
		
		// charAt : 해당위치의 문자 하나를 char형으로 반환한다.
		System.out.println("charAt : " + str1.charAt(0));
		
		// isEmpty : 해당 변수가 비어있으면 true를 아니면 false를 리턴해준다.
		System.out.println("isEmpty : " + str1.isEmpty());
		
		// length : 문자열의 길이를 반환한다.
		System.out.println("length : " + str1.length());
		
		// toCharArray : 문자열을 한글자씩 char배열로 반환한다.
		char[] array = str1.toCharArray();
		System.out.println(Arrays.toString(array));
		// Arrays 클래스는 배열을 다룰 수 있게 해주는 유용한 클래스
		
		// replace : 문자열을 교체해준다.
		System.out.println(str1.replace("Hello", "Hi"));
		

	}

}
