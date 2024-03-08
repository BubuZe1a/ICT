package d_array;

public class Ex07_로또 {

	public static void main(String[] args) {
		
		int [][] lotto = new int [5][6];
		
		//로또번호 생성
		for(int i=0;i<lotto.length;i++) {
			for (int j=0;j<lotto[i].length;j++) {
				lotto[i][j]= (int)(Math.random()*45+1);
				System.out.print(lotto[i][j]+" ");
				
			}
			System.out.println();
			
		}
		//정렬
		
			
		
		//출력
		
	}

}
