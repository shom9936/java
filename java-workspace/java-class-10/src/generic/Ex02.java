package generic;

class Box { 
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

class GenericBox<E>{ // generic 선언  : <알파벳 하나>
	private E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.setObj("안녕하세요");
		String str = (String)box.getObj();
		System.out.println(str);
		
		box.setObj(100);
		int num = (int)box.getObj();
		System.out.println(num);
		
		GenericBox<String> gBox = new GenericBox<String>();
		gBox.setObj("안녕하세용");
		String str1 = gBox.getObj(); // 캐스팅이 필요 없다!!
		System.out.println(str1);
		
		GenericBox<Integer> gBox1 = new GenericBox<Integer>();
		gBox1.setObj(101);
		int num1 = gBox1.getObj(); // 캐스팅이 필요 없다!!
		System.out.println(num1);
	}

}
