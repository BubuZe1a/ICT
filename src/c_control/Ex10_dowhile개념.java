package c_control;

public class Ex10_dowhile개념 {

	public static void main(String[] args) {
		
		int sum =0;
		
		//for
//		for (int a = 0; a<=10;a++)  {
//				sum +=a;
//		}
//		System.out.println("합은 "+sum);
		
		//while
//		int a=1;
//		while (a<=10) {
//			sum +=a;
//			a++;
//		}
//		System.out.println("합은 "+sum);
		
		
		// do
		int a=1;
		do {
			sum +=a;
			a++;
		} while (a<=10); // 조건식을 마지막에
		System.out.println("합은 "+sum);
		
		
		
		
		
		
		
	}

}
