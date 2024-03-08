package e_method;

/*	[ 함수 - 메소드 구조 ]
 *  리턴형 메소드명 (파라메타 변수) {
 * 
 * 	}
 * 
 * 리턴형 : 반환하는 값의 자료형
 * 		void : 없다
 * 
 * 		파라메타 변수 : 인자(arguement)를 받는 변수
 * 				없으면 안써도 됨
 * 		
 */


public class Ex01_인자 {

	
	
	public static void main(String[] args) {
		// 데이타
		int a=10, b=20;
		
		add(a,b); // 인자에 값 대입

	}

	static void add(int a, int b) {
		int sum = a + b;
				System.out.println("합=" + sum);
	}

}
