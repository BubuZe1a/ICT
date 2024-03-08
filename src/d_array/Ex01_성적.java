package d_array;

import java.util.*;
public class Ex01_성적 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하세요->");
		int cnt = input.nextInt();
		
		int [] score = new int [cnt];
		
		for (int a=0; a<cnt ; a++ ) {
			System.out.println(a+"학생의 국어점수를 입력하세요->");
			score[a] = input.nextInt();
		}
		int total = 0;
		for (int all=0;all<cnt;all++) {
			total +=score[all]; 
		}
		int avg = total/cnt;
		
		System.out.println("위 학생들의 총점은" + total + "입니다.");
		System.out.println("위 학생들의 평균은" + avg + "입니다.");
		
		
	}

}
