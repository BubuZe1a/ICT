package c_control;

public class Ex02_if_전화번호 {

	public static void main(String[] args) {


		//		String tel = "02-123-4567";
		//		String tel = "032-123-4567";
		//		int idx = tel.indexOf("-");
		//		System.out.println(idx);
		//		
		//		String localNum = tel.substring(0, 2); // 0부터 2앞에꺼 까지
		//		System.out.println(localNum);

		// 지역번호 02 "서울입니다" 출력
		// 그렇지 않고 지역번호가 032라면 "인천입니다" 출력
		// 나머지는 "한국입니다" 출력

		//		String tel = "032-132-1354";
		String tel = "026-132-1234";
		int idx = tel.indexOf("-");
		System.out.println(idx);
		String localNum = tel.substring(0, idx);

		char ch = tel.charAt(5);
		System.out.println(ch);
		// 서울인 경우에 5번째 문자의 값이 3이라면 '마포구'이고
		// 그렇지 않으면 '강남구'라고 출력

		String city = "";
		String gu = "";

		if (localNum.equals("02")) {
			city = "서울";
			if ( ch== '3' ) {
				gu = "마포구";
			}else {
				gu= "강남구";
			}
		}else if (localNum.equals("032")) {
			city = "인천";
		}

		System.out.println( city + "/"+ gu + "입니다.");

	}

}
