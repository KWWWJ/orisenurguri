package mypakc;

import java.util.Scanner;

//이것은 주석이다. 컴퓨터가 인지하지 않음.
//자바에서 모든 코드는 반드시 클래스 안에 존재해야 한다.
public class Test {

	//main 매서드의 선언. 미리 약속된 부분이다. 반드시 항상 있어야 함.
	//entry point임. 진입점이다.
	//1.오타
	//2.세미콜론, 중괄호 미스매칭
		
		private static int myBet;
		private static int comBet;
		private static int moneyPoint=1000;
		private static int bettingPoint;
		private static int comPoint=1000;
		private static int count=0;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			//1부터 20까지의 수 중 5개를 골라야 한다.
			int []myNumber=new int[5];//내가 얻게 될 숫자, 5개의 수를 저장할 배열
			int []comNumber=new int[5];//컴퓨터가 얻게 될 숫자
			
	//================나의 숫자 5개 선택 ================================================	
			while(moneyPoint>0&&comPoint>0) {
				
			count++;
			System.out.println("계속 하시려면 Enter키를 누르세요"+"   "+"현재 남은 포인트: "+moneyPoint+", 컴퓨터의 포인트"+comPoint);
			Scanner scan1=new Scanner(System.in);
			String input1;
			input1=scan1.nextLine();
				
				
			System.out.print("랜덤으로 뽑힌 숫자>>> ");
			for(int i=0;i<myNumber.length;i++)
			{
				int j=(int)(Math.random()*20)+1;
				myNumber[i]=j;
				System.out.print(myNumber[i]+",");
			}
			System.out.println();
			System.out.println("===========================");
			int i=(int)(Math.random()*myNumber.length);
			System.out.println("계속 하시려면 Enter키를 누르세요"+"   "+"현재 남은 포인트: "+moneyPoint+", 컴퓨터의 포인트"+comPoint);
			Scanner scan2=new Scanner(System.in);
			String input2;
			input1=scan1.nextLine();
			
			System.out.println("뽑힌 숫자"+myNumber[i]);
			
			myBet=myNumber[i];
	//==================컴퓨터 숫자 5개 선택 =================================================		
			for(int h=0;h<comNumber.length;h++)
			{
				int j=(int)(Math.random()*20)+1-1+1;
				comNumber[h]=j;
			}
			
			int h=(int)(Math.random()*comNumber.length);
			
			
			comBet=comNumber[h];
	//=============== 배팅하는 라인 ======================================		
		
			System.out.println("계속 하시려면 Enter키를 누르세요"+"   "+"현재 남은 포인트: "+moneyPoint+", 컴퓨터의 포인트"+comPoint);
			{
				String input;
			input=scan.nextLine();
			}
			System.out.println("배팅을 하시겠습니까?");
			System.out.println("1. 배팅한다 \n2. 죽는다");
			
			int input;
			input=scan.nextInt();
			if(input==1) {
				
				System.out.println("배팅을 하셨습니다. 얼마를 배팅하시겠습니까?"+"   "+"현재 남은 포인트: "+moneyPoint+", 컴퓨터의 포인트"+comPoint);
				
				bettingPoint=scan.nextInt();
				
				
				betting();
				
			}
			else if(input==2) {
				System.out.println("죽었습니다. 포인트에서 100포인트가 삭감되었습니다.");
				System.out.println("당신의 숫자: "+myBet);
				System.out.println("컴퓨터의 숫자: "+comBet);
				Die();
				
			}
		}if(moneyPoint<=0) {
			System.out.println("컴퓨터의 승리입니다! 좀더 분발하셔야겠네요");
		}else if(comPoint<=0) {
			System.out.println("축하드립니다! 컴퓨터를 이기셨습니다!"+"시도한 횟수: "+count);
		}
		}
	 //===================== 숫자를 비교하는 라인 ================================
		
		static void betting() {
			
			if(myBet>comBet) {
				System.out.println("당신의 숫자: "+myBet);
				System.out.println("컴퓨터의 숫자: "+comBet);
				System.out.println("배팅에서 이기셨습니다.");
				Win();
			}else if(myBet<comBet){
				System.out.println("당신의 숫자: "+myBet);
				System.out.println("컴퓨터의 숫자: "+comBet);
				System.out.println("배팅에서 지셨습니다.");
				Lose();
				}
			else if(myBet==comBet) {
				System.out.println("비겼습니다. 배팅한 포인트가 다시 적립됩니다");
				Draw();
				
			}
		}
	//=======================이겼을 때 포인트 계산하는 라인=================
		static void Win() {
			moneyPoint+=bettingPoint;
			comPoint-=bettingPoint;
			System.out.println("현재 남은 포인트: "+moneyPoint+", 컴퓨터의 포인트"+comPoint);
		}
		static void Lose() {
			moneyPoint-=bettingPoint;
			comPoint+=bettingPoint;
			System.out.println("현재 남은 포인트: "+moneyPoint+", 컴퓨터의 포인트"+comPoint);
		}
		static void Draw() {
			System.out.println("현재 남은 포인트"+moneyPoint+", 컴퓨터의 포인트"+comPoint);
		}
		static void Die() {
			moneyPoint-=100;
			comPoint+=100;
			System.out.println("현재 남은 포인트: "+moneyPoint+", 컴퓨터의 포인트"+comPoint);
			
		}

	
	
	
}

