package set;

import java.util.*;

public class Ex01 {

	
	public static void main(String[] args) {
		
		// Set : 데이터를 중복 저장하지 않음.
		// HashSet 클래스는 내부에 있는 해쉬테이블을 사용 저장한다.
		// 데이터의 저장 순서를 유지하지 않는다.
		// 데이터의 중복 저장을 허용하지 않는다.
		
		Set<String> set = new HashSet<>();
		
		set.add(new String("홍길동")); // add : 값 넣기
		// 원칙 : new 연산자를 이용해서 객체를 넣는다.
		
		set.add("이순신");
		set.add("홍길동"); // set에 중복값 저장 불가
		set.add("성춘향");
		set.add("이몽룡");
		
		System.out.println("set의 크기 : " + set.size());
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) { // 데이터가 있는지 확인 후, 있으면 true 없으면 false
			System.out.println(setIter.next()); // 값(데이터) 꺼내기
		}
		System.out.println();
		
		set.remove("홍길동"); // 값 제거
		
		setIter = set.iterator(); // 반복자 재생성
		// Iterator는 1회성이다.
		// 모든 요소를 next()로 읽고 나면 더 이상 읽을 요소가 없기 때문에
		// 더 요소를 읽고 싶으면 재생성을 해주어야 한다.
		
		System.out.println("set의 크기 : " + set.size());
		while(setIter.hasNext()) { // 데이터가 있는지 확인 후, 있으면 true 없으면 false
			System.out.println(setIter.next()); // 값(데이터) 꺼내기
		}
		System.out.println();
		
		set.clear(); // 전체 삭제
		
		System.out.println(set.isEmpty());
		// isEmpty : 값이 비어있으면 true 반환
	}

}
