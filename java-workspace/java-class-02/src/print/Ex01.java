package print;

public class Ex01 {
	public static void main(String[] args) {
		
		System.out.print("print()는 ()안에 내용을 출력 후 줄바꿈X");
		System.out.print("확인해보세요");
		System.out.println();
		// System.out.println(); > 이렇게만 썼을 경우 줄바꿈만 한다.
		
		System.out.printf("좋은하루 되세요");
		System.out.printf("\n"); // 줄바꿈
		System.out.printf("이름 : %s\n","홍길동"); // %s는 문자열
		
		System.out.printf("%d\n",100);
		System.out.printf("나이 : %d\n",20);
		
		
	}
}
