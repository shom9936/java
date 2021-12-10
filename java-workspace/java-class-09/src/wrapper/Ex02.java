package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		
		Integer obj = new Integer(10); // 박싱
		
		int sum = obj + 20; // 자동언박싱
		
		System.out.println(sum);
		
		printDouble(new Double(123.45));
		printDouble(123.45); // 자동박싱

	}
	
	static void printDouble(Double obj) { // double이 아닌 Double임, 클래스 타입
		System.out.println(obj);
	}

}
