package e_method;

import java.util.Scanner;

public class Ex09_복습 {

	public static void main(String[] args) {
		
		String result = func();
		// 합격여부 출력
//		System.out.println("당신은 " + result + "입니다.");
		
		method(result);
	}
	static void method(String result) {
		System.out.println("당신은 " + result + "입니다");
	}
	
	// 역할 : 콘솔창에서 점수를 입력 받기
	//		해당 점수가 80점 이상이면 합격
	//		아니라면 불합격으로 반환
	static String func () {
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 점수 ->");
		int jumsu = input.nextInt();
		System.out.println("당신은 " + jumsu + "점입니다.");
		if (jumsu >=80) return "합격";
		else return "불합격";
			
	}
}
