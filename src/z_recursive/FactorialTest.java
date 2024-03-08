package z_recursive;

public class FactorialTest {

	public static void main(String[] args) {
		
		// 5! = 5*4*3*2*1;
		int five =0;
		five = Fact(5);
		System.out.println(five);

	}
	static int Fact (int i) {
		if (i==1) return 1;
		return i * Fact(i-1);
	}
}
