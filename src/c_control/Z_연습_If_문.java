package c_control;

public class Z_연습_If_문 {

	public static void main(String[] args) {

		String tel = "2025113001";
		char ch = tel.charAt(4);
		System.out.println(ch);
		//1이면 공대 2면 사회대

		String year = tel.substring(0,4);
		System.out.println(year);
		// 년도

		String localNum = tel.substring(5, 7);
		System.out.println(localNum);
		// 학과 번호

		String ncaa = "";
		String gua = "";
		if ( ch == '1') {
			ncaa = "공대";
			if (localNum.equals("11")) { 
				gua = "컴퓨터학과";
			}else if (localNum.equals("12") ) {
				gua = "소프트웨어학과";
			}else if (localNum.equals("13") ) {
				gua = "모바일학과";
			}else if (localNum.equals("22") ) {
				gua = "자바학과";
			}else if (localNum.equals("33") ) {
				gua = "서버학과";
			}
		}else if (ch == '2') {
			ncaa  = "사회대";
			if (localNum.equals("11")) {
				gua = "사회학과";
			}else if (localNum.equals("12")) {
				gua = "경영학과";
			}else if (localNum.equals("12")) {
				gua = "경제학과";
			}
		}
		System.out.println(tel + "는" + " " + year + "년도에 입학한 " + ncaa + " " + gua + " "+ "학생입니다");
	}
}
