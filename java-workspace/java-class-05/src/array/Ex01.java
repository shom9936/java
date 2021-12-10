package array;

public class Ex01 {

	public static void main(String[] args) {
		
		// 배열 선언 알아보기
		
		int[] intArray1 = new int[] {10, 20, 30};
		// 실제 값을 알고 있을 때, 선언과 동시에 배열을 생성하면 new연산자 생략가능
		
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		// 배열 사용은 []안에 인덱스를 이용해서 사용한다.
		
		int[] intArray2 = null;
		intArray2 = new int[] {1, 2, 3}; // new 연산자를 써준다.
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		
		int intArray3[] = new int[3]; // 저장할 값의 길이만 지정할 때
		intArray3[0] = 4;
		intArray3[1] = 5;
		intArray3[2] = 6;
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
		
		
	}

}
