package a_datatype;

/*

	자료형 (데이터타입)
	1. 기본형(primitive)
		- 논리형 : boolean
		- 문자형 : char
		- 정수형 : int / long
		- 실수형 : double
	
	2. 참조형(reference) : 클래스 / 배열
			=> new 키워드르 통해서 메모리(객체생성)확보해야 함
			
	[ex] 이름이 홍길동
		char a = '홍길동'; // 안됨
		char b = "홍길동"; // 안됨
		
		char x = '홍';
		char y = '길';
		
	[cf] 문자 1개 		=> char
		 문자열(0개이상)	=> String(클래스)
 */





public class Ex05_String {

	public static void main(String[] args) {
		

		char c = 'ㅁ';
		
		// 참조형변수선언
		String name;
		// 메모리확보(값지정) -> 객체생성
		name = new String("홍길동");
		
		String irum = new String ("홍길동");
		
		if ( name == irum ) {
			System.out.println("동일이름");
		}else {
			System.out.println("다른 이름");
		
			
		// 문자열 비교는 equals 함수를 이용해야만함	
		if ( name.equals (irum) ) {
			System.out.println("동일이름2");
		}else {
			System.out.println("다른 이름2");
		}
		
		
		
		}
	}

}
