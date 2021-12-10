package clazz.array;

class Book{
	public String title;
	public String author;
	
	public Book() {}
	
	public Book(String title, String author) { // 매개값을 받아서 초기화 생성자
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + " : " + author);
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		Book[] book = new Book[5]; // 클래스 배열 5개 생성
		// 길이가 5인 Book타입의 참조변수 배열
		// 주소(address)만 가지고 있다.
		
		book[0] = new Book("java", "홍길동");
		// 객체를 생성해서 배열의 각 요소에 저장
		book[1] = new Book("jspp", "이순신");
		book[2] = new Book("database", "성춘향");
		book[3] = new Book("javascript", "이몽룡");
		book[4] = new Book("spring", "임꺽정");
		
		for(int i=0; i<book.length ; i++) {
			book[i].showInfo();
			System.out.println();
		}
		
//		for(Book i : book) {
//			i.showInfo();
//		}
		// 클래스 배열도 향상된 for문 사용가능

	}

}
