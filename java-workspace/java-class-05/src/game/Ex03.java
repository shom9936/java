package game;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("방의 갯수 : ");
		int roomNum = scan.nextInt();
		
		boolean[] room = new boolean[roomNum];
		// false 일 경우 빈방, true일 경우 사용중
		
		while(true) {
			System.out.println("(1)입실 (2)퇴실 (3)보기 (4)종료");
			int select = scan.nextInt();
			
			switch(select) {
			case 1:
				int inRoom;
				do {
					System.out.println("입실하실 방의 번호를 입력");
					inRoom = scan.nextInt();
				}while(inRoom < 1 || inRoom > roomNum);
				
				if(room[inRoom - 1]) {
					System.out.println(inRoom + "호실은 사용중입니다");
				}
				else {
					System.out.println(inRoom + "호실에 입실하셨습니다");
					room[inRoom - 1] = true;
				}
				break;
			case 2:
				int outRoom;
				do {
					System.out.println("퇴실하실 방의 번호를 입력: ");
					outRoom = scan.nextInt();
				}while(outRoom < 1 || outRoom > roomNum);
				if(!room[outRoom - 1]) {
					System.out.println(outRoom + "호실은 이미 빈방입니다");
				}
				else {
					System.out.println(outRoom + "호실에 퇴실하셨습니다");
					room[outRoom - 1] = false;
				}
				break;
			case 3:
				for(int i =0; i<room.length; i++) {
					if(room[i]) System.out.println(i+1+"호실 : 사용중");
					else System.out.println(i+1+"호실 : 빈방");
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
