package ControlStament;

import java.util.Scanner;

public class LopeClass {
	
	public static void main(String[] agrs) {
		System.out.println("23.08.08");
		
		//반복문 while, do while, for
		//어떤 작업이 반복적으로 수행하도록 만들때 사용.
		//for문은 반복 횟수가 정해져 있을 때 사용
		//원하는 값을 얻을 때 까지 반복할때 while을 사용
		//for문이나 while에 속한 코드들은 조건에 따라 한번도 수행되지 않을 수 있지만
		//do while은 최소 한번은 수행한다.
	
		
		
		
	 
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		
		System.out.println("for문을 이용한 출력"); 
		for(int i=0; i<3; i++) { //조건식이 true인 동안만 돌아감
	     //초기값; 조건식; 증감식
	     //초기식은 for문이 시작될때 한 번만 실행
		 //조건식은 false가 될때까지 실행
		 //증감식은 다음 반복을 위해 매회 반복이 될때마다 호출된다.
			System.out.println("반복시킨다");
			
		}
		
		for(int i =0; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println();
			
			int k;//for문에서 사용할 변수는 이렇게 안씀.
		
		for (k=0; k<5; k++) {
			System.out.printf("k변수의 데이터 : %d\n", k);
		}
		
		for (int i=10; i>=0; i--) {
			System.out.printf("i변수의 데이터 : %d\n",i);
		}
		//for문을 사용해 1부터 100까지의 합.
		//출력은 1부터 100까지의 합 : ??
		
		int j =0;//for문에서 한 번 계산 된 이후 루프 지점이 for부터이므로 적용되지 않는다.
		
		for (int i=1; i<=100; i++) {
		  
			j+=i;	
		}
		System.out.println("1부터 100까지의 합 : "+j);	
		
		
		
		int dan = 2;
		
		for(int i =0; i<=9; i++) {
			
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		//입력으로 3을 넣어서 3단을 출력하는 방법.
		
		Scanner user = new Scanner(System.in);
		
		
		
		
		//짝수 출력
		for (int i =1; i<=10; i++) {
			
			if(i%2==0) { //2로 나눈 나머지가 0이라면 출력한다.
				System.out.print(i+" ");
			}
		}
		
		//홀수 출력
       for (int i =1; i<=10; i++) {
			
			if(i%2!=0) { //2로 나눈 나머지가 0이 아니라면 출력한다.
				System.out.print(i+" ");
			}
		}
         System.out.println();
	     System.out.println();
		/////////////////
       
       //중첩 for 문
       
       for(int i=0; i<3; i++) {
    	   for(j=0; j<3; j++) { //false가 될 때까지 탈출 하지 않음
    		   System.out.println(i+" , "+j);
    	   }
       }
		
   	System.out.println();
	System.out.println();
		
		
       System.out.println("구구단 시작");
		
		
       int number =0;
		number = user.nextInt();
		int result;
		
		for(int i =1; i<=9; i++) {
			result=number*i;	
			System.out.println(number+"*"+i+"="+result);
		}
		System.out.println();
		System.out.println();
		
		//2단부터 9단 까지.
		for (int i=2; i<=9; i++) {
			for (int h=1; h<=9; h++) {
				System.out.println(i+"*"+h+"="+(i*k));
			}
		}
		
		System.out.println();
		System.out.println();
		int num = 5;
		for (int i=1; i<=num; i++) {
			for(int h=1; h<=i; h++) {
				System.out.print( " * ");
			}
				System.out.println();
		}
		
		//모양 반대로 찍고 그 양면의 모습도 찍기.
		

		
		
		/*
		
		while(조건문) {
		
		for(조건){
		if (조건)break; ->for를 벗어나는 break 
		
		if(number==10)break; 라면 number가 10일때 벗어나므로 9까지만 출력된다.
		반대로 while조건문에 적은 경우에는 10까지 출력.
		}
		}
		
		
		*/
		
		
		int sum=0;
		int aum;
		boolean flag =true;
		
		while (flag) {
			System.out.print(">>");
			
			String temp=user.nextLine();
			aum=Integer.parseInt(temp);
			
			if(aum!=0) { //입력이 0이 아니라면
				sum+=aum; //계속 더하고
			}
			else { //입력이 0이면
				flag = false; //flag =>false
			}
			System.out.println("합계 : "+sum);
		}
		
		
		
		//continue는 if()continue; 의 형태로 사용하거나 반복문 속에 일반형태로 삽입해 사용할 수 있다.
		//또한 continue는 반복문을 벗어나게 하는것이 아니라 다시 수행 할 수 있도록 진행시키는 역할도 한다.
		
		
		int menu =0;
		
		Scanner foodInput = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1)햄버거");
			System.out.println("(2)탕수육");
			System.out.println("(3)육개장");
			System.out.println("메뉴에 알맞는 숫자를 입력하세요.");
			
			String temp = foodInput.nextLine();
			menu = Integer.parseInt(temp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료한다.");
				break;
				
			}
			else if(!(1<=menu&&menu<=3)) {
				System.out.println("메뉴를 다시 선택하세요");
				continue; //false가 되더라도 루프로 넘어간다.
			}
			System.out.println("12345");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		foodInput.close();
		user.close();
		
		}
	
		
	}


