package list;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add(new String("머루"));
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과"); // 중복이 허용된다.
		
		int index1 = list.indexOf("사과");
		System.out.println("첫번째 사과 : " + index1);
		// indexOf() 메소드는 ()안에 데이터(값)를 입력하면 해당 인덱스 반환
		// 만약 중복된 값이 있으면, 맨앞에 인덱스 반환
		
		int index2 = list.lastIndexOf("사과");
		System.out.println("마지막 사과 : " + index2);
		// lastIndexOf() 메소드는 ()안에 데이터(값)를 입력하면 해당 인덱스 반환
		// 만약 중복된 값이 있으면, 마지막 인덱스 반환
		
		int num = list.size();
		for(int i =0; i<num; i++) {
			System.out.println(i + " : "  + list.get(i));
		}
	}

}
