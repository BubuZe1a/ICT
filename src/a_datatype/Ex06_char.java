package a_datatype;

public class Ex06_char {

	public static void main(String[] args) {
		
		char ch = 'A' ;
		System.out.println("문자:" + ch);
		
		int i = 'E';
		System.out.println("문자???" + i );
		System.out.println("문자???" + (char) i );

	}

}

/*
	자바 이전 언어의 문자 체제 : Ascii-code (1B)
							1B = 2(8) = 256개 문자 표현
							`영어, 숫자, 특수기호 등만 표현
	자바 : Unicode (2B)
				2B = 2(16) = 65535개 문자 표현
						` ascii-code 가 포함
						` 일본어 , 한국어, 중국어 등등 포함
						` '\u0000' = Unicode 값
			
	[ ASCII-code ]
		
		'A' = 0100 0001 = 2(6) + 2(0) = 65
		'B' = 0100 0010 = 2(6) + 2(1) = 66
		'E' = 0100 0101 = 2(6) + 2(2) + 2(0) = 69

		'a' = 0110 0001 = 2(6) + 2(5) + 2(0) = 97 
		'b' = 0110 0010 = 2(6) + 2(5) + 2(1) = 98
		








*/









