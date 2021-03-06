package api;

public class Ex04 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Class 객체얻기 첫번째 방법
		Class clazz1 = Ex04.class;
		String clazzName = clazz1.getName();
		System.out.println(clazzName); // 패키지.클래스명
		
		String simple = clazz1.getSimpleName();
		System.out.println(simple);
		
		// Class 객체얻기 두번째 방법
		Class clazz2 = Class.forName("api.Ex04");
		// forName("패키지...클래스이름");
		System.out.println(clazz2.getName());
		
		// 객체로부터 Class 객체얻기
		Ex04 ex = new Ex04();
		Class clazz3 = ex.getClass();
		System.out.println(clazz3.getSimpleName());
	}

}
