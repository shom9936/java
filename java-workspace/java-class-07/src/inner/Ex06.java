package inner;

class Outer6{
	public void aaa() {
		System.out.println("aaa");
	}
	
	public void bbb() {
		System.out.println("bbb");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
}

public class Ex06 {

	public static void main(String[] args) {

		Outer6 anonymity = new Outer6(){
			
			@Override
			public void bbb() {
				System.out.println("bbbbb");
				ddd(); //익명 중첩클래스 안에서 생성한 메소드 사용 가능
			}
			
			public void ddd() {
				System.out.println("ddd");
			}
			
		};
		
		anonymity.aaa();
		anonymity.bbb();
		anonymity.ccc();
		//anonymity.ddd();
		//익명 중첩클래스 안에서 생성한 필드나 메소드 사용 불가능
		

	}

}
