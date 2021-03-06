package api;

import java.util.Objects;

class Person{
	
	private String name;
	private int age;
	private final String SSN;
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.SSN = ssn;
	}
	
	// Object의 equals() 메소드와 hashCode()메소드를
	// 오버라이딩해서 재정의 해주어야 한다.
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			return (name.equals(person.name) && (age == person.age) && (SSN.equals(person.SSN)));
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//return (name + age + SSN).hashCode(); // 방법1
		return Objects.hash(name,age,SSN);
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n주민번호 : " + SSN;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 우리가 만든 클래스도 재정의 해야한다!!

		Person person1 = new Person("홍길동", 20, "123456-1234567");
		Person person2 = new Person("홍길동", 20, "123456-1234567");
		
		System.out.println("Person equals : " + person1.equals(person2));
		
		System.out.println("person1.hashCode : " + person1.hashCode());
		System.out.println("person2.hashCode : " + person2.hashCode());
		
		System.out.println(person1.toString());
	}

}
