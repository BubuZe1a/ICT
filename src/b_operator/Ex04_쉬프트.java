package b_operator;

public class Ex04_쉬프트 {

	// 	shift 연산자
	// 	각각 비트의 값을 이동하는 연산자
	// 
	// 	0010 
	//0	0100
	public static void main(String[] args) {
		
		int a = 4;
		
		int b = a << 2;
		int c = a >> 1;
		System.out.println("a="+ a); // 4
		System.out.println("b="+ b); // 
		System.out.println("c="+ c); // 
		
		int d = a >>> 1;			 // >>> 는
 		System.out.println("d="+ d); // ?
		
	}

}
