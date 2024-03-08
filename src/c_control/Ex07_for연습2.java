package c_control;

import java.util.Scanner;

public class Ex07_for연습2 {

	public static void main(String[] args) {

		/*
		 * 소문자 하나 입력 받고
		 */
		//		Scanner small = new Scanner(System.in);
		//		System.out.println("소문자를 입력하세요->");
		//		
		//		String str = small.nextLine(); // str = "f"
		//		char ch = str.charAt(0); // ch = 'f'
		//		
		//		for ( char alpha = ch ; alpha <= 'z' ; alpha ++ ) {
		//			System.out.print(alpha);
		//		}
		//		System.out.println();

		// 입력한 문자부터 z까지 출력

		Scanner a = new Scanner(System.in);
		System.out.println("대소문자를 입력하세요");

		String b = a.nextLine();
		char input = b.charAt(0);
		
		
		if (input >= 'a' & input <= 'z' ) {
			for (char small = 'a'; small <= input; small++ ) {
				System.out.println(small);
			}
		}else if(input >= 'A' & input <= 'Z' ){
			for (char small = input; small <= 'Z'; small++ ) {
				System.out.println(small);
			}
		}else {
			System.out.println("Error");
		}
	
		}
	}