package b_operator;

import java.util.Scanner;

/*
 *  비교연산자
 *  
 *  
 * 		> >= < <= == !=
 *  
 */




public class Ex05_비교 {

	public static void main(String[] args) {
		// 국, 영, 수 점수를 입력 받아서/ 총점(total)을 구해서 출력
		// 평균(avg)을 구해서 출력
		
		Scanner input = new Scanner(System.in);
		int a, b, c, total, avg;
		System.out.println("국어 점수=");
		a= input.nextInt();
		System.out.println("수학 점수=");
		b= input.nextInt();
		System.out.println("영어 점수=");
		c= input.nextInt();
		
		
		
		total = a + b + c;
		
		
		System.out.println("총 점수="+total);
		avg = total / 3;
		System.out.println("평균= "+avg);
		
		if( avg >= 90 ) {					// 90점 이상은
			System.out.println("A학점");		// A
		}else if ( avg >= 80){				// 80점 이상은
			System.out.println("B학점");		// B
		}else if ( avg >= 70) {				// 70점 이상은
			System.out.println("C학점");		// C
		}else {								// 나머진
			System.out.println("F학점");		// F
		}
		
		
		

	}

}
