package loop1;

public class Ex10 {

	public static void main(String[] args) {
		
		//중첩 for문을 이용해서 *찍기
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) System.out.print('*');
			System.out.println();
		}

	}

}
