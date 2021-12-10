package inheritance;

class Sedan{
	
	String color;
	
	public Sedan() { // 기본생성자
		System.out.println("Sedan 클래스 생성자 호출(매개변수 없음)");
	}
	
	public Sedan(String str) {  // 부모(매개변수) 생성자
		System.out.println("Sedan 클래스 생성자호출 : " + str);
	}
	
}

class Sonata extends Sedan{
	
	public Sonata(String str) {
		//super(); //부모클래스 기본생성자가 호출이 된다.
		super(str); // 부모생성자가 매개변수를 가지고 있을 경우
					// 부모생성자에 매개변수를 명시를 해주면 명시된 부모생성자가 호출이 된다.
		System.out.println("Sonata 클래스 생성자 호출 : " + str);
	}
	
	void setColor(String color) {
		this.color = color;
		// super.color로 부모필드에 접근해야 된다.
		// 하지만 필드를 물려받았기때문에 this.color로 부모필드 접근 가능.
		// this는 자기자신을 가르킨다.
		// 자식클래스에 똑같은 이름의 필드가 있을 경우에는 super로 부모클래스 필드에 접근해야한다.
	}
	
	void colorPrint() {
		System.out.println("소나타 색상은 : " + this.color);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata("소나타 객체생성");
		
		sonata.setColor("검정");
		sonata.colorPrint();
		
	}

}
