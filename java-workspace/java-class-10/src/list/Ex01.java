package list;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add(new String("홍길동"));
		// 원칙 : new 연산자를 이용해서 넣는다.
		list.add("성춘향");
		list.add("이몽룡");
		
		int size = list.size(); // 저장되어있는 전체 객체의 수를 리턴
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		for(String str1 : list) { // 향상된 for문
			System.out.println(str1);
		}
		
		list.add(0, "이순신"); // index 0번에 끼워넣는다.
		// list : 이순신 홍길동 성춘향 이몽룡
		list.add(2, "장보고"); // index 2번에 끼워넣는다.
		// list : 이순신 홍길동 장보고 성춘향 이몽룡
		
		list.set(0, "세종대왕"); // index 0번에 값을 대체한다.
		// list : 세종대왕 홍길동 장보고 성춘향 이몽룡
		
		String str2 = list.get(2); // index 2번의 객체를 리턴
		System.out.println("2 : " + str2);
		System.out.println();
		
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
		
		list.remove(1); // index 1번의 객체를 삭제한다.
		list.remove("장보고"); // "장보고" 객체를 삭제한다.
		
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
		
		list.clear(); // 저장된 모든 객체를 삭제한다.
		boolean bool = list.isEmpty();
		// 비어있으면 true , 값이 있으면 false를 반환한다.
		System.out.println(bool);
		
		
		
	}

}
