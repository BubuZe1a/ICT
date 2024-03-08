package f_exception;

public class MyException2 extends Exception{
//public 공공적인 privite사적인
	 
	public String getMessage() {
		return "우리가 매번 실수하는 예외발생";
	}
}
