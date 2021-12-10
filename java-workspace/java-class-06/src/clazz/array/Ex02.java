package clazz.array;

class Name{
	
	String name; // 필드
	
	public Name() {} // 기본생성자
	
	public Name(String name) { // name을 받아서 초기화 생성자
		this.name = name;
	}
	
	public String getName() { // name을 리턴해주는 메소드
		return name;
	}
	
	public void setName(String name) { //필드에 셋팅해주는 메소드
		this.name = name;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Name[] name = new Name[3]; // 객체배열 생성
		name[0] = new Name("홍길동"); // 객체를 넣어준다.
		name[1] = new Name("성춘향");
		name[2] = new Name("이순신");
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i].getName()); // 
			//객체원소에 도트연산자(.)를 사용해서 필드나 메소드 접근
		}
		System.out.println();
		
		name[1].name = "이몽룡"; // 필드로 접근
		name[2].setName("장보고"); // 메소드로 접근
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i].name);
			//객체원소에 도트연산자(.)를 사용해서 필드나 메소드 접근
		}
		
	}

}
