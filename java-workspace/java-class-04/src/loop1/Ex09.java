package loop1;

public class Ex09 {

	public static void main(String[] args) {
		// 구구단 만들기
		
//		for(int i=1; i<=2; i++) {
//			System.out.printf("2X%d=%d\n", i,i*2);
//		}
		
		//중첩 for문을 이용해서 구구단을 만들어보자
		
		int dan;
		int num;
		
		for(num=1; num<=9; num++) {
			for(dan=2; dan<=9; dan++) {
				System.out.printf("%dX%d=%d\t",dan,num,dan*num);
			}
			System.out.println();
		}

	}

}
