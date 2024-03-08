package b_operator;

public class Ex01_증가감소 {

	public static void main(String[] args) {
		
		// a=5 b=7
		int a = 5, b = 7;
		
		// [0]
		System.out.println("A=" + a + ",B=" + b ); // A=5, B=7
		System.out.println("A=" + a + 1 + ",B=" + b+1 ); // A=6, B=8
		System.out.println("A=" + (a + 1) + ",B=" + (b + 1) ); // 
		
		a = a + 1;
		b = b - 1;
		System.out.println("A=" + (a + 1) + ",B=" + (b + 1) ); // A = 7 B = 7
		
		//*************
		// 증가연산자 ++
		// 감소연산자 --
		
		// [1]
		++a;
		--b;
		System.out.println("A=" + a + ",B=" + b ); // 
		
		a++;
		b--;
		System.out.println("A=" + a + ",B=" + b ); //
		
		// [2] 앞에 경우와 뒤에 경우 다릅니다
		int c = 10;
		int result = ++c;
		// c = c + 1
		// int result = c;
		System.out.println("결과:" + result); // 11
		System.out.println("c=" + c);
		
		// int result = d;
		// d = d + 1
		int d = 10;
		int result2 = d++;
		System.out.println("결과2:" + result2); // 10 
		System.out.println("d=" + d);
		
		// [3]
		int x = 10, y = 12;
		System.out.println("X="+ ++x + ",Y=" + --y);
		// x = x + 1 , y = y - 1
		// x = 11 , y = 11
		System.out.println("X="+ x++ + ",Y=" + y--);
		// 
		System.out.println("X="+ x++ + ",Y=" + y--);
		
		
	}

}
