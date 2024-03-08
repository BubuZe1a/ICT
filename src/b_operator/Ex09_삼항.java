package b_operator;

/*
 * 삼항연산자
 * 		조건 
 * 		? 참인경우 실행문 
 * 		: 거짓인경우 실행문
 */

import java.util.*;

public class Ex09_삼항 {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("당신의 점수를 입력하세요 ->");
//		
//		int score = in.nextInt(); // 정수를 입력 받음
//		
//		String result = (score > 80) ? "합격" : "불합격";
//		
//		System.out.println( "결과:" + result );
		
		/*
		 * 두 수를 입력 받아서 a변수와 b변수에 저장하고 
		 * 그 두 수중에서 더 큰수를 출력한다
		 * int max = (a > b) ? a : b
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요.");
		int a = in.nextInt();
		int b = in.nextInt();
		int max = ( a > b ) ? a : b ;
		System.out.println("더 큰수는 " + max + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
