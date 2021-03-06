package map;

import java.util.*;

// Student 클래스를 만들고
// 필드를 int studentID; String name; 으로 한다.
// 생성자를 통해 초기화를 하고
// equals와 hashcode 메소드를 오버라이딩하여 재정의 해보자

class Student{
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student sd = (Student)obj;
			return (sd.studentID == this.studentID) && (sd.name.equals(this.name));
		}
		return false;
	}
	
	@Override
	public int hashCode() {		
		return (name + String.valueOf(studentID)).hashCode();
	}
}

public class Ex06 {

	public static void main(String[] args) {
		
		// HashMap을 사용해서 key에는 student , value에는 Integer ( 점수 )를 넣는다.
		// keySet 메소드로 Set에 key값을 넣어준 뒤, Iterator를 이용해서
		// while 문안에서 키와 벨류를 출력해보자
		
		HashMap<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "홍길동"), 60);
		map.put(new Student(2, "이몽룡"), 70);
		map.put(new Student(3, "성춘향"), 80);
		map.put(new Student(4, "이순신"), 90);
		map.put(new Student(1, "홍길동"), 100);
		
		Set<Student> set = map.keySet();
		Iterator <Student> iter = set.iterator();
		
		System.out.println("총 Entry 수 : " + map.size());
		while(iter.hasNext()) {
			Student sd = iter.next();
			System.out.println("이름 : " + sd.name + " 학번 : " + sd.studentID + " 점수 : " + map.get(sd));
		}

	}

}
