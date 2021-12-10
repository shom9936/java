package list;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		// String 타입의 ArrayList를 생성한 후
		// 자신이 좋아하는 연예인 5명 이름을 넣어보자
		// 이름을 향상된 for문과 일반 for문으로 출력해보자
		
		List<String> list = new ArrayList<>();
		// List<String> list = new ArrayList<String>(); // <- 왼쪽에 <String> 이 있으면 오른쪽은 생략 가능
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자신이 좋아하는 연예인 5명 입력");
		for(int i =0; i<5; i++) {
			String str = scan.next();
			list.add(str);
		}
		
		System.out.println();
		for(String i : list) { // 향상된 for문
			System.out.println(i);
		}
		
		System.out.println();
		for(int i =0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		

	}

}
