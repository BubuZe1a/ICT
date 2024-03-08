package b_operator;

/*
	논리연산자

		- 일반논리 : &&(and) 	||(or) && 두가지 조건 충족, || 한가지 조건 충족
		- 이진논리 : &			|
		
		
	A 	B		A&&B 	A||B
	0(F)0(F)	0		0
	0(F)1(T)	0		1
	1(T)0(F)	0		1
	1(T)1(T)	1		1

	

 */

public class Ex06_논리 {

	public static void main(String[] args) {
		
		int 성적 = 75;
		char 태도 = 'A';
		if ( 성적>=80 || 태도=='A') {
			System.out.println("성적이 80점이상이거나 태도가 A라면 우등생");
		}
		
		if( 성적>80 && 태도=='A') {
			System.out.println("성적이 80점이상이고 태도가 A라면 성적향상반");
		}else {
			System.out.println("성적향상반이 아님");
		}
	}

}
