package c_control;

public class 복습 {

	public static void main(String[] args) {
		
		// 주민번호 변수 sn
			String sn = "711005-1234567";
			char g = sn.charAt(0);
			System.out.println(g);
		// 0,9 라면 mz세대
			if (g == '0' | g == '9') {
				System.out.println("mz세대입니다.");
			}
		// 0,9 라면 청년
		// 8 이라면 젊은이
		// 그외 정상인
			String h = "";
			switch (g) {
			case '0' :
			case '9' : h = "청년";	break;
			case '8' : h = "젊은이";	break;
			default : h = "정상인"; 	break;
			}
			System.out.println(h+"입니다.");
	}

}
