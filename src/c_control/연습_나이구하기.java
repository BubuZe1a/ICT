package c_control;

import java.util.Calendar;

/*
 *  [참고]
 *  
 *  	 9 	: 숫자
 *  	'9' : 문자
 *  	"9" : 문자열
 */


public class 연습_나이구하기 {

	public static void main(String[] args) {
		
		String id = "011005-3434567";
		
		String nai_str 	= id.substring(0, 2); // "90"
		char z		= id.charAt(7);
		System.out.println(z);
		
		// String 	-> int 형으로 변환
		// "90"		-> 90
		//int nai = nai_str;
		int nai = Integer.parseInt(nai_str);
		
		// 올해 년도 구하기
		Calendar c 	= Calendar.getInstance();
		int year 	= c.get(Calendar.YEAR);
		
		int age = 0;
		
		// 1900년대생 / 2000년대생 구분
		if (z == '1' | z == '2') {
			age = year - (1900 + nai) + 1;
		}else if (z == '3' | z == '4' ) {
			age = year - (2000 + nai) + 1;
		}
		
		
		
		System.out.println("나이:" + age);
		
		
		
	}

}
