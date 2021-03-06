package list;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		// 컴퓨터의 시계로부터 현재 시간을 읽어서
		// 나노세컨드 단위의 long 값을 리턴한다.
		
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		end = System.nanoTime();
		
		System.out.println("ArrayList 걸린 시간 :  " + "" + (end - start) + "ns");
		
		start = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		
		System.out.println("LinkedList 걸린 시간 : " + (end - start) + "ns");
		
	}

}
