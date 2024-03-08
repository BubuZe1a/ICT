package y_useful;

/*
 * 날짜 관련 클래스 : java.util 패키지 안에 소속
 * 
 * 		`Date
 * 		`Calendar
 * 		`LocalDate
 * 		`LocalDateTime
 */

import java.util.*;

public class Calendar샘플 {

	public static void main(String[] args) {
		
		Calendar c 	= Calendar.getInstance();
//		int year 	= c.get(Calendar.YEAR);
//		int month 	= c.get(Calendar.MONTH)+1;
		// *********************************
		// 월개념 : 1월 == 00
		// 월에는 +1 해주기
//		int day 	=  c.get(Calendar.DATE);
//		System.out.println(year+"/"+month+"/"+day);
		
		//요일 구하기
		//일요일은 1 월요일 2 화요일 3
		String [] day_of_week = {"일","월","화","수","목","금","토"};
		int week_int = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week_int);
		System.out.println(day_of_week[week_int]+"요일입니다");
		
		
		
		
		
		
		// 시,분,초
//		Calendar a 	= Calendar.getInstance();
//		int hour 	= a.get(Calendar.HOUR);
//		int min		= a.get(Calendar.MINUTE);
//		int s		= a.get(Calendar.SECOND);
//		System.out.println(hour+"시"+min+"분"+s+"초");
	}

}
