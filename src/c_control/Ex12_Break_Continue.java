package c_control;

/*
 *  break : 블럭 벗어나는 문장
 *  continue : 블럭 끝으로 가는 문장
 */
public class Ex12_Break_Continue {

	public static void main(String[] args) {
	
	OX: // 소문자도 상관 없지만 대문자로 눈에 띄는게 좋음
	for(int i=0;i<2;i++) {
		for (int j=0;j<3;j++) {
			//if (j == 1) break; 	// for 문 끝나고 나가기,break는 가장 가까운 반복문을 벗어남 
			//if(j == 1) continue; 	// continue를 만족하게 된다면 for 문 스킵하고 다시 반복
			//if (j == 1) break OX;	// OX 문단에서 벗어남
			if(j == 1) continue OX;	// OX라는 이름을 가진 문단을 스킵
			System.out.println("<"+i+","+j+">");
		}
		System.out.println("데이타");
	}
		

	}

}
