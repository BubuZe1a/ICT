package b_operator;

import java.util.Scanner;

/*
 *  정수 하나 입력 받아서 3의 배수인지 아닌지 여부를 출력
 *  
 *  
 *  [예]
 *  	숫자 입력 : 4
 *  	3의 배수가 아닙니다.
 *  
 *  [예]
 *  	숫자 입력 : 9
 *  	3의 배수가 맞습니다.
 *  
 *  [힌트] % 활용
 *  
 *  
 */



public class 연습1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int a;
		System.out.println("숫자 입력=");
		a = input.nextInt();
		a = a % 3;
		if ( a == 0 ) {
				System.out.println("3의 배수가 맞습니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		

	}

}
