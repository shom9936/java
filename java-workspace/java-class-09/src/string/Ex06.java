package string;

public class Ex06 {

	public static void main(String[] args) {
		
		String str1 = "Hello java";
		
		// indexOf : 문자열에 지정한 문자가 처음 몇번째에 있는지를 반환한다.
		System.out.println("indexOf : " + str1.indexOf("l"));
		
		// lastIndexOf : 문자열에 지정한 문자가 마지막 몇번째에 있는지를 반환한다.
		System.out.println("lastIndexOf : " + str1.lastIndexOf("l"));
		
		String str2 = "A:B:C:D:abcde";
		
		// split : 지정한 문자로 문자열을 나눌 수 있다.(배열로 반환)
		String[] split = str2.split(":");
		
		for(int i =0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		// substring : 문자열에 지정한 범위에 속하는 문자열을 반환한다.
		// (시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지 않는다.)
		String str4 = "ABCDE";
		String substring = str4.substring(0,2);
		System.out.println(substring);

	}

}
