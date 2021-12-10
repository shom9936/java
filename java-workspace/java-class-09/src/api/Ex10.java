package api;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		
		String[] strarr = {"watermelon", "Banana", "apple", "melon"};
		
		System.out.println("원본 : " + Arrays.toString(strarr));
		
		Arrays.sort(strarr);
		System.out.println("올림차순 정렬 : " + Arrays.toString(strarr));
		
		Arrays.sort(strarr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("대소문자 구분없이 올림차순 정렬 : " + Arrays.toString(strarr));

	}

}
