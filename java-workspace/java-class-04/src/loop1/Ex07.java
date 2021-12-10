package loop1;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		// 시작값 ,끝값, 증가값까지 입력받아 합을 구하는 식을 만들어보자.
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int start, end, incr;
		
		System.out.print("시작값 입력 : ");
		start = scan.nextInt();
		System.out.print("끝값 입력 : ");
		end = scan.nextInt();
		System.out.print("증가값 입력 : ");
		incr = scan.nextInt();
		
		for(int i=start; i<=end; i+= incr) sum += i;
		
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n",start,end,incr,sum);
		
		scan.close();
	}
}
