package map;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {

		// HashMap을 이용해서 아이디하고 비밀번호를 입력
		// 아이디, 비번 세트 4개
		// 아이디 String, 비밀번호 String
		// keySet 메소드로 Set에 key 값을 넣어준 뒤 Iterator를 이용해서
		// 아이디와 비밀번호를 출력해보세요
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("shom9936", "123456");
		map.put("sho9937", "1234567");
		map.put("shoasm9938", "12345678");
		map.put("shomds9939", "123456789");
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			String pw = map.get(key);
			System.out.println(key + " : " + pw);
		}
		

	}

}
