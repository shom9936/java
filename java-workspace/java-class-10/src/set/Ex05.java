package set;
import java.util.*;

class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("이순신", 40));
		set.add(new Person("홍길동", 20));
		set.add(new Person("성춘향", 22));
		set.add(new Person("이순신", 40));
		
		Iterator<Person> iter = set.iterator();
		
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person.name + " : " + person.age);
		}
		
		System.out.println();
		
	}

}
