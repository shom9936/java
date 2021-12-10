package map;

import java.util.*;

class ProfileInfo{
	String address;
	String number;
	
	public ProfileInfo(String address, String num) {
		this.address = address;
		this.number = num;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		// HashMap을 이용해서 키 값은 String(이름)
		// value값은 ProfileInfo로 한다.
		// put 메소드로 3명의 키와 벨류를 넣고 키 값을 이용해서 value를 출력해보자
		
		HashMap<String, ProfileInfo> map = new HashMap<>();
		map.put("홍길동", new ProfileInfo("경기도구리시", "010-2459-9965"));
		map.put("성춘향", new ProfileInfo("경기도광명시", "010-2453-9965"));
		map.put("이몽룡", new ProfileInfo("경기도수원시", "010-2124-9965"));
		
		ProfileInfo asd = map.get("홍길동");
		System.out.println("홍길동의 연락처");
		System.out.println("주소 : " + asd.address);
		System.out.println("전화 번호 : " + asd.number);
		
		asd = map.get("성춘향");
		System.out.println("성춘향의 연락처");
		System.out.println("주소 : " + asd.address);
		System.out.println("전화 번호 : " + asd.number);
		
		asd = map.get("이몽룡");
		System.out.println("이몽룡의 연락처");
		System.out.println("주소 : " + asd.address);
		System.out.println("전화 번호 : " + asd.number);
		
		

	}

}
