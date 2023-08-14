package mypakc;

import java.util.Scanner;

public class Operator {

	public static void main(String[] atgs) {
		
		//==================================
		//연산자
		//==================================
		
		/*
		 종류
		 산술연산자 : 사칙연산(+, -, *, /, % - 나머지 연산 자주 씀)   의문 - 비율 구하는 연산자
		 증감연산자 : ++, -- 값이 1씩 증가 혹은 감소.
		 비교연산자 : <, >, <=, >=, ==, !=(같지 않다 - 부정)
		 비트연산자 : &(and), |(or), ~(not), ^ ---------자주 안씀
		 논리연산자 : &&(and), ||(or), !(not)
		 대입연산자 : =
		 복합대입연산자 : +=, -=, *=, /=...  ------------------------------여기까지 자주쓴다
		 시프트연산자 : <<, >>(비트를 각 방향으로 밀어준다.)
		 삼항연산자 : (true or false), ? a:b (비교 후 결과가 참이면 전자, 거짓이면 후자.)
		 */
		
		int a =10;
		int b =5;
		int result =a+b;
		int disgrede =a-b;
		int increse =a*b;
		int slash =a/b;
		System.out.println("덧셈 결과 : "+result);
		System.out.println("뺄셈 결과 : "+disgrede);
		System.out.println("곱셈 결과 : "+increse);
		System.out.println("나눗셈 결과 : "+slash);
		
		//증감연산자
		//전위 연산자와 후위 연산자로 나뉨
		
		int num =3;
		++num;
		
		System.out.println("전위 증가 연산 : "+num);
		
		int number =5;
		number++;
		System.out.println("후위 증가 연산 : "+number);
		//위 결과는 동일
		
		int value =5;
		int preIncrementValue = ++value;
		System.out.println("전위 증가 연산 결과 : "+preIncrementValue);
		System.out.println("value의 값 : "+value);
		//우선 계산하고 그 값을 도출한다.
		
		value =5;
		
	
		int postIncrementValue =value++;
		System.out.println("후위 증가 연산 결과 : "+postIncrementValue);
		System.out.println("value의 값 : "+value);
		//우선 변수를 넣고 후에 계산한다.
		
		int num1 =7;
		int num2 =7;
		int result1;
		int result2;
		
		result1 = --num1+4;
		result2 = num2--+4;
		
		System.out.println(result1);
		System.out.println(result2);
		//후위 연산자는 +1이 되기 전의 수를 가져오므로 두가지 이상의 수가 계산될때 사용.
		//처음부터 계산한다면 상수로 해결 할 수 있지만 계산 도중의 값을 가지고 둘 이상의 계산을 할 때 사용?
		
		
		int x =10;
		int y =x-- + 5 + --x;
		System.out.println(y);
		//변수 y의 수행되는 연산의 순서를 작성.
		//1. 첫번째 decrement operator는 피연산자의 뒤쪽에 위치해 있으므로 덧셈보다 먼서 시행
		//2. 덧셈 연산이 수행한 후에 감소 연산이 수행
		//3. 두번째 decrement operator는 피연산자의 앞쪽에 위치해 있으므로 덧셈연산보다 우선 수행
		//4. 감소 연산이 수행된 후에 덧셈 연산이 수행
		//5. 마지막으로 대입연산 수행
		
		char c1 ='a';
		char c2 =c1;
		char c3 = ' ';//공백으로 초기화
		
		int i =c1+1;
		System.out.println(i);
		c2++;
		System.out.println(c2);
		c3 =(char)(c1+1);
		System.out.println(c3);
		
		//비교연산
		//두 피연산자의 값의 크기를 비교하고 참이면 true, 거짓이면 false로 반환된다.
		
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<=2);
		System.out.println(5>=2);
		System.out.println(5==2);
		System.out.println(5!=2);
		
		
		int number1 =5;
		int number2 =2;
		//int number3 =5;
		
