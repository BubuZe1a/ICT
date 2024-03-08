package b_operator;

public class Ex07_이진논리 {

	public static void main(String[] args) {
		
		int a = 15 ; // 00000000 00000000 00000000 00001111
		int b = 10 ; // 00000000 00000000 00000000 00001010
		
		int and = a & b ;
				// a 00001111
				// b 00001010
				// ------------
				// & 00001010
		System.out.println("& = " + and);
		
		int or = a | b ;
				// a 00001111
				// b 00001010
				// ------------
				// | 00001111
		System.out.println("| = " + or);

		int xor = a ^ b ;
		// a 00001111
		// b 00001010
		// ------------
		// ^ 00000101
		System.out.println(xor); // 5
		// xor : 둘다 신호가 다른 경우에만 결과 발생
		// 		 0과 1인 경우에 결과 1이 발생
		
	}

}
