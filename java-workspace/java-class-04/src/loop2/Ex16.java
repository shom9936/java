package loop2;

public class Ex16 {

	public static void main(String[] args) {
		
		//break문 알아보기
		
		int a = 0;
		while(a < 10) {
			System.out.println(a);
			
			if(a == 7) break;
			
			a++;
		}
		
		// continue문 알아보기
		
		int b = 0;
		while(b < 10) {
			b++;
			if(b==7) continue;
			System.out.println(b);
		}

	}

}
