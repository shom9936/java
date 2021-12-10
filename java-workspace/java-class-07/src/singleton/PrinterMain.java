package singleton;

public class PrinterMain {

	public static void main(String[] args) {
		
		Printer print = Printer.getInstance();
		// 단 하나의 객체만 얻는다.
		
		print.print("자바자료");
		print.print("국어자료");
		print.print("수학자료");
		print.print("영어자료");
		
		Printer print2 = Printer.getInstance();
		print2.print("C언어자료");

	}

}
