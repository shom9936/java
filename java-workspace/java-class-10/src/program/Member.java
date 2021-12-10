package program;

public class Member {
	
	private String name;
	private int age;
	private String phoneNum;
	
	public Member(String name, int age, String phoneNum) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return (m.name.equals(this.name)) && (m.phoneNum.equals(this.phoneNum)) && (m.age == this.age);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (name + age + phoneNum).hashCode();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void dispMember() {
		System.out.println(name + " / " + age + " / " + phoneNum);
	}
	
	// 생성자를 통해 필드를 초기화
	// get set 메소드 만들기
	// equals hashcode 메소드 오버라이딩하여 재정의하기
	// 이름과 나이 폰번호 출력하는 disp 메소드 만들기
	
}
