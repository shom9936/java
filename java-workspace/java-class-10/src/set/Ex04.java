package set;

import java.util.*;

class SimpleNumber2{
	
	int num;
	
	public SimpleNumber2(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNumber2) {
			SimpleNumber2 simple = (SimpleNumber2)obj;
			return simple.num == this.num;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		HashSet<SimpleNumber2> set = new HashSet<>();
		
		set.add(new SimpleNumber2(30));
		set.add(new SimpleNumber2(20));
		set.add(new SimpleNumber2(30));
		
		System.out.println("저장된 데이터 수 : " + set.size());
		
		Iterator<SimpleNumber2> iter = set.iterator();
		
		while(iter.hasNext()) {
			SimpleNumber2 simple = iter.next();
			System.out.println(simple.num);
		}

	}

}
