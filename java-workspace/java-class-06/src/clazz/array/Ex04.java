package clazz.array;

import java.util.Scanner;

// 회원 정보
class Member {
	
	private String name;
	private String tel;
	
	Member(String name, String tel){
		this.name = name;
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}
	
	void disp() {
		System.out.println(name + "님의 전화번호는 "+ tel + "입니다.");
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("회원수를 입력 : ");
		int inwon = scan.nextInt();
		
		Member[] mb = new Member[inwon];
		
		for(int i=0; i<inwon; i++) {
			System.out.print(i+1+"번째 이름 : ");
			String name = scan.next();
			System.out.println(i+1+"번째 전화번호 : ");
			String tel = scan.next();
			
			mb[i] = new Member(name,tel);
		}
		
		for(Member i : mb) {
			i.disp();
		}
		
		scan.close();

	}

}
