package interface1;

import java.util.Scanner;

interface Price{
	public abstract int americanoPrice();
	int lattePrice();
	int orangeJuicePrice();
	int strawberryJuicePrice();
}

class NormalPrice implements Price{

	@Override
	public int americanoPrice() {
		int americanoPrice = 2000;
		return americanoPrice;
	}

	@Override
	public int lattePrice() {
		int lattePrice = 3000;
		return lattePrice;
	}

	@Override
	public int orangeJuicePrice() {
		int orangeJuicePrice = 2500;
		return orangeJuicePrice;
	}

	@Override
	public int strawberryJuicePrice() {
		int strawberryJuicePrice = 2500;
		return strawberryJuicePrice;
	}
	
}

class ExpensivePrice implements Price{

	@Override
	public int americanoPrice() {
		int americanoPrice = 5000;
		return americanoPrice;
	}

	@Override
	public int lattePrice() {
		int lattePrice = 7000;
		return lattePrice;
	}

	@Override
	public int orangeJuicePrice() {
		int orangeJuicePrice = 6000;
		return orangeJuicePrice;
	}

	@Override
	public int strawberryJuicePrice() {
		int strawberryPrice = 6000;
		return strawberryPrice;
	}
}

interface JuiceOrder{
	int orangeJuice(int money);
	int strawberryJuice(int money);
}

interface CoffeOrder{
	int americano(int money);
	int latte(int money);
}

class CoffeeShop implements JuiceOrder , CoffeOrder{
	
	Price coffeShopPrice = new NormalPrice();

	@Override
	public int americano(int money) {
		if(money < coffeShopPrice.americanoPrice()) {
			System.out.println("돈이 부족합니다.");
			System.out.println("다음 손님~~~");
			return money;
		}
		System.out.println("아메리카노 주문 들어갔습니다");
		return money - coffeShopPrice.americanoPrice();
	}

	@Override
	public int latte(int money) {
		if(money < coffeShopPrice.lattePrice()) {
			System.out.println("돈이 부족합니다.");
			System.out.println("다음 손님~~~");
			return money;
		}
		System.out.println("라떼 주문 들어갔습니다");
		return money - coffeShopPrice.lattePrice();
	}

	@Override
	public int orangeJuice(int money) {
		if(money < coffeShopPrice.orangeJuicePrice()) {
			System.out.println("돈이 부족합니다.");
			System.out.println("다음 손님~~~");
			return money;
		}
		System.out.println("오렌지주스 주문 들어갔습니다");
		return money - coffeShopPrice.orangeJuicePrice();
	}

	@Override
	public int strawberryJuice(int money) {
		if(money < coffeShopPrice.strawberryJuicePrice()) {
			System.out.println("돈이 부족합니다.");
			System.out.println("다음 손님~~~");
			return money;
		}
		System.out.println("스트로베리주스 주문 들어갔습니다");
		return money-coffeShopPrice.strawberryJuicePrice();
	}
	
}


public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("show me the money");
		int money = scan.nextInt();
		
		CoffeeShop coffeeShop = new CoffeeShop();
		System.out.println("(1)스타벅스 (2)동네커피숍");
		int coffeShopChoice = scan.nextInt();
		
		if(coffeShopChoice == 1) {
			coffeeShop.coffeShopPrice = new ExpensivePrice();
			System.out.println("안녕하세요 스타벅스입니다.");
			System.out.print("(1)아메리카노[5000] (2)카페라떼[7000]");
			System.out.println("(3)오렌지주스[6000] (2)스트로베리주스[6000]");
		}
		else{
			System.out.println("안녕하세요 백다방입니다");
			System.out.print("(1)아메리카노[2000] (2)카페라떼[3000]");
			System.out.println("(3)오렌지주스[2500] (2)스트로베리주스[2500]");
		}
		
		int menuChoice = scan.nextInt();
		
		switch(menuChoice) {
		case 1:
			money = coffeeShop.americano(money);
			break;
		case 2:
			money = coffeeShop.latte(money);
			break;
		case 3:
			money = coffeeShop.orangeJuice(money);
			break;
		case 4:
			money = coffeeShop.strawberryJuice(money);
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		
		System.out.println("현재 잔액은 " + money + " 입니다.");
		
		
	}

}
