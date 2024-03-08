package c_control;

public class Ex03_switch_주민번호 {

	public static void main(String[] args) {
		
		/*
		 * switch (변수/연산) { 문자형 정수형 String
		 *  case 값1 :실행;break;
		 *  case 값2 :실행;break;
		 *  default :실행;
		 * }
		 */
		
		
//		String id = "011005-1934567";
//		char ch = id.charAt(8); // 8번째 문자열 변수 입력
//		System.out.println(ch); // 8번째 문자열 변수 출력

		/*
		 * 출신지값이
		 * 0이라면 서울출신
		 * 1이라면 인천/부산출신
		 * 2라면 경기출신
		 */

//		String chul = "";
//		switch(ch) {
//		case '0' : chul = "서울";
//					break;
//		case '1' : chul = "인천/부산";
//					break;
//		case '2' : chul = "경기";
//					break;
//		// default : chul = "한국인"; 없어도 됨 
//		}
//		System.out.println(chul + " 출신입니다.");

		String id = "011005-3234567";
		
		//------------
		/*
		 * 주민번호에서 7번째 문자에 의해 성별을 출력
		 * 단, switch 문장으로 완성
		 */
		
		char a = id.charAt(7);
		System.out.println(a);
		
		String mg = "";
		switch(a) {
		case '9' :  
		case '1' : 
		case '3' : mg = "남자"; break; // 실행 문장이 동일하다면 생략하고 마지막 동일한 문장에 break를 걸면 됨
		case '0' : 
		case '2' : 
		case '4' : mg = "여자"; break;
		}
		System.out.println("당신은 " + mg + "입니다.");
	}
}
