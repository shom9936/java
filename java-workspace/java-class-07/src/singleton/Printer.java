package singleton;

public class Printer {

	private static Printer printer = new Printer();
	private int count = 0;
	
	private Printer() {}
	
	public static Printer getInstance() {
		return printer;
	}
	
	public void print(String input) {
		count++;
		System.out.println(input + "프린트 >> 총 프린트 수 : " + count);
	}

}
