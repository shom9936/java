package list;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		for(String i : list) {
			System.out.println(i);
		}
		
		Iterator<String> iterator = list.iterator(); // 반복자
		// 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
		// Iterator 객체는 컬렉션 객체의 iterator() 메소드는 호출하여 얻어올 수 있다.
		
		while(iterator.hasNext()) { // 요소(데이터)가 있는지 확인 후 true, false 반환
			String str = iterator.next(); // 요소를 하나씩 가져온다.
			System.out.println(str);
		}
		
		iterator = list.iterator();
		// Iterator는 1회성이다. 필요하면 다시 객체를 얻어와야 한다.
		
		while(iterator.hasNext()) { // 요소(데이터)가 있는지 확인 후 true, false 반환
			String str = iterator.next(); // 요소를 하나씩 가져온다.
			System.out.println(str);
			iterator.remove();
		}
		
		System.out.println(list.isEmpty());
		


	}

}
