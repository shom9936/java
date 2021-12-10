package generic;

public class Ex01 {

	public static void main(String[] args) {
		
		// Object 타입은 모든 객체의 타입이 될 수 있다.
		// 즉, 모든 객체를 담을 수 있다.
		
		Object[] obj = new Object[5];
		
		obj[0] = new Integer(100);
		obj[1] = 3.14;
		obj[2] = new Character('귤');
		obj[3] = "hello~~";
		obj[4] = true;
		
		for(int i =0; i<obj.length ;i++) {
			System.out.println(obj[i]);
		}
		
	}

}
