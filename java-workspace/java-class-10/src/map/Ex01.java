package map;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		// new 연산자 뒤에는 타입 파라미터 생략가능
		
		// 값 넣기
		
		map.put(new Integer(1), new String("홍길동"));
		map.put(2, "성춘향");
		map.put(3, "이순신");
		map.put(4, "이몽룡");
		map.put(1, "홍길순"); // 동일한 키로 데이터를 넣으면 덮어씌워진다.
		
		// Map의 요소갯수를 반환
		
		System.out.println(map.size());
		
		System.out.println(map); // 전체 출력
		System.out.println(map.get(1)); // key를 가지고 value를 출력
		System.out.println(map.get(5)); // key가 존재하지않으면 null을 리턴
		System.out.println();
		
		// Map에는 Iterator가 존재하지않는다. 고로 key들을 set타입으로 변환 후 iterator를 사용한다.
		
		// 객체를 하나씩 처리
		Set<Integer> keySet = map.keySet(); // keySet() 호출 시 Set타입으로 반환
		
		Iterator<Integer> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			int key = iter.next();
			String value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
		
		map.remove(1);
		map.remove(2);
		
		System.out.println(map);
		
		map.clear();
		
		System.out.println(map.isEmpty());

	}

}
