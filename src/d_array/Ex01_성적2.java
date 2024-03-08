package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 5명의 국어점수를 입력하세요 (입력예시:10/10/10/10/10) -> 55/66/75/69/72
 * 총점은 xxxx이고,평균은 oooo입니다.
 */


public class Ex01_성적2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("5명의 점수를 입력하세요(입력예시:10/10/10/10/10)");
		String sent = input.nextLine();
		
		
		StringTokenizer st= new StringTokenizer(sent, "/");
		int cnt = st.countTokens(); // 카운터토큰으로 쪼개기 / 몇갠지
		System.out.println("갯수="+cnt);
		int [] score = new int [cnt];
		
		int total = 0 ;
		 for (int i=0; i<cnt;i++) {
			score[i]=Integer.parseInt(st.nextToken()); // String -> int / Integer.parseInt는 캐스팅
			total += score[i];
		 }
		
//		int total = 0 ;
//		for(int i=0; i<cnt; i++) {
//			total += score[i];
//		}
		int avg = total/cnt;
		
		System.out.println("총점은 " + total + "이고," + " 평균은 " + avg + "입니다.");
		
		
	}

}
