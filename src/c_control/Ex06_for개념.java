package c_control;

public class Ex06_for개념 {

	public static void main(String[] args) {

		/*
		 * for (초기치; 조건문; 증가치) {
		 *  반복할 문장들;
		 * }
		 * 초기치 -> 조건문 -> 반복할 문장들 -> 증가치 = 조건문이 false 될때까지
		 */
		
		
		
//		1부터 10까지 합을 구하기
//		int hap = 0;
//		for (int i=1; i<=10; i++ ) {
//			//hap = (int i=1; i<=100; i++) {hap + i ;
//			hap += i; //위와 동일
//		}
//		System.out.print("합:" + hap);
		
//		1부터 100까지의 홀수의 합과 짝수의 합을 구하기
// 		hap = 짝의 합, bba = 홀의 합
		int hap = 0, bba = 0;
		
		for (int i=1; i<=100; i++) {
			if ( i%2 == 0) { // i를 2로 나누었을때 0이면 참 나머진 거짓
				hap += i; // 참인 수의 합을 구함
			}else {
				bba += i; // 거짓인 수의 합을 구함
			}
		}
		System.out.println("짝수의 합은 " + hap);
		System.out.println("홀수의 합은 " + bba);

		int odd = 0, even = 0;
		for (int i=1; i<=100; i+=2) {
			odd += i;
			even += (i+1);
		}
//		------------------------------
//		System.out.println();
//		for (int i=10; i>=1; i-- ) {
//			System.out.print(i);
//		}
//		
//		for (int i=1; i<= 30; i+=3) {
//			System.out.println(i);
//		}
		
		
		
		
//		for( char ch='A'; ch <= 'C'; ch++ ) { // for (초깃값; 조건식; 증감식)
//			System.out.print(ch);
//		}
//		System.out.println();
//		
//		for( char ch='Z'; ch>= 'A' ; ch-- ) {
//			System.out.print(ch);
//		}
//		System.out.println();
//		
//		// A부터 S까지 우선 출력
//		for ( char ch= 'A'; ch <='S'; ch += 2 ) {
//			System.out.print(ch);
//		}
		
	}

}
