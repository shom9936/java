package loop2;

public class Ex14 {

	public static void main(String[] args) {
		// while문을 이용해서 구구단 만들기
		
		int num = 1;
		
		while(num<10) {
			int dan = 2;
			while(dan<10) {
				System.out.printf("%dX%d=%d\t",dan,num,dan*num);
				dan++;
			}
			System.out.println();
			num++;
		}

	}

}
