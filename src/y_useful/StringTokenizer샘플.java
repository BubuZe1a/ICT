package y_useful;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer샘플 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력 (ex)90/80/70/60  -> "); // 안녕 하이 홍길동
		String sent = input.nextLine();
		System.out.println(sent);
		
		StringTokenizer st = new StringTokenizer(sent,"/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//ex) st.countTokens() -> for() 이용
	}

}
