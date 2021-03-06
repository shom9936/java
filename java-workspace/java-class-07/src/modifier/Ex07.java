package modifier;

class Person{
	
	static final String NATTION = "KOREA";
	// 불변의 정적필드(메모리의 클래스영역에 올라가므로 반드시 선언과 동시에 초기화)
	// 역할 : 공용데이터
	final String SSN;
	// 선언과 동시에 초기화를 하거나, 혹은 생성자에서 단 한번만 초기화가 이루어진다.
	String name;
	int age;
	
	// 매개변수가 있는 생성자
	public Person(String ssn, String name, int age) {
		this.SSN = ssn;
		this.name = name;
		this.age = age;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		
		Person person = new Person("123456-1234567", "홍길동", 20);
		System.out.println(person.NATTION);
		System.out.println(person.SSN);
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println();
		
		// 상수는 절대로 한번만 초기화 가능하고 수정이 안된다.
		//person.NATTION = "USA";
		//person.SSN = "111111 - 2222222";
		person.name = "이순신";
		person.age = 30;
		
		System.out.println(Person.NATTION); // static 방법으로 접근
		System.out.println(person.SSN);
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println();
		
		// 결론
		// 1. static final : 정적 불변의 상수, 메모리 상단(클래스/메소드/정적 영역)에
		// 					 하나만 생성이 되고 공유되는 상수이다.
		
		// 2. final : 불변의 인스턴스 상수, 힙(heap, 메모리)에 할당이 된다. 
		// 			  new 연산자를 몇번 외치든 간에 만들어진 인스턴스만큼 생성
		
		// 보통 프로그래밍에서 상수라는 용어는 static final이다.

	}

}
