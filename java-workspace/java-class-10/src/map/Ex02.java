package map;

import java.util.*;

class Score{
	private String study;
	private int score;
	
	public Score(String study, int score) {
		this.score = score;
		this.study = study;
	}
	
	public void showInfo() {
		System.out.println(study + " : " + score);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		// HashMap을 이용해서 과목하고 성적을 입력
		// 과목 : 국어 영어 수학 자바
		// 과목은 String 성적은 Integer
		// key값을 이용해서 value를 출력해보자
		
		HashMap<Integer, Score> map = new HashMap<>();
		map.put(1, new Score("국어", 80));
		map.put(2, new Score("영어", 75));
		map.put(3, new Score("수학", 90));
		map.put(4, new Score("자바", 100));
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			int key = iter.next();
			Score score = map.get(key);
			score.showInfo();
		}
		
		// 성적의 배열을 만들고 오름차순으로 정렬해보자
		

	}

}
