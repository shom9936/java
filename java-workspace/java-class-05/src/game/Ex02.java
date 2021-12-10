package game;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] myLotto = new int[6];
		
		for(int i = 0;;) {
			lotto[i] = (int)(Math.random()*45+1);
			if(i!=0) {
				boolean check = false;
				for(int j=i-1;j>=0;j--) {
					if(lotto[i] == lotto[j]) {
						check = true;
						break;
					}
				}
				if(check) continue;
			}
			i++;
			if(i>=6) break;
		}
		
		
		int cnt = 0;
		for(int i = 0; i < 6 ; i++) {
			myLotto[i] = scan.nextInt();
			if(myLotto[i] <= 0 || myLotto[i] >45) {
				System.out.println("잘못된 숫자입니다.");
				i--;
				continue;
			}
		}
		
		for(int i = 0; i<myLotto.length; i++) {
			for(int j = 0 ; j<lotto.length; j++) {
				if(myLotto[i] == lotto[j]) cnt++;
			}
		}
		
		System.out.print("오늘 추첨번호 : ");
		for(int i = 0; i<myLotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println(cnt + "개를 맞추셨습니다");
		
		scan.close();

	}

}
