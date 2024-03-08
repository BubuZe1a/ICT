package e_method;

public class Ex02_반환2 {

	public static void main(String[] args) {
		
		int[] data = add();// 15로 점핑
		// 합산후 출력
		int sum = data[0] + data[1]; // 18에서 반환된 값 계산
		System.out.println("합:" + sum);
		
		
	}
	
	static int[] add() {
		int a=10, b=20;
		int [] data = {a,b};
		return data; // 7로 점핑 // 리턴 값은 단 1개 ex) return a,b; 이런건 안됨
		
	}
}
