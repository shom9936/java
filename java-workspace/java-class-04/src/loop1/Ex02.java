package loop1;

public class Ex02 {

	public static void main(String[] args) {
		
		int i;
		
		for(i=1;i<=5;i++) {
			System.out.println("for문 안입니다. i = " + i);
		}
		
		System.out.println("for문을 나왔습니다. i = " + i);
		
		for(i=2;i<=10;i+=2) {
			System.out.println(i);
		}

	}

}