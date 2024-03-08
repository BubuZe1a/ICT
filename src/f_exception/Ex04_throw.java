package f_exception;

public class Ex04_throw {

	public static void main(String[] args) {
		try {
			readArray();
		}catch (Exception ex) {
			System.out.println("예외처리 : "+ ex.getMessage());
		}

	}
	
	static void readArray() throws Exception{
		try {
			String []msg = {"행복합시다","공부합시다","짝꿍친하게"};
			for(int i=0;i<=msg.length;i++) {
				System.out.println(msg[i]);
			}
		}catch(Exception ex) {
			throw new MyException2(); // 일부러 예외발생
		}
	}

}
// 예외를 던질땐 throws
// 예외를 직접 발생 시킬땐 throw
