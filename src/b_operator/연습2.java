package b_operator;

import java.util.Scanner;

/*
 * 문자 하나를 입력받아서 그 문자가 대문자인지 소문자인지 출력
 * 
 * [예]
 * 		문자입력 -> a
 * 		소문자입니다
 * 
 * [예]
 * 		문자입력 -> A
 * 		대문자입니다
 * 
 * 
 * [힌트] 비교연산자와 일반 논리연산자 활용
 * 
 */


public class 연습2 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner (System.in);
//		char a; 
//		System.out.println("영문 입력=");
//		a = input.next().charAt(0);
//		if( 'a' <= a && a <= 'z'  ) { 
//			System.out.println("소문자입니다.");
//		}else if ('A' <= a && a <= 'Z'){
//			System.out.println("대문자입니다.");
//		}else {
//			System.out.println("영문을 입력하세요.");
//		}
		
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("문자 입력 =");
		
		//char ch = (char)input.next(); 
		// String -> char 형변환 안됨 - 자료형인 참조형-기본형의 메모리 구조가 다름
		String str = input.next();
		// str : "a"
		char ch = str.charAt(0); // 0번째가 첫번째
		System.out.println("입력확인 :" + ch);
		
		// A:65
		// B:66
		// ㄱ < ㅎ
		if('A' <= ch & ch >= 'Z') {
			System.out.println("대문자");
		}else if ('a' <= ch & ch >= 'z') {
			System.out.println("소문자");
		}else {
			System.out.println("영문을 입력해주세요.");
		}
		
		
		
		}

}
