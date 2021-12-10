package loop2;

public class Ex13 {

	public static void main(String[] args) {
		// while문을 이용해서 1~10까지 합을 구해보세요
		
		int i = 1, sum = 0;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("1~10합 : " + sum);
		

	}

}
