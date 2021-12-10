package set;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		// String 타입의 HashSet 클래스를 생성한 후
		// 과일의 이름을 5개 넣는다.
		// 반복자(Iterator)를 이용해서 하나씩 출력해보자
		
		Set<String> set = new HashSet<>();
		//HashSet<String> set = new HashSet<>(); // <- 이렇게 해도 상관없음
		
		set.add(new String("오렌지"));
		set.add("사과");
		set.add("포도");
		set.add("감귤");
		set.add("파인애플");
		
		int size = set.size();
		System.out.println("총 과일 개수 :" + size);
		
		Iterator<String> setIter = set.iterator();
		while(setIter.hasNext()){
			System.out.println(setIter.next());
		}

	}

}
