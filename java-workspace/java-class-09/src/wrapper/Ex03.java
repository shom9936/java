package wrapper;

public class Ex03 {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		// 포장객체 비교
		System.out.println(obj1 == obj2); // false 출력, 객체와 객체의 비교기때문
		System.out.println(obj1.equals(obj2)); // 객체 내부의 값을 비교
		// equals()메소드는 Object 클래스의 메소드이다.
		// wrapper 클래스는 Object의 equals()메소드를 재정의해서 안에 있는 값을 비교한다.
		
		
		
	}

}
