package c_control;

import java.util.Scanner;

public class Ex11_dowhile연습 {

	public static void main(String[] args) {

		//구구단의 단수를 입력 받아서 해당 구구단을 출력해주세요
		Scanner input = new Scanner(System.in);

		//[1] for 문이용: 반복 횟수가 정해져 있을 때
		//		System.out.println("구구단 몇번 반복할까염");
		//		int num = input.nextInt();
		//
		//
		//		for (int j =0; j<num; j++) {
		//			System.out.println("구구단의 단수를 입력->");
		//
		//			int dan = input.nextInt();
		//			for ( int i= 0;i <=9; i++ ) {
		//				System.out.println(dan + "*" + i + "=" + dan*i);
		//			}
		//		}

		//[2] while 문이용: 반복 횟수가 정해지지 않을 때
		//		while (true) {
		//			System.out.println("구구단의 단수를 입력->");
		//			
		//				int dan = input.nextInt();
		//				for ( int i= 0;i <=9; i++ ) {
		//					System.out.println(dan + "*" + i + "=" + dan*i);
		//				}
		//				System.out.println("종료를 원하십니까(Y|N)");
		//				String answer = input.next();
		//				if(answer.equals("Y")|answer.equals("y")) break;
		//				}

		//[3] do~while 문이용: 반복 횟수가 정해지지 않을 때
		String answer="";
		do {
			System.out.println("구구단의 단수를 입력->");

			int dan = input.nextInt();
			for ( int i= 0;i <=9; i++ ) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}
			System.out.println("계속하시겠?(Y|N)");
			answer = input.next();

		} while(answer.equals("Y")|answer.equals("y"));
		






	}

}
