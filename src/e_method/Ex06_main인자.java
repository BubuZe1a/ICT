package e_method;

public class Ex06_main인자 {

	//함수명(메소드명) 	: main
	//리턴형			: void
	//				 반한하는 리턴값이 없음
	//매개변수(파라메타)	: String[]
	//
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

	}
	/*
	 *  > javec Ex06_main인자.java
	 *  
	 *  > jave Ex06_main인자 안녕 하이 올라
	 *  
	 */

}
