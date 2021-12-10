package array;

public class Ex09 {

	public static void main(String[] args) {
		
		int[] intArray = {10,20,30,40,50,60};
		
		// index가 3인 곳은 출력하지 말고 나머지만 출력
		
		for(int i=0; i<intArray.length;i++) {
			if(i == 3) {
				continue;
			}
			
			System.out.printf("%d ",intArray[i]);
		}

	}

}