		//==, != 참조변수가 같은 주소를 가리키고 있는지의 여부를 확인 할 수 있는 연산자다.
		System.out.println(number1==number2);
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1==str2);//같은 문자여도 각각의 번지가 다르기 때문에 값은 false가 나오게 된다.
		
		
		//1.국어, 영어, 수학, 과학, 국사 다섯개의 과목의 총점과 평균을 구해라.
		
		int subject1 =90;
		int subject2 =70;
		int subject3 =72;
		int subject4 =80;
		int subject5 =85;
		
		int resultAllPuls = subject1+subject2+subject3+subject4+subject5;
		float resultAverage = resultAllPuls/5f;
		
		System.out.println("과목의 총점 : "+resultAllPuls);
		System.out.println("과목의 평균 : "+resultAverage);
			

	
		
		//비트연산자
		//&(and), |(or), ~(not), ^(XOR)
		/*
		 a    b   &   |   ^   

		 0    0   0   0   0   
 		 0    1   0   1   1
		 1    0   0   1   1
		 1    1   1   1   0
		 
		 ~
		 0   1
		 1   0 반전
		 */
		
		int bitNum1 =5; //0000 0101
		int bitNum2 =3; //0000 0011
		
		int resultAnd = bitNum1 & bitNum2; //0000 0001
		
		System.out.println("&연산 결과 : "+resultAnd);
		
		int resultOr =bitNum1 | bitNum2; //0000 0111
		
		System.out.println("| 연산 결과ㅣ : "+resultOr);
		
		
		//시프트연산

		int leftShift =bitNum1<<2;
		//0000 0101 > 0010 1000
		System.out.println("왼쪽 시프트 연산 결과 : "+leftShift);
		
		int rightShift =leftShift>>1;
		//0000 1010
		System.out.println("오른쪽 시프트 연상 결과 : "+rightShift);
		
		//비트를 왼쪽으로 1만큼 옮기면 2배만큼 증가하고, 오른쪽으로 1만큼 옯기면 절반으로 줄어든다.
		
		//대입연산
		//=(오른쪽의 피연산자를 왼쪽에 대입한다.)
		
		//int playerHp =100;
		//int potion =50;
		System.out.println("포션섭취");
		//playerHp = playerHp + potion;
		//playerHp+=potion;             위와 같은 선언이나 더 축약되어있다.
		
		
		int maxValue =3;
		maxValue = maxValue+3;
		System.out.println("대입연산 결과 : "+maxValue);
		
		//복합대입 연산
		int maxValue1 =5;
		maxValue1+=10;
		System.out.println("결과 : "+maxValue1);
		
		//삼항연산
		//int value2 =(true)?1:2;
		//System.out.println(value2);
		
		int number5 =10;
		int number6 =20;
		int res =(number5>number6)? number5:number6;
		
		System.out.println("변수 두개중 더 큰 수는? : "+res);
		
		int number7 =30;
		int number8 =15;
		boolean isCheck = (number7-number8>10)?true:false;
		System.out.println("두 수의 차이가 10보다 큰가? : "+isCheck);
		
		
		int number9 =2;
		
		String sPes=(number9%2==0)?"짝수":"홀수";
		System.out.println("홀짝 결과는? : "+sPes);
		
		//연산자 우선순위 꼭 기억하기.
		
		
		//논리연산자
		//&&, ||, !
		

		//int banana = x;
		x=4;
		System.out.println(x>3 && x<5);
		
		System.out.println((x>3 && x<5) || (x<3 && x>5));
		System.out.println((x>3 && x<5) || (x<4 && x>7));
		System.out.println(x>3 && x<5 && x<3 && x>5);
		//x>3 && x<5 이때 x>3, x<5가 참일때 결과는 참
		//x>3 || x<5 이때 x>3, x<5중 하나만 참일때도 결과는 참
		//둘 이상의 &&를 사용하고||를 사용해야하는 경우 ()를 사용해 우선 처리할 것을 결정한다.
		
		
		//연산자를 정리
		//직접 예제를 만들어서 삽입.
		 
		
		
		
		//출력 > 입력
		//스캐너 클래스 객체를 생성
		Scanner scanner = new Scanner(System.in); //Scanner는 자바 Util안에 속해있다. import로 불러와야함.
		//입력받은 내용을 strInput에 저장
	
		//입력을 하고 누르면 입력한 내용이 문자열로 반환
		String strInput=scanner.nextLine();
		
		//정수로 타입을 변환하고 싶을 때 strInput을 Int타입으로 변환.
		int convertInput = Integer.parseInt(strInput);
		int input = scanner.nextInt(); 
		
		
		//내부적으로 진행되는 과정들을 이용하고 나서, 자원누수를 막기 위해 해당 기능을 멈춰주는 것.
		//다시 사용할 때 다른 코드와 충돌될 위험이 있어 더 안전한 사용을 위해 사용한다.
		scanner.close();
		//경고를 무시하는 코드로 무시 할 수도 있다.
		
		
	
	}
	
}
