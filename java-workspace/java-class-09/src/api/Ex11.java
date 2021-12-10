package api;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		
		Date now = new Date();
		// 현재 시스템의 시간으로 객체를 만듬
		// 그 외에는 잘 사용하지 않는다.
		System.out.println(now); // 
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");
		
		System.out.println("Date : " + date.format(now));
		System.out.println("time : " + time.format(now));
		
		// JDK 1.0 에서는 Date 클래스를 사용하였으니,
		// 윤년 4년에 한번씩 2월 29일
		// 한시간에 1초정도? 오차가 존재한다.
		// 때문에 JDK 1.1에서부터 향상된 기능을 추가한 calendar 클래스를 사용한다.
		
		Calendar cal = Calendar.getInstance();
		// Calendar 클래스는 추상클래스로서 직접 개체를 생성하지 않음.
		// getInstance()는 Calendar 클래스를 구현한 클래스의 인스턴스를 반환
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		//  컴퓨터의 월은 0부터 시작하기 때문에 +1을 해주어야 한다.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘의 날짜 : %d년 %d월 %d일\n",year,month,day);
		
		int hour = cal.get(Calendar.HOUR); // 12시간제\
		int hour2 = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		System.out.printf("현재시간 : %d시 %d분 %d초\n",hour2,minute,seconds);
		
		
	}

}
