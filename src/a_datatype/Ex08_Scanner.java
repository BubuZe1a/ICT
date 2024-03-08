package a_datatype;

// 패키지임포트 자동 단축키 ctrl + shift + 영문 O
// import java.util.Scanner;

/*
	콘솔에 출력
		System.out
				` print()
				` println()
				` printf()
	콘솔에 입력
		System.in
		
	-> Scanner 이용
		
		`문자열 입력시 : next() / nextLine() ===> [과제] 차이점 확인
		`정수형 입력시 : nextInt()
		`실수형 입력시 : nextDouble()
		
*/

//import java.lang.*;
import java.util.*;

public class Ex08_Scanner {

	public static void main(String[] args) {
		
//		System.out.println("이름입력하세요 ->");
//		
//		Scanner input = new Scanner (System.in);
//		String name = input.nextLine();
//		
//		System.out.println("당신의 이름은 " + name + "입니다");
		
		/*
		 * 두 정수를 입력받아 변수 first, second에 저장하기
		 * 두 정수를 더해서 변수 add에 저장하기
		 * add 변수값을 화면에 출력하세요
		 */
		
		Scanner input = new Scanner (System.in);
		int first,second;
		System.out.println("숫자를 입력해주세요");
		first= input.nextInt();
		System.out.println("숫자를 입력해주세요");
		second = input.nextInt();
		
		int add = first+second;
		System.out.println(add);
		
		
		
	}

}
