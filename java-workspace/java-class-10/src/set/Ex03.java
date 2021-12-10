package set;

import java.util.*;

class SimpleNumber{
	
	int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}
	
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Set<SimpleNumber> set = new HashSet<>();
		set.add(new SimpleNumber(30));
		set.add(new SimpleNumber(20));
		set.add(new SimpleNumber(30));
		
		System.out.println("저장된 데이터 수 : " + set.size());
		
		Iterator<SimpleNumber> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			SimpleNumber simple = setIter.next();
			System.out.println(simple.num);
		}
		
		
		

	}

}
