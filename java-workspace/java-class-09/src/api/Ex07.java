package api;

import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("hello1java1world~~","1");
		// 긴 문자열을 지정된 구별자를 기준으로 토큰이라는 작은 문자열로 잘라내는데 사용
		// 보통 StringTokenizer보다 더 발전한 것이 Scanner클래스이다.
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
