package api;

public class Ex06 {

	public static void main(String[] args) {
		
		int a = Math.abs(-10);
		double b = Math.abs(-1.1);
		// abs() 메소드는 인자로 넘긴 데이터의 절대값을 반환
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		int c = Math.max(1,9);
		double d = Math.max(1.1, 9.9);
		// max() 메소드는 전달된 데이터 중 더 큰수를 반환
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		int e = Math.min(1,  9);
		double f = Math.min(1.1 , 9.9);
		// min() 메소드는 전달된 데이터 중 더 작은 수를 반환
		System.out.println(e);
		System.out.println(f);
		System.out.println();
		
		double g = Math.random();
		// 0.0부터 1.0미만의 임의의 수 하나를 반환
		System.out.println(g);
		System.out.println();
		
		double h = Math.ceil(1.1);
		double i = Math.ceil(-9.9);
		// 전달된 데이터를 올림하여 반환
		System.out.println(h);
		System.out.println(i);
		System.out.println();
		
		double j = Math.floor(1.1);
		double k = Math.floor(-3.3);
		// 전달된 데이터를 버림하여 반환
		System.out.println(j);
		System.out.println(k);
		System.out.println();
		
		long l = Math.round(5.3);
		long m = Math.round(5.7);
		// 전달된 데이터를 반올림하여 반환
		System.out.println(l);
		System.out.println(m);
		System.out.println();
		
	}

}
