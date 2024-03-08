package d_array;

public class Ex03_정렬 {

	public static void main(String[] args) {
		
		int [] su = {20,2,49,8,12,5} ;
		
		// 정렬 (버블정렬)
		for ( int i=su.length -1; i>0 ; i-- ) { // i는 0이 되면 빠져나옴
			for( int j=0; j < i; j++ ) {// j가 i보다 커질 때까지 반복
				if ( su[j] > su[j+1]) { // j가 j+1보다 클 경우
					int temp = su[j];	// j를 temp에 저장하고
					su[j] 	 = su[j+1]; // j에 j+1을 넣어 바꾸고
					su[j+1]  = temp; 	// j+1에 temp 넣어서 자리를 바꾼다
				}
			}
		}
		
			
	

		// 출력
		for(int i=0; i<su.length; i++) { 
			System.out.print( su [i] + " ");
		}
	}

}
