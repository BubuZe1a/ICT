package z_zero;

import java.util.Scanner;

public class Ex0308 {

	public static void main(String[] args) {
		
		int count = solution();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		

		
		
		
			
		}
	public static int solution (int order) {
		int count = 0;
		while (order !=0) {
			if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) count ++; {
				order /=10;
			}
			return count;
		}
	}

}
