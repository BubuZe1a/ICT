package a_datatype;

public class Ex03_변수선언 {

	public static void main(String[] args) {
		
		// [1] 변수 선언 + 값 대입
		int kor; 	// 정수형 변수 kor 선언
		kor = 30;	// 변수 kor에 30 정수값을 저장한다
		
		// [2] 초기화 : 변수선언시 값을 대입
		int eng = 30;
		
		// [3] 여러개 변수인 경우
		int math = 30, java = 50;
		
		
		if( kor == java ) {
			System.out.println("점수동일");
		}else {
			System.out.println("점수가 다름");
		}
		
		// [참고] swap : 두 변수의 값을 맞바꾸기
		int a = 10, b = 20;
		System.out.println("A=" + a + ",B=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("A=" + a + ",B=" + b);
		
		
		
		
		
		
		
		
		
	}
}
