package d_array;

/*
	임의의 수 (랜덤 수)
	
		Math.random() : 0.0부터 1.0보다 작은 어떤 수
		
			ex)	0.000008
				0.7654323
				0.5000001

		Math.random() * 10
			ex)	0.00008
				7.654323
				5.000001
				
		(int) ( Math.random() * 10 ) // 0~9까지 임의의 수 추출
			ex) 0
				7
				5
 */

public class Ex04_Lotto {

	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		
		// 로또번호 생성 -> 임의의 수 생성해서 저장
		for (int j=0;j<lotto.length;j++) {
			lotto[j] = (int)(Math.random()*45)+1;
		} 
		
		// 정렬
		for (int a=lotto.length -1; a>0 ; a--) {
			for( int b=0; b < a; b++ ) {
				if ( lotto[b] > lotto[b+1]) {
					int temp	= lotto [b];
					lotto[b] 	= lotto [b+1];
					lotto[b+1] 	= temp;
				}
			}
			
			
			
		}
		
		//출력
		for (int j=0;j<lotto.length;j++) {
			System.out.print(lotto[j]+ " ");
		}

	}

}
