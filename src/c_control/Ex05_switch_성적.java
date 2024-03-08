package c_control;

public class Ex05_switch_성적 {

	public static void main(String[] args) {
		
		/*
		 * 국어 80점
		 * 영어 70점 
		 * 수학 60점
		 */
		
		int kor = 80, eng = 70, math = 60 ; 
		// total = 총점
		int total = kor + eng + math ;
		// avg = 평균
		int avg = total / 3 ;
		
		System.out.println("평균 : " + avg);
		
		char score = '0';
		
		
		switch ( avg / 10 ) {
			case 10 :
			case 9 : score = 'A'; break;
			case 8 : score = 'B'; break;
			case 7 : score = 'C'; break;
			default : score = 'F';
		}
		System.out.println(score + " 학점");
	}

}
