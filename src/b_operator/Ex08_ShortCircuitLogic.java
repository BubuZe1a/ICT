package b_operator;

/*
 * 
 * ShortCircuitLogic
 * 			- 일반논리 연산자에서 발생하는 개념
 * 
 * 			- 앞의 조건에 의해 결과가 정해지면 뒤에 조건을 실행하지 않음
 * 
 */


public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		
		// 일반논리연산자 대신 이진논리연산자
		// 		-> ShortCircuitLogic이 발생하지 않도록 이진논리연산자를 씀
		if ( a>3 & ++a>3) {
			System.out.println("조건만족");
		}

		System.out.println("A=" + a); // 자바만 3이라고 결론 남 : 앞부분에서 flase가 나왔기 때문에 계산할 필요가 없다고 결론
		
		if ( a>1 | ++a>3) {
			System.out.println("조건만족2"); // 출력 됨
		}
		System.out.println("A=" + a); // 
		
		// 일반논리연산자
		
//		if ( a>3 && ++a>3) {
//			System.out.println("조건만족");
//		}
//
//		System.out.println("A=" + a); // 자바만 3이라고 결론 남 : 앞부분에서 flase가 나왔기 때문에 계산할 필요가 없다고 결론
//		
//		if ( a>1 || ++a>3) {
//			System.out.println("조건만족2"); // 출력 됨
//		}
//		System.out.println("A=" + a); // 
		
		
	}

}
