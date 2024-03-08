package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String [] str = {"행복하자","맛점","맑은정신"};
		
		
		try {
			for(int i=0;i<str.length;i++) { 
				System.out.println(str[i]); // 비정상 값을 입력한다면 바로 "캐치"가 잡아내서 14,15열은 패스하고 16열로 실행
			}
			System.out.println("예외가 발생할 여지가 있는 구문");
			return;
		}catch(Exception ex) {
			
			System.out.println("예외 발생 : " + ex.getMessage());
		}finally { // return이 앞에 있더라도 무조건 실행하는 것이 파이널리
			System.out.println("무조건 실행 구문");
		}
		
		System.out.println("정상적인 종료");
	}

}
