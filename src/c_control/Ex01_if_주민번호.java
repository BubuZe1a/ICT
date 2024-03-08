package c_control;

/*
 * 자료형
 * 	- 기본형 : boolean / char / int/ double
 *	- 참조형 : 클래스 / 배열
 *			(*)String
 *
 * 학번 전화번호 주민번호는 계산 되면 안되기 때문에 무조건 문자처리
 * 언어는 0 DB는 1부터 카운트
 *
 */



public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		//String id = "";
		String id = new String("011005-1234567");
		
		char sung = id.charAt(7);
		
		if ( sung == '1' || sung == '3' || sung == '9') {
			System.out.println("당신은 남자");
		}else if ( sung == '0' || sung == '2'|| sung == '4' ){
			System.out.println("당신은 여자");
		}
	}

}
