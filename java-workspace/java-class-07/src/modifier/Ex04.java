package modifier;

import java.util.Scanner;

// 티켓판매 프로그램을 만들어보자!
// Ticket 클래스를 만든다.
// Ticket 클래스는 seatNum 필드와 mainTicketMachine() 메소드가 있다.
// mainTicketMachine 메소드는 티켓을 구입하는 메소드이다.
// mainTicketMachine 메소드는 매개변수로 티켓수를 받는다.
// 티켓의 수는 4장으로 하고 남은 티켓잔여수를 알려주어야 한다.

class Ticket{
	private static int seatNum = 4;
	// 표를 예매할때 좌석이 공유되어야 한다.

	public void mainTicketMachine(int tickerNum) {
		seatNum -= tickerNum;
		if(seatNum >= 0) {
			System.out.println("현재 티켓 잔여수 : " + seatNum);
		}
		else {
			System.out.println("티켓이 모두 판매되었습니다.");
			System.out.println("티켓판매 프로그램을 종료합니다.");
			System.exit(0);
		}
	}
}



public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ticket ticketMachine1 = new Ticket();
		Ticket ticketMachine2 = new Ticket();
		
		while(true) {
			System.out.println("티켓머신 2개중 어떤 기계로 사용할까요?");
			System.out.println("(1)첫번째 머신 (2)두번째 머신");
			int choice = scan.nextInt();
			
			
			System.out.println("티켓을 구입하시겠습니까?");
			System.out.println("(1)Yes (2)No");
			int buy = scan.nextInt();
			
			if(buy == 1) {
				if(choice == 1) ticketMachine1.mainTicketMachine(1);
				else if(choice == 2) ticketMachine2.mainTicketMachine(1);
				else{
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
			}
			else {
				System.out.println("감사합니다. 좋은 여행되세요");
				break;
			}
		}
		
		scan.close();
	}
}
