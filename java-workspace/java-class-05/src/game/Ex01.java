package game;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 주사위 게임을 만들어보자
		// 내 주사위와 상대방 주사위를 굴려서
		// 이김, 짐, 무승부로 만들어보기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주사위를 굴릴까요? ");
		System.out.println("네(1) 아니오(2)");
		int yes1 = scan.nextInt();
		
		if(yes1 != 1) {
			System.exit(0); // 시스템 강제종료
		}
		
		int myDice, yourDice;
		
		myDice = (int)(Math.random()*6 + 1);
		// 1 ~ 6까지 숫자 중 하나를 뽑는다.
		yourDice = (int)(Math.random()*6 + 1);
		
		System.out.println("나의 주사위 : "+ myDice + " 상대 주사위 : "+ yourDice);
		
		if(myDice > yourDice) System.out.println("You win!");
		else if(myDice < yourDice) System.out.println("You lose!");
		else System.out.println("Draw!");

		scan.close();
	}

}
