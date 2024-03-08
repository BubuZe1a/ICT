package c_control;

import java.util.*;
public class Z_연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int s = 0;
        
        if(a>b){
            if(b>c)
                s=b;
            else if(a>c)
                s=c;
            else
                s=a;
        }
        else{
            if(a>c)
                s=a;
            else if(b>c)
                s=c;
            else
                s=b;
        }
        System.out.println(s);

		
	}

}
