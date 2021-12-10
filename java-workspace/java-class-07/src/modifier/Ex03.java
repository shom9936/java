package modifier;

class Check{
	
	private static int checkNum = 0;
	
	public Check() { 	// 생성자
		checkNum++;
		System.out.println("객체를 생성했습니다.");
		System.out.println("checkNum : " + checkNum);
	}
	
	public static int getCheckNum() {
		return checkNum;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Check check1 = new Check();
		Check check2 = new Check();
		Check check3 = new Check();
		
		int checkNum = Check.getCheckNum();
		System.out.println("checkNum : " + checkNum);

	}

}
