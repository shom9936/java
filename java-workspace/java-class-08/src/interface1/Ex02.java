package interface1;

interface Print{
	public abstract void printA4();
	void printB4(); // public abstract 생략가능
}

interface Scan{
	void scanA4();
	void scanB4();
}

class Machine implements Print, Scan{

	@Override
	public void scanA4() {
		System.out.println("A4용지를 스캔합니다.");
	}

	@Override
	public void scanB4() {
		System.out.println("B4용지를 스캔합니다.");
	}

	@Override
	public void printA4() {
		System.out.println("A4용지를 프린트합니다.");
	}

	@Override
	public void printB4() {
		System.out.println("B4용지를 프린트합니다.");
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		machine.printA4();
		machine.printB4();
		machine.scanA4();
		machine.scanB4();

	}

}
