package e_method;

import java.util.Scanner;

public class Ex09_복습2 {

	public static void main(String[] args) {
		
		char[][] ch=input();
		output(ch);

	}
	/*
	 * 역할 : makeSquare() 함수 안에서 생성한 문자배열에 저장된 문자를 화면 출력
	 */
	static void output(char[][]ch) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]);
			}
		System.out.println();
		}
	}
	
	/*
	 *  역할 : 두 정수와 알파벳 문자 하나를 입력받음
	 *  
	 *  [예] 두 정수와 알파벳 문자 하나를 입력 =>
	 *  3 4 F
	 */
	static char[][] input () {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 정수=");
		int a = input.nextInt();
		System.out.println("두번째 정수=");
		int b = input.nextInt();
		System.out.println("알파벳 1개=");
		String str = input.next();
		char c = str.charAt(0);
		char ch [][] = makeSquare(a,b,c);
		return ch;
		
	}
	/*
	 * 역할 : input() 함수에서 입력 받은 첫번째 정수만큼의 행과
	 * 		 두번째 정수만큼의 열의 배열을 만들어서
	 * 		 입력 받은 문자를 시작하는 배열값을 저장합니다.
	 * [예]
	 * 	F G H I
	 *  J K L M
	 *  N O P Q 
	 */
	static char[][] makeSquare(int a,int b,char c) {
		
		char [][] ch = new char [a][b];// 배열선언
	//  char [][] ch = new char [3][4]
		//ch.length=3,ch[i].length=4
		for (int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				ch[i][j] = c++;
				
			}
			 
		}
		//return값은 값하나만 넘길수있다 여기서 ch는 ch[i][j]의 값을 지니고 있다.
		return ch;
	}
}
