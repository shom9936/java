package wrapper;

public class Ex05 {

	public static void main(String[] args) {
		
		// 문자열을 기본형으로 바꿀때
		// parseInt : 문자열 -> 기본형
		// valueOf : 문자열 -> wrapper 클래스
		// JDK 1.5부터 자동박싱, 자동언박싱이 지원되어
		// 반환값이 기본형일때와 wrapper 클래스일때의 차이가 없어졌다.
		
		String str = "100";
		
		Integer ivalue1 = Integer.valueOf(str);
		System.out.println(ivalue1.intValue());
		
		int ivalue2 = Integer.parseInt(str);
		System.out.println(ivalue2);
		
	}

}
