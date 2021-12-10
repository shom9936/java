package clazz.array;

import java.util.Scanner;

// People 클래스를 만들고 People 클래스 필드는
// String name, int age로 한다.
// 생성자를 통해 name과 age를 초기화

class People{
	String name;
	int age;
	
	People(){}
	
	People(String name, int age){ // 매개값을 받아서 초기화 생성자
		this.name = name;
		this.age = age; 
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("사람수를 입력 : ");
		int cnt = scan.nextInt();
		
		People[] pp = new People[cnt]; // 클래스(객체) 배열 생성
							// People 클래스의 배열만 선언한 것
		
		for(int i=0; i< cnt; i++) {
			System.out.println(i+1+"번째 사람의 이름 : ");
			String name = scan.next();
			System.out.println(i+1+"번째 사람의 나이 : ");
			int age = scan.nextInt();
			
			pp[i] = new People(name,age);
			//객체를 생성하여 사용할 수 있게 된다.
		}
		
		for(int i=0; i<pp.length; i++) {
			System.out.println(i+1+"번째 사람의 이름 : "+ pp[i].name);
			System.out.println(i+1+"번째 사람의 나이 : "+ pp[i].age);
		}
		
		scan.close();
	}

}