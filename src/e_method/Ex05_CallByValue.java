package e_method;

/*
 * Call by value
 * 
 * : 인자의 자료형 기본형인 경우
 *  
 *   원래 데이타에 영향이 없음
 */
public class Ex05_CallByValue {

	public static void main(String[] args) {
		int a=10, b=20;
		add(a,b);
		System.out.println("A=" + a + ",B=" + b);
	}

	static void add(int a, int b) {
		a +=b;
		System.out.println("A=" + a + ",B=" + b);
	}
}
