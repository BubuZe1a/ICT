package d_array;

import java.util.Scanner;

/*


 */



public class Ex02_최댓값찾기 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("입력할 숫자 갯수=");
		int cnt = input.nextInt();
		
		int [] score = new int [cnt];
		
		for (int a=0; a<cnt; a++ ) {
			System.out.println(a+"번째 숫자를 입력해주세요.");
			score[a] = input.nextInt();
		}
		int max = score[0];
		for (int b=1; b<cnt; b++) {
			if (max < score[b]) {
				max = score[b];
			}
		}
		System.out.println("가장 큰 수는" + max + "입니다.");
//		int [] su = {38,4,20,28,57,9,5};
//		int max = su[0]; 				// 1. 배열의 첫번째 값을 입력한다.
//		for (int i=1;i<su.length;i++) {	// 4. 배열이 끝날때까지 반복
//			if (max <= su[i]) { 		// 2. 가장 크다고 가정하고 다음번 방에 있는 데이타와 
//										//    비교 저장된 값보다 큰 값이 들어오면
//				max = su[i]; 			// 3. 더 큰 값으로 저장
//			}
//		}
//		System.out.println("가장 큰 값 : " + max);
		
		
		
	}

}
