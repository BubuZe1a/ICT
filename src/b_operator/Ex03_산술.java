package b_operator;

/*
 *  산술 연산자
 *  
 *  	*  
 *  	/ 나머지를 구하는 나누기
 *    	+  
 *    	-
 *     	% 몫을 구하는 나누기
 */



public class Ex03_산술 {

	public static void main(String[] args) {
		
		int a = 3;
		if ( a%2 != 0 ) {
			System.out.println("홀수"); // 나눴을때 나머지가 있다, 홀수 
		}else {
			System.out.println("짝수"); // 나눴을때 0이 된다, 짝수
		}

	}

}
