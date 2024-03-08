package c_control;

public class Ex08_for중첩2 {

	public static void main(String[] args) {

		// A~Z 한줄출력

//		for (int u=0; u < 26; u++) { // 26번 반복
//			for (char i ='A'; i <= 'Z'; i++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		} 
//		System.out.println("------------------");
		
		// A~Z 뒤에서 1개씩 줄여가기
		
		for (int u=0; u < 26; u++) { // 26번 반복
			for (char i ='A'; i <= 'Z'-u; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		// Z~A 1개씩 늘리기 1
//		for (int u=0; u < 26; u++) { // 26번 반복
//			for (char i ='Z'; i >='Z'-u; i--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		// Z~A 1개씩 늘리기 2
//		int zet = 26;
//		
//		for (int i=0; i < zet; i++) {
//			char back = 'Z';
//			for (int j=0; j<=i; j++) {
//				System.out.print(back + "");
//				back--;
//			}
//		System.out.println();
//		}
		
		// A~Z 앞에 1개씩 없애기
		for (int u=0; u < 26; u++) { // 26번 반복
			for (char i =(char)('A'+u); i <= 'Z'; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}
}
