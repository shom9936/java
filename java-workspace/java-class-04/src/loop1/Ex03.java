package loop1;

public class Ex03 {

	public static void main(String[] args) {
		
		//for문을 이용해서 1에서 10까지 합을 구하라
		
		int sum = 0;
		
		for(int i=0 ; i<10; i++) {
			sum += (i+1);
		}
		
		System.out.println("1~10까지 합 : " + sum);

	}

}
