package loop1;

public class Ex05 {

	public static void main(String[] args) {

		//500에서 1000까지 홀수의 합을 구해보세요
		int sum = 0;
		
		for(int i=500; i<=1000; i++) {
			if(i%2==1) sum += i;
		}
		
		System.out.println("500에서 1000까지 홀수의 합 : " + sum);

	}

}
