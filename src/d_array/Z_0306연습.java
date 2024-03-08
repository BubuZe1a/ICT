package d_array;

import java.util.StringTokenizer;

public class Z_0306연습 {

	public static void main(String[] args) {
		//[문제 1]
//		int [ ] arr = { 66, 55, 44, 33, 22, 11 };
//		int  sum 	= 0;
//		
//        
//		for (int a=0;a<arr.length;a++) {
//			sum += arr[a]; 
//		}
//		 
//		 
//        /*  배열의 각각의 값을 더하는 코드 */ 
//
//        System.out.println( "sum = " + sum );
        
        //[문제 2]
//        int  [] [] arr = {{ 90, 90, 90, 90, 90 },
//							{ 80, 80, 80, 80, 80 },
//							{ 70, 70, 70, 70, 70 },
//							{ 60, 60, 60, 60, 60 } };
//				
//        int  sum = 0;
//        
//        for (int a=0;a<arr.length;a++) {
//			for (int b=0;b<arr[a].length;b++ ) {
//				sum += arr[a][b];
//			}
//        	 
//		}
//
//        /*  배열의 각각의 값을 더하는 코드 */ 
//
//        System.out.println( "sum = " + sum );
		
		//[문제 3]
		int  [] [] score = { { 98, 98, 90, 92, 99 },//477 95
                			 { 81, 82, 83, 84, 85 },//415 83				
                			 { 60, 65, 60, 65, 69 }, 
                			 { 77, 74, 79, 78, 72}};
		
		int  [] sum = new int[ score.length ];
		
		for (int i=0;i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				sum [i] += score[i][j];  
			}
		}
        
		/*  배열의 각각의 값을 더하는 코드 */ 

		for(int i=0; i<score.length; i++){
			System.out.println( i+"번째 학생의 총점 " + sum[i] );
			System.out.println( i+"번째 학생의 평균 " + sum[i]/5 );
		}
		
		
		
		
		
		
		
		
		
		
		}

}
