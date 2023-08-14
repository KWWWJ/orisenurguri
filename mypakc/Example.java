package mypakc;

public class Example {

	public static void main(String[] args) {
		
		//1. 산술 연산자
		
		
		int a = 10; //첫번째 변수
		int b = 8;  //두번째 변수
		
		int plus = a+b; //a와 b를 합산
		int subtraction = a-b; //a에서 b를 차감
		int multiply = a*b; //a와 b를 곱셈
		int divide = a/b; //a를 b로 나누기
		
		System.out.println("더한 값 : "+plus); // a와 b를 합한 값을 출력
		System.out.println("뺀 값 : "+subtraction); // a에서 b를 뺀 값을 출력 
		System.out.println("곱한 값 : "+multiply); // a와 b를 곱한 값을 출력
		System.out.println("나눈 값 : "+divide); // a를 b로 나눈 값을 출력
		
		int remain = a%b; //a를 b로 나눈 값의 나머지
		
		System.out.println("나머지 값 : "+remain);
		
		
		//2. 증감연산자
		
		int apple = 5; //변수 생성
		int nife = ++apple; //apple의 변수에 전위 연산자로 증가 연산자 삽입
		int dish = apple--; //apple의 변수에 후위 연산자로 감소 연산자 삽입
		
		System.out.println("전위 연산 값 : "+nife); //전위 연산이므로 apple의 값이 1 증가한 뒤 적용
		System.out.println("후위 연산 값 : "+dish); //후위 연산이므로 apple의 값이 1 증가하기 전의 상태로 적용
		
		int my = apple-- + 10 + ++apple;
		System.out.println(my);
		/*
		 위의 경우 뒤에 있는 ++apple이 전위 연산자이므로 우선 계산, 해당 계산식에서 apple의 값은 1 증가한 6의 상태가 된다.
		 이후 +를 적용해 6과 10이 더해지고, 앞에 위치한 apple--의 값은 후위 감소 연산 되므로 1증가하기 전의 5로 변환.
		 16과 4를 더해 20이 된다.
		 
		
		 */
		
		//3. 비교연산자
		
		System.out.println(apple<dish); //true

		System.out.println(apple>nife); //false

		System.out.println(apple<=dish); //true

		System.out.println(apple>=nife); //false

		System.out.println(apple==dish); //false

		System.out.println(apple!=nife); //true
		
		
		//4.비트연산자
		
		//int bitSame = 34; // 2진법 상 0010 0010
		//int bitNumber = 10; // 2진법 상 0000 1010
		
		//int and = bitSame & bitNumber; // 0000 0010으로 변경
		//int or = bitSame | bitNumber; // 0010 1010으로 변경
		//int xor = bitSame ^ bitNumber; // 0010 0000으로 변경
		
		//5. 시프트연산자
		int bitNum1 =5; //0000 0101
		//int bitNum2 =3; //0000 0011
		
		int leftShift =bitNum1<<2;

		//0000 0101 > 0001 0100

		System.out.println("왼쪽 시프트 연산 결과 : "+leftShift); //20



		int rightShift =leftShift>>1;

		//0000 1010 > 0001 0100

		System.out.println("오른쪽 시프트 연상 결과 : "+rightShift); //10
		
		//대입연산자
		
		int coffeCaffeine = 100; //첫번째 변수
		int drinkCaffeine = 150; //두번째 변수
		int potion = coffeCaffeine+=drinkCaffeine; //축약선언
		System.out.println("카페인 량 : "+potion);
		
		//삼항연산자
		
		
		int electric = 10;
		int discharge = 5;
		String light = (electric-discharge>0)?"on":"off";
		System.out.println("전원 : "+light); //전원 : on
		
		
		
		
	}
	
	
}
