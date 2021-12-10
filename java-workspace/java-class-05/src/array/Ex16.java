package array;

public class Ex16 {

	public static void main(String[] args) {
		
		int[] engScores = new int[] {70, 80, 68, 90, 85};
		// 학생 5명의 영어 점수를 향상된 for문으로 출력해보자
		
//		for(int A : engScores) {
//			System.out.println(A);
//		}
		System.out.println();
		
		// 학생이 2명 더 늘어났다면...
		int[] newEngScores = new int[engScores.length + 2];
		
		for(int i=0; i<engScores.length; i++) {
			newEngScores[i] = engScores[i];
		}
		
		for(int s : newEngScores) {
			System.out.println(s);
		}
		

	}

}
