package c_control;

public class 복습2 {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 5; i++ ) {
//			
//			for (int k=0; k< 4-i; k++) {
//				System.out.print(" ");
//			} // end of for k
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			} // end of for j
//			System.out.println();
//		} // end of for i
		
		int i = 1, j = 10;
	      do {
	          if(  i > j ) break;
	          j--;
	      } while( ++i < 5 );
		System.out.println("i="+i + ", j = " + j );
	
		

	}

}
