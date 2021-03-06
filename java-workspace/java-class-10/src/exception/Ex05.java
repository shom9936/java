package exception;

public class Ex05 {

	public void call(int j) throws ArrayIndexOutOfBoundsException {
		
		int[] i = {1, 2, 3}; // int타입의 배열 i 초기화
		System.out.println("call value : " + i[j]); // 배열 i의 j번째 값 불러오기
	}
	
	public static void main(String[] args) {
		
		Ex05 ex = new Ex05();
		
		try {
		ex.call(4); // call 메소드 호출
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기에 맞는 값을 입력하세요!");
			e.printStackTrace();
		}
		finally { // Exception 여부와 상관없이 수행
			System.out.println("해당문장은 무조건 수행!");
		}

	}

}
