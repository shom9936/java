package program;

import java.util.*;

public class MemberServiceImpl implements MemberService{
	
	private HashSet <Member> set;
	private Scanner scan;
	
	public MemberServiceImpl() {
		set = new HashSet<Member>();
		scan = new Scanner(System.in);
	}
	
	// interface에 메소드를 오버라이딩해서 안에 구현부를 채워보자
	
	@Override
	public void viewAll() {
		Iterator <Member> iter = set.iterator();
		while(iter.hasNext()) { 
			iter.next().dispMember();
		}
	}
	
	@Override
	public void view() {
		System.out.print("검색할 회원의 이름 : ");
		String name = scan.next();
		Iterator <Member> iter = set.iterator();
		while(iter.hasNext()) {
			Member mb = iter.next();
			if(mb.getName().equals(name)) {
				mb.dispMember();
				return;
			}
		}
		System.out.println(name + "님은 저희 회원이 아닙니다.");
	}
	
	@Override
	public void insert() {
		System.out.println("회원 등록");
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("폰번호 : ");
		String number = scan.next();
		set.add(new Member(name,age,number));
	}
	
	@Override
	public void edit() {
		System.out.print("수정할 회원의 이름 : ");
		String name = scan.next();
		
		
		Iterator <Member> iter = set.iterator();
		while(iter.hasNext()) {
			Member mb = iter.next();
			if(mb.getName().equals(name)) {
				System.out.print("나이 : ");
				int age = scan.nextInt();
				System.out.print("폰번호 : ");
				String number = scan.next();
				
				set.remove(mb); // (1)
				set.add(new Member(name,age,number));
				
//				mb.setAge(age); // (1)
//				mb.setPhoneNum(number);
				// 이 코드로 해도 됨, 이 코드가 더 깔끔하기도 함, 선생님 코드
				// 주소를 입력받기때문에 next()로 넘겨받은 객체를 수정해도 HashSet에 있는 객체가 수정이된다.
				
				System.out.println("수정되었습니다.");
				return;
			}
		}
		System.out.println(name + "님은 저희 회원이 아닙니다.");
	}
	
	@Override
	public void delete() {
		System.out.print("삭제할 회원의 이름 : ");
		String name = scan.next();
		
		Member mb = search(name);
		if(mb.getName().equals(String.valueOf(0))) System.out.println(name + "님은 저희 회원이 아닙니다.");
		else {
			set.remove(mb);
			System.out.println("삭제되었습니다.");
		}
	}
	
	public Member search(String name) {
		Iterator <Member> iter = set.iterator();
		while(iter.hasNext()) {
			Member mb = iter.next();
			if(mb.getName().equals(name)) return mb;
		}
		return new Member(String.valueOf(0),0,String.valueOf(0));
	}
	
}
