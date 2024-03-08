package d_array;

/*
 * 변수선언	(1단계
 * int a;
 * 
 * 값지정	(2단계
 * a = 10;
 * 
 * 초기화 	(1+2단계
 * int b = 5;
 */




public class Ex00_배열초기화 {

	public static void main(String[] args) {
		
		//int [] kor = new int[5];
//		int [] kor; // 배열변수 선언 // 국어 점수 변수 생성
//		kor = new int [5]; // 배열객체 생성 // 5개 방 생성 // 각 방마다 초기화 상태로 0값을 가지고 있음
		
		//배열초기화
		//int [] kor = new int [] {99,88,77,66,55};
		int [] kor = {99,88,77,66,55};
		
		//값지정
//		kor[0] = 99;
//		kor[1] = 88;
//		kor[2] = 77;
//		kor[3] = 66;
//		kor[4] = 55;
		
		
		int total = 0 ;
		for ( int i =0; i < kor.length; i++) { // length 배열의 길이 0,1,2,3,4 == i<5
			total += kor[i];
		}
		System.out.println("총점:" +total);
		
	} 

}
