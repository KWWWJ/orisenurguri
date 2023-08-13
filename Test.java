package myPack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("실험");

			int[] number = new int[25];

			int bingoCount = 0;

			int inputNum = 0;

			Scanner scanner = new Scanner(System.in);

			 

			//배열 초기화

			for(int i = 0; i<number.length;i++)

			{

			number[i] = i+1;

			}

			//셔플

			for(int i = 0; i <number.length;i++)

			{

			int k=(int)(Math.random()*25);

			int temp = number[i];

			number[i]=number[k];

			number[k]=temp;

			} 

			 

			//루프

			//1. 입력받은 숫자를 특수기호로 변환
			//2. 나머지 부분 계산
			//3. 3줄이 되면 끝

			while(true)

			{

			System.out.println("빙고 카운트 : " + bingoCount);

			for(int i = 0; i< number.length;i++)

			{

			if(number[i]==35) { //문자형으로 변환

			System.out.print((char)number[i]+"\t");

			}

			else{System.out.print(number[i]+"\t");

			}//나머지 출력

		

			if((i+1)%5==0)

			{

			System.out.print("\n\n");

			}

			}

			 

			// 빙고 3개 정지

			if(bingoCount==3) { //3회 반복시 탈출

			break;

			}

			bingoCount = 0; 

			System.out.print("숫자를 입력해주세요 : " );

			 

			inputNum=scanner.nextInt();

			 

			for(int i =0; i<25; i++) {

			if(inputNum==number[i])

			{

			number[i] = 35;

			}

			}

			//겹치면 변환

			 

			for(int i = 0; i<5; i++) //가로세로 빙고

			{

			int width = 0;

			//가로 확인

			for(int j = 1; j<5;j++)

			{

			if(number[5*i]==number[5*i+j])

			{

			width++;

			if(width==4) {

			bingoCount++;

			}

			}

			}

			//세로 확인

			int heigth = 0;

			for(int j =1; j<5; j++) {

			if(number[i]==number[i+j*5]) //5씩 증가

			{

			heigth++;

			if(heigth==4) {

			bingoCount++;}

			}

			}

			}

			// 대각선 확인

			int slash =0;

			int reverseSlash =0;

			// 슬레쉬

			for(int i = 1; i < 5; i++)

			{

			if(number[0]==number[6*i])//다음 대각선까지 6씩 증가

			{

			slash++;

			if(slash==4)

			{

			bingoCount++;

			}

			}

			}

			// 역슬레쉬

			for(int i = 1; i < 5; i++)

			{

			if(number[4]==number[4+4*i])//다음 대각선까지 4씩 증가

			{

			reverseSlash++;

			if(reverseSlash==4)

			{

			bingoCount++;

			}

			}

			}

			}

			
		
		
	}
}

