package map;

import java.util.*;

// Food 클래스를 만들고
// 필드를 private String food; 로 한다.
// 생성자를 통해 초기화를 하고 필드를 리턴하는 get 메소드를 만든다.
// equals, hashcode 메소드를 오버라이딩해서 재정의 해보자

class Food{
	private String food;
	
	public Food(String food) {
		this.food = food;
	}
	
	public String getFood() {
		return food;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Food) {
			Food fd = (Food)obj;
			return fd.food.equals(this.food);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return food.hashCode();
	}
}

public class Ex05 {

	public static void main(String[] args) {
		
		Map<Food , Integer> map = new HashMap<>();
		
		map.put(new Food("치킨"), 4);
		map.put(new Food("짜장면"), 7);
		map.put(new Food("김치찌개"), 5);
		map.put(new Food("라면"), 15);
		map.put(new Food("치킨"), 7);
		
		Set<Food> set = map.keySet();
		Iterator <Food> iter = set.iterator();
		
		while(iter.hasNext()) {
			Food fd = iter.next();
			int num = map.get(fd);
			System.out.println("내가 한달에 먹는 음식 > " + fd.getFood() + " : " + num);
		}
		

	}

}
