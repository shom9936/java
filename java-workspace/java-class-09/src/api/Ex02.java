package api;

import java.util.Objects;

// Member 클래스를 만든다.
// Member 클래스의 필드는 String name; int age; String number; 이다.
// 생성자를 통해 초기화를 시켜준다.
// equals() 메소드와 hashCode 메소드 toString() 메소드를 오버라이딩하여 재정의 해보자

class Member{
	private String name;
	private int age;
	private String number;
	
	public Member(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return this.name.equals(member.name) && member.age == this.age && this.number.equals(member.number);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name + age + number);
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n핸드폰 번호 : " + number;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Member member = new Member("홍길동",20,"010-2233-4455");
		Member member2 = new Member("고길동",20,"010-2233-4455");
		
		System.out.println(member.equals(member2));
		
		System.out.println(member.hashCode());
		System.out.println(member2.hashCode());
		
		System.out.println(member.toString());
		System.out.println(member2.toString());
		
	}

}
