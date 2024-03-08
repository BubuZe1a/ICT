package e_method;

/*
 *  	Call by reference
 * 
 * 			-메소드의 인자가 참조형인 경우
 * 
 * 			-주소복사가 되어서 원본에 영향이 있음
 */
public class Ex05_CallByRef {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("니하오");
		StringBuffer b = new StringBuffer("씌예씌예");
		add(a,b);
		System.out.println(b);
	}
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b); // 뒤에 붙이는 명령어 append
		System.out.println("A="+a+",B="+b);
	}
}
