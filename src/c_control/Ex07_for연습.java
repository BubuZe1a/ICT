package c_control;

import java.util.Scanner;

public class Ex07_for연습 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("숫자를 입력하세요 ->");
		int su = input.nextInt();
		
		for ( int i=1; i<=su; i++) {
			System.out.print(i + " ");
			if(i%5==0) {
				System.out.println();
			}
			// i 숫자가 5로 나머지 연산했을때 0인 경우 --> 5의 배수인경우
			// 개행
		
		}

	}

}
