package ControlStament;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] agrs) {
		
		/*switch여러개의 조건식을 설정할 때, 
		
		switch(key) { //변수 또는 표현식. switch 안에 또 다른 switch문을 넣을 수 있다.
	    case value1 : //값1 밑에 여러개 생성 가능; if격에 해당
	    	//값1에 해당하는 실행할 코드
	    	break; //데이터가 실행되었을 때 감싸는 switch문을 빠져나와 다음 스텝으로 이동하게 함.
	    case value2 : // else if격에 해당 위에 break가 없으면 같이 수행.
    	//값2에 해당하는 실행할 코드
    	    break;
	    	
	    	default;
	    	    break;
		} //break시 이쪽으로 나옴
		*/
		
		int a = 8;
		
		switch (a) {
		case 10:
		break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break; //여기서 탈출
		case 7:
			System.out.println("C");
			break;
		case 6:	
			System.out.println("D");
			break;
		}
		
		if(a>=9) {
			
			System.out.println("A");
		}
		else if(a==8) {
			System.out.println("B"); //여기서 탈출
		}
		else if(a==7) {
			System.out.println("C");
		}
		else if(a==6) {
			System.out.println("D");
		}
		
		
		int num, result =0;
		
		final int ONE =1;
		
		
		/*switch(result) {
		case '1':  //ok. 문자 리터럴(정수 상수인 49와 동일)
		break;
		
		case ONE : //상수 ok
		break;
		
		case num: //변수는 불가능
		break;
		
		case 3.4: //실수 불가능
		break;
		}
		*/
		
		/*char seasonCode ='S';
		
		switch(seasonCode) {
		case 'S':
			System.out.println("봄");
			break;
		case 'U':
			System.out.println("여름");
			break;
		case 'A':
		System.out.println("가을");
		break;
		case 'W':
			System.out.println("겨울");
			break;
			default:
				System.out.println("잘못된 코드");
				break;
		}
		
		int inputNum =0;
		
		Scanner scanner = new Scanner(System.in);
		
		inputNum = scanner.nextInt();
		
		switch(inputNum){
		case 1 :
			System.out.println("입력한 숫자 : "+inputNum);
			break;
		case 2 :
			
		}
		*/
		
		//가위바위보 만들기
		//플레이어 입력(1. 가위, 2. 바위, 3. 보)
		//컴퓨터 (1.가위, 2. 바위, 3. 보)
		//결과 비김, 이김, 짐 if, switch로 하나씩
		
		Scanner hand = new Scanner(System.in);
		
		//
		//int random = (int)(Math.random)()*3+1; 랜덤 함수
		
	
		System.out.println("가위바위보!");
		
		int start = 0;
		start = hand.nextInt();
		int redy = (int)(Math.random()*3)+1;
		
		String gameResult = " ";
		
		if (start==1) {
			if(redy==3) {
				gameResult ="win";
			}
			else if(redy==2) {
				gameResult ="lose";
			}
			else {
				gameResult ="draw";
			}
		}
		if(start==2) {
			if(redy==3) {			
				gameResult ="lose";
			}
			else if(redy==2) {
				gameResult ="draw";			
				}
			else {
				gameResult ="win";
			}
		}
		if(start==3) {
			if(redy==2) {
				gameResult ="win";
			}
			else if(redy==1) {
				gameResult ="lose";
			}
			else {
				gameResult ="draw";
			}
			
		}
		
		System.out.println("you "+ gameResult);
	
		hand.close();
		
		
		
		switch(redy/start) {
		case 1:
			System.out.println("you draw");
			break;
		case 2:
			System.out.println("you lose");
			break;
		case 3:
			System.out.println("you win");
			break;
			}	
		switch(redy-start) {
		    case -1:
			    System.out.println("you win");
			    break;
		    case -2:
		    	System.out.println("you lose");
		    	break;
		}
			
	
		
	}
}


	
	
	

	
	

