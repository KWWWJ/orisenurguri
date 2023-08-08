package ControlStament;

import java.util.Scanner;

public class sdgrfsdgg {
	
	public static void main(String[] agrs) {
		
		Scanner user = new Scanner(System.in);
	
		
		
int answer=0;
		
		
		int redy = (int)(Math.random()*100)+1;
		System.out.println("숫자맞추기 시작");
		
		while(true) {
		answer=user.nextInt();
		if(redy>answer) {
			System.out.println("값이 작습니다.");
		}
		else if(redy<answer) {
			System.out.println("값이 큽니다.");
		}
		else {
			System.out.println("정답입니다.");
			break;
		}
		}
		
		
		user.close();
}
}