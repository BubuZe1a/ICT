package b_operator;

import java.util.Scanner;

/*
 *  년도를 입력 받아서 해당 년도가 윤년인지 평년인지 출력
 * 
 * 
 * 
 * 
 * 
 */

public class 연습선택 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		int year;
		System.out.println("년도 입력 = ");
		year = input.nextInt();
		if ( year%4 != 0 ) {
			System.out.println("평년입니다.");
		}else if (year%100 != 0 ) {
			System.out.println("윤년입니다.");
		}else if (year%400 != 0 ) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		

	}

}
