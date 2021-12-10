package operation;

public class Ex04 {
	public static void main(String[] args) {
		
		System.out.println("문자열을 "+ "결합");
		
		System.out.println(2 + "학년 " + 10 + "반");
		//한쪽이 문자열이면 +연산자는 문자열결합연산자로 사용되어
		//다른 피연산자를 문자열로 변환하고 결합한다.
		
		String str1 = "오늘 날씨가 좋아요";
		String str2 = "놀러 나가고 싶어요";
		
		System.out.println(str1 + '\n' + str2);
		
	}
}
