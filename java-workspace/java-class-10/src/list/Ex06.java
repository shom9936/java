package list;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		
		// 자신이 좋아하는 연예인 5명을 String[] 배열에 담고
		// String 배열을 ArrayList 타입으로 바꾼 후 향상된 for문으로 출력해보자
		
		Scanner scan = new Scanner(System.in);
		
		String[] strArray = {"유재석", "강호동", "최아린", "배유빈", "김유정"};
		
		List<String> list = Arrays.asList(strArray);
		
		for(String n : list) {
			System.out.println(n);
		}
		
		// Arrays.asList()는 Arrays의 정적 클래스인 ArrayList를 리턴한다.
		// java.util.ArrayList와는 다른 클래스이다.
		// java.util.Array.ArrayList 클래스는 set(), get(), contain()
		// 매소드는 가지고 있지만 원소를 추가하는 메소드는 가지고 있지 않기 때문에
		// 사이즈를 바꿀 수 없다.
		
		list.set(2,"미미");
		
		System.out.println();
		for(String n : list) {
			System.out.println(n);
		}
		
	}

}
