package clazz;

class People{ // 설계도
	// 클래스(설계도) 안에 구성멤버는
	// 필드, 생성자, 메소드
	
	// 필드(속성)
	// class에 선언된 변수를 필드라고 한다.
	String name;
	int age;
	
	public People() {} // 생성자
	// 생성자는 클래스 이름과 같다
	
	public void walk( ) {} // 메소드
	public void run() {} 
}

public class ClassMain {

	public static void main(String[] args) {
		
		People object = new People();
		// 클래스(타입) 변수 = new 생성자; // 생성자는 클래스 이름하고 똑같은 메소드이다.
		// People클래스(설계도)를 쓰기위한 객체를 생성
		

	}

}
