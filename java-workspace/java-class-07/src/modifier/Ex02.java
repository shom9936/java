package modifier;

class Box{
	
	static int boxID = 0;
	int idNum = 0;
	
	public void increase() {
		boxID++;
		idNum++;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		Box myBox3 = new Box();
		
		myBox1.increase(); // boxID -> 1 , idNum -> 1
		System.out.println("myBox1의 id번호 : " + myBox1.idNum);
		System.out.println("boxID : " + myBox1.boxID);
		
		myBox2.increase(); // boxID -> 2 , idNum -> 1
		System.out.println("myBox2의 id번호 : " + myBox2.idNum);
		System.out.println("boxID : " + myBox2.boxID);
		
		myBox3.increase(); // boxID -> 3 , idNum -> 1
		System.out.println("myBox3의 id번호 : " + myBox3.idNum);
		System.out.println("boxID : " + myBox3.boxID);
		
		//인스턴스 변수는 개체마다 공유되지 않는다.
		//static 변수는 모든 객체가 공유된다.
		System.out.println();
		System.out.println("boxID : " + Box.boxID);

	}

}
