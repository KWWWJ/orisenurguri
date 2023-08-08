package ControlStament;

import java.util.Scanner;

public class Game {
	
public static void main(String[] agrs) {
		
		
		//가위바위보 - 10판만 가능(현재 몇판째인지 표기),배팅 금액을 모두 잃으면 사전에 종료
		//플레이어는 소지금이 있고(표기) 사전에 배팅이 가능하다.(배팅금액 표기)
		//이기면 플레이어가 배팅금액의 *2만큼 얻는다.
		//비기면 배팅금액만큼 잃는다.
		//지면 배팅금액의 *2만큼 소모
	
		
		/////////////////가위바위보 게임
		
		Scanner user = new Scanner(System.in);
		
		
		int match=0;
		int gold=100;
		int leftMoney=0;
	
	
		while(true) { //10판에 도달하면 종료
			int redy = (int)(Math.random()*3)+1; //컴퓨터의 랜덤 숫자 생성
			int start =0;
			int betting =0;
			System.out.println("가위바위보를 시작합니다 배팅금액을 설정해주세요.");
			betting = user.nextInt(); //소지금 배팅
			
			System.out.println("배팅금액 :"+betting); //배팅 금액 출력
			leftMoney = gold-betting;
			System.out.println("잔액 : "+leftMoney);
			System.out.println("'가위(1)', '바위(2)', '보(3)' 중 하나를 입력해주세요.");
			start = user.nextInt(); //숫자 입력
			
		switch(redy/start) {
		case 1:
			System.out.println("무승부입니다.");
			System.out.println("현재 소지금은 "+leftMoney+"원 입니다");
		    break;
		case 2:
			System.out.println("패배하였습니다.");
			leftMoney=leftMoney-betting;
			System.out.println("현재 소지금은 "+leftMoney+"원 입니다.");
			break;
		case 3:
			System.out.println("승리하셨습니다.");
			leftMoney=leftMoney+betting*2;
			System.out.println("현재 소지금은 "+leftMoney+"원 입니다.");
			break;
		}
			
		switch(redy-start) {
		case -1:
			System.out.println("승리하셨습니다");
			leftMoney=leftMoney+betting*2;
			System.out.println("현재 소지금은 "+leftMoney+"원 입니다.");
			break;
		case -2:
			System.out.println("패배하셨습니다.");
			leftMoney=leftMoney-betting;
			System.out.println("현재 소지금은 "+leftMoney+"원 입니다.");
			break;
		}
		
			match=match+1;
			System.out.println("현재 게임 휫수는 "+match+"번째 입니다.");
			gold = leftMoney;
			
			
			if (match==10)break;
			if (leftMoney<=0)break; //0원에 도달하면 종료
		}
		System.out.println("게임 종료");
		
		
		
		
		///////////////////////////////////////////////////////
		
		//랜덤 숫자 맞추기
				//컴퓨터가 랜덤한 숫자를 생성(1~100), 플레이어는 랜덤한 숫자를 맞춘다.
				//단, 컴퓨터는 플레이어가 낸 숫자에 대해서 범위를 알려준다.
				//숫자가 50일때 플레이어가 80을 입력한다면 "더 작다" 출력.
		
		
		
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
