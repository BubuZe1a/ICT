package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex09_연습2 {

	public static void main(String[] args) {
		int[] score = input();
		int avg = getCalc(score);
		output(avg);

	}
	// 역할 : 국영수 점수를 입력 받기
	static int[] input () {
		Scanner input = new Scanner(System.in);
		System.out.println("국영수 점수를 입력 (ex)100/90/80 ->");
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str,"/");
		int kor = Integer.parseInt(st.nextToken()); // string -> int 형변환
		int eng = Integer.parseInt(st.nextToken());
		int math = Integer.parseInt(st.nextToken());
		int[] score = {kor,eng,math}; 
		return score;
	}
	// 역할 : 입력값은 국영수 점수로 총점과 평균을 구해서 출력
	static int getCalc (int score[]) {
		int kor=score[0];
		int eng=score[1];
		int math=score[2];
		int total = kor+eng+math;
		int avg = total/3;
		System.out.println("총점은=" + total + ", 평균은=" + avg);
		
		return avg;
	}
	// 역할 : 평균 값을 받아서 학점 구하기
	static void output (int avg) {
		if (avg >= 90) System.out.println("A학점");
		else System.out.println("B학점");
	}

}
