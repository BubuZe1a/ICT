package c_control;

public class Ex04_switch_전화번호 {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		String tel = "02-123-1234";
		int idx = tel.indexOf('-');
		System.out.println(idx);
		
		String Num = tel.substring(0, idx);
		System.out.println(Num);
		
		/* swicth 문장이용
		 * 지역번호가 02라면 서울입니다
		 * 지역번호가 032라면 인천입니다
		 * 나머지는 한국입니다
		 */
		
		String s = "";
		switch(Num) {
			case "02" : s = "서울입니다."; break; 
			case "032" : s = "인천입니다."; break;
			default : s = "한국입니다";
		}
		System.out.println( s );
	}
		
}
