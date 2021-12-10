package interface1;

import java.util.Scanner;

class IronMan{
	
	IronSuit ironman;
	
	public IronMan() {
		ironman = new NormalIronSuit(); // 필드의 다형성
	}
	
	public void fight(IronSuit ironSuit) { // 매개변수의 다형성
		ironSuit.attack();
		if(ironSuit instanceof NewIronSuit) {
			NewIronSuit ironSuit2 = new NewIronSuit();
			ironSuit2.laserBeamAttack();
		}
	}
	
}

interface IronSuit{
	public abstract void flying();
	public abstract void attack();

}

class NormalIronSuit implements IronSuit{
	
	String suitName;
	
	public NormalIronSuit() {
		suitName = "마크1";
	}
	@Override
	public void flying() {
		System.out.println("아이언맨이 " + suitName + "을 장착을 하고 날아갑니다.");
	}
	
	@Override
	public void attack() {
		System.out.println(suitName + "을 장착한 아이언맨이 적을 향해 공격합니다.");
	}
}

class NewIronSuit implements IronSuit{
	
	String newSuitName;
	
	public NewIronSuit() {
		newSuitName = "마크43";
	}
	
	@Override
	public void flying() {
		System.out.println("아이언맨이 " + newSuitName + "을 장착을 하고 날아갑니다.");
	}
	
	@Override
	public void attack() {
		System.out.println(newSuitName + "을 장착한 아이언맨이 적을 향해 공격합니다.");
	}
	
	public void laserBeamAttack() {
		System.out.println(newSuitName + "을 장착한 아이언맨이 레이저빔을 쏩니다.");
	}
}

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신은 어벤져스 팀의 아이언맨입니까? (1)Yes (2)No");
		int choice = scan.nextInt();
		
		if(choice != 1) {
			System.out.println("당신은 일반인이군요. 위험하니 도망치세요!");
			System.exit(0);
		}
		
		IronMan ironman = new IronMan();
		System.out.println("아이언맨 반갑습니다. 괴물이 나타났습니다!");
		System.out.println("지구를 구해주세요!");
		System.out.println("어떤슈트로 입겠습니까? (1)마크1 , (2) 마크43");
		choice = scan.nextInt();
		
		if(choice == 1) {
			ironman.ironman = new NormalIronSuit();
			ironman.ironman.flying();
			System.out.println();
			System.out.println("괴물을 물리치시겠습니까? (1)Yes, (2)No");
			int choice2 = scan.nextInt();
			if(choice2 != 1) {
				System.out.println("괴물이 지구를 파괴했습니다.");
				System.exit(0);
			}
			
			NormalIronSuit ironSuit1 = new NormalIronSuit();
			ironman.fight(ironSuit1); // 매개변수의 다형성
			System.out.println();
		}
		else if(choice == 2) {
			ironman.ironman = new NewIronSuit(); //필드의 다형성
			ironman.ironman.flying();
			System.out.println();
			System.out.println("괴물을 물리치시겠습니까? (1)Yes, (2)No");
			int choice2 = scan.nextInt();
			if(choice2 != 1) {
				System.out.println("괴물이 지구를 파괴했습니다.");
				System.exit(0);
			}
			NewIronSuit ironsuit2 = new NewIronSuit();
			ironman.fight(ironsuit2); // 매개변수의 다형성
			System.out.println();
		}
		else {
			System.out.println("잘못입력하셨습니다. 시스템종료합니다.");
			System.exit(0);
		}
		
		System.out.println("승리했습니다.");
		scan.close();

	}

}
