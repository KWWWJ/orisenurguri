package ControlStament;

import java.util.Scanner;

public class IfStatment {

	public static void main(String[] agrs) {
		
		/*System.out.println("월요일이다.");
		    
		    //동작 조건이 true이면
		if (condition)//작성 가능 범위는 무제한.(if문 자체는 몇 개를 쓰든 상관 없음)
		//여기를 실행한다.
		{
			
	}
		//if(condition ) {}가 여러개이고 그 중 두가지 이상이 true일 경우 위에서 부터 순차적으로 실행.
		//{}는 실행 시킬 코드가 한줄일 때는 빼고 상관 없다. 컴파일시 한 줄은 자동으로 {}삽입한다.
		
		*/
		
		
		//if~else else는 조건식이 없고 if에 대해 거짓일 경우 실핼시킬 코드를 만들 때 사용한다.
		//ex) 그것이 사과라면 먹는다. 라는 if 조건문일 때, 거짓일 경우 else로 냉장고에 넣는다.라는 행동을 지정한다.
		
		//else에도 조건식을 달 수 있는데, 그때는 else if로 조건문을 달고 여러가지의 경우의 수를 설정할 수 있다.
		//ex) if 그것이 사과라면 먹는다. > else if 바나나일 경우 오른쪽으로 치운다. else if 포도일 경우 왼쪽으로 넘긴다.
		
		//if는 하나하나의 조건을 모두 따진다면 else if의 경우에는 도중에 하나라도 조건을 만족하면 그것까지만 출력한다.
		//else if는 위의 if문이 참일 경우 실행하지 않음.(컴파일시 더 빠르게 넘어간다.)
		
		
		
		/*if(10<3) {
			System.out.println("위 조건이 맞으면 실행된다.");
		}
		else { 
			System.out.println("아니면 여기가 실행된다.");
		}
		
		
		
		
		int number =17;
		
		if(number %2==0) {
			System.out.println(number + "짝수임");
		}
		else {
			System.out.println(number + "홀수임");
		}
		
		
		int height =150;
		
		if(height>=140) {
			System.out.println("놀이기구에 탑승");
		}
		else {
			System.out.println("탑승 불가");
		}
		
		int a =85;
		
		if(a>=90) {
			System.out.println("A학점");
		}
		if(a>=80) {
			System.out.println("B학점");
		}
		*/
		
		//int score =0;
		//char grade =' ';
		
		//System.out.println("학점을 입력해라");
		//Scanner scanner = new Scanner(System.in);
		//String strInput = scanner.nextLine();
		
		/*score = scanner.nextInt();
		
		if(score>=90) {
			grade ='A';
		}
		else if(score>=80) {
			grade ='B';
		}
		else if(score>=70) {
			grade ='C';
		}
		else {
			grade ='D';
		}
		
		System.out.println("너님이 학점은"+ grade+"이다");
		
		scanner.close();// 이거 다시해보기
		*/
		
		//if문 처럼 상태를 말하는 문장은 중첩이 가능하다.
		//if(조건식1)
		//{
		//   if(조건식2) 여기가 실행되려면 감싸고 있는 조건식 1이 참이여야 가능하다.
		//{조건식 1, 2가 모두 참일 때 실행
		//}
		//else { 조건식 2가 거짓일 때 실행
		//}
		//}
		//else {} 조건식 1이 거짓일 때 실행
		
		
		//실습 - score가 90점 보다 크거나 같으면 A학점인데, 90점 이상에서도 98점 이상은 A+.
		//94점 미만은 A-
		//B학점도 마찬가지.
		//다 아니면 C
		
		Scanner scanner = new Scanner(System.in);

		
		int testResult = 0;
		testResult = scanner.nextInt();
		
		String outResult =" "; //문자열을 사용할 때 이것.
		//int outResult =' '; 점수 알파벳을 삽입
		//int upDown =' '; +, -를 삽입
		System.out.println("학점을 입력하시오.");
	
		
		if(testResult>=90) {
		 if(testResult>97) {
				outResult ="A+";    //따로 전부 적는게 아니라 A와 +와 -를 하나씩 문자로 지정해 이후 출력시 %c%c로 표기 할 수 있다.
			}
		 else if(testResult<95) {
				outResult ="A-";
			
			}
			else {
				outResult ="A";
			}
		}
		if(testResult<90) {
		 if(testResult>=88) {
			outResult ="B+";
		}
		 else if(testResult<85 ) {
			 outResult ="B-";
		 }
		 else {
			 outResult ="B";
		 }
		 
		 }
		if(testResult<=79){
			 outResult ="C";
	
		
		}
		System.out.println("학점 : "+outResult);
		//혹은 System.out.println("학점 : %c%c", outResult, +와 -를 지정한 변수);
		
		scanner.close();
		
		
		
		
		
		
}
}