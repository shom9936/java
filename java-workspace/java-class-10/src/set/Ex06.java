package set;

import java.util.*;

class Person2{
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Integer, String 등과 같이 프로그램에서 제공해주는 객체가 아닌
	// 우리가 직접 만드는 객체에서 equals 메소드를 오버라이딩 하지 않고 사용하면
	// 그냥 '==' 연산자를 사용하는 것과 같다는 것이 되어버린다.
	// 무조건 equals(), hashCode(), 오버라이딩해서 재정의 할 것
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 person = (Person2)obj;
			return person.age == this.age && person.name.equals(this.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//return (name + age).hashCode();
		return Objects.hash(name + age);
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		
		HashSet<Person2> set = new HashSet<>();
		
		set.add(new Person2("홍길동", 20));
		set.add(new Person2("이순신", 20));
		set.add(new Person2("홍길동", 20));
		
		Iterator<Person2> iter = set.iterator();
		
		while(iter.hasNext()) {
			Person2 person = iter.next();
			System.out.println(person.toString());
		}
		

	}

}
