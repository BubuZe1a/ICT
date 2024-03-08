package z_recursive;

public class ASumTest {

	public static void main(String[] args) {
		// 1-5 합구하기
		// 1+2+3+4+5
		int sum = 0;
		for (int i=0;i<=5;i++) {
			int exsum = sum;
			sum = exsum + i;
			System.out.println(sum + "=" + exsum + "+" + i); 
		}
		System.out.println("합계:" + sum);
	}

}
