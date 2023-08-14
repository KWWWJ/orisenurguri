package mypakc;

public class Variable {

	public static void main(String[] args) {
		
		//변수? > 프로그래밍에서 가장 기본적인 동작은 
		//저장된 데이터 값을 읽는다. >
		
		//데이터를 저장하려면 메모리에 저장할 공간을 생성한다.
		//이후 이름을 부여한다.
		
		//사물함이 여러개 있을때 물건을 보관하고 번호를 매겼다면?
		//사물함이 메모리, 사물함의 번호가 변수라고 볼 수 있다.
		
		//단 하나의 값을 저장할 수 있는 메모리 공간이다.
		
		//데이터 타입, 자료형
		
		//컴파일 언어에는 별도의 데이터 타입이 존재.
		
		//1,2,3,4 -> 정수형
		//3.14...-> 실수형
		//a,b,한 -> 문자
		//안녕, 여긴 지옥 -> 문자열
		
		//정수형
		//데이터 타입, 변수
		
		//==========================
		//변수형 선언 방법
		//자료형 변수명; => int num;
		//데이터를 저장하기 위해 생성하는 메모리 공간은
		//목적에 따라 크기와 특징이 다른데, 이를 자료형(Data Type)이라 한다.
		//==========================
		
		//변수를 사용하기 전에 반드시 자료형을 선언.
		//빨간줄이 num에 그어지면 지역변수가 초기화 되지 않았기 때문. 변수 선언 전에 초기화 필요.
		//초기화 = 변수에 어떠한 데이터, 즉 초기값을 넣어주는 것.
		int num =10;
		System.out.println("정수형 타입의 변수 num에 저장된 값 : "+num);
		//a=1; 데이터 타입이 명시되지 않았으므로 에러.
		
		
	//변수 초기화 방법
	//초기화는 변수에 어떠한 값을 대입하는 것이 초기화다.
	
	//1.변수의 선언과 동시에 초기화.
	 
	
	//2.변수 선언 후 초기화
	int player; //선언하고
	player = 100; //초기화
	
	System.out.printf("변수 player에 저장된 값 : %d", player);
	
	//변수 이름을 지을 때 지켜야 할 것.
	/*
	 1.대소문자 구분하되 길이 제한은 없다.
	 ㄴint aSdwf;
	 
	 2.근본없는 한글변수 사용 금지. 
	 ㄴint 한글변수;
	 
	 3.특수문자는 언더바(_), $도 사용가능(그러나 사용은 자제할 것.)
	 int _abc
	 
	4.아라비아 숫자도 사용가능(가장 처음에는 불가능, 숫자를 붙일일도 거의 없다.)
	int a1;
	
	5.이미 정의되어있는 키워드는 사용 불가.
	int int;
	
	변수명을 지을때 반드시 지켜야 하는 것
	1.영문 소문자로 시작.
	2.풀네임으로 작성.
	int average;
	int name;
	
	3.영문 단어를 두개 이상 조합할 때는 새로운 단어의 첫을자를 대문자로 작성(카멜표기법. 낙타 등ㅊ럼 볼록 튀어나와서)
	int maxValue;
	
	4.변수의 이름은 중복될 수 없다. -> 재선언 불가능
	대신 f1 = 5.43456f; 처럼 변수를 재할당하는것은 가능하다.

	 */
	
	
	//===========================================
	//자료형의 종류
	//============================================
	
	/*(기본 자료형)
	 분류(기본형)              타입            크기(byte)
	 
	 
	 정수형                  byte               1
	                       short               2
	                        int                4
	                       long                8
	                       
	 실수형                  float              4
	                       double              8
	 
	 
	 논리형                 boolean             1
	 
	 
	 문자(정수)              char                2 
	 
	 기본 자료형과 참조 자료형은 저장 방식이 다르다.
	 용도가 다르다.
	 int가 가장 빨리 읽힌다.
	 byte는 이진 데이터 처리에 적합.(메모리 소모가 적다.) > 받는 쪽에서 데이터 보다 큰 크기를 가진다면 자신이 맞는 데이터로 변환해서 받기 떄문에
	 int가 효율적이고, 데이터의 크기가 더 크다면 long을 사용할 수 있다.
	 
	* */
	
	//참 혹은 거짓 판별
	boolean isCheck = false;
	byte flag = 1;
	int count = 10;
	short index = 2;
	long phoneNumber = 123456;
	float temperture = 1.0005f;
	double pi = 3.1415921234;
	char grade = 'a';
	
	System.out.println(isCheck);
	System.out.println(flag);
	System.out.println(count);
	System.out.println(index);
	System.out.println(phoneNumber);
	System.out.println(temperture);
	System.out.println(pi);
	System.out.println(grade);
	
	
	//실수형
	float f1 = 1.0000001f;
	System.out.println("f1에 저장된 값 : "+f1);
	float f2 = 1.00000012f;
	System.out.println("f2에 저장된 값 : "+f2);
	double d1 = 1.0000000000005;
	System.out.println("d1에 저장된 값 : "+d1);
	double d2 = 1.00000000000058;
	System.out.println("d1에 저장된 값 : "+d2);
	
	
	//float은 소숫점 7자리까지만 출력한다.
	//정수형과 다르게 같은 크기라도 그 범위를 설정할 수 있지만 정확도가 떨어질 수 있다
	
	
	
	
	//상수 -> 손대면 안될 값을 고정하여 안정, 실수를 보정한다.
	//변수처럼 값을 저장할 수 있지만, 한 번 저장하면 다른 값으로 변경이 불가능하다.
	//상수의 변수는 무조건 대문자.
	//final int MAXSPEED;
	//MAXSPEED = 10;  선언이후 초기화가 가능은 하나 선언과 초기화를 한번에 하는게 좋다.
	
	//final int MOVE = 10;
	
	//int triangleArea = (20*10)/2;
	//int reactangleArea = 20*10;
	
	//System.out.println(triangleArea);
	//System.out.println(reactangleArea);
	
	//final int WIDTH = 20;//폭
	//final int HIGHTH = 10;//높이
	//int triangleAera = (WIDTH*HIGHTH)/2;
	//int reactangleArea = WIDTH*HIGHTH;
	//상수는 다름값으로 계산할때도 여러곳을 수정할 필요없이 상수값만 변경해주면 된다.
	
	
	//자료형을 이용해서 본인의 전화번호, 나이, 키, 몸무게 등을 출력.
	
	int phone = 1066802488;
	int kg = 73;
	int age = 22;
	long high = 174;
	
	System.out.println("전화번호 : 0"+phone);
	System.out.println("나이 : "+age);
	System.out.println("키 : "+high);
	System.out.println("몸무게 : "+kg);
	
	//전화번호 같이 0으로 시작하는 경우 8진수로 해석하기 때문에 그 값자체를 의미하는 리터럴에 접미사를 붙이면
	//타입을 구분할 수 있다.
	
	//예를 들어 3.14는 double형태의 실수이지만 f를 붙이는 것ㅇ로 형태를 변환할 수 있다. float pi2 = 3.14f;
	//2진수, 8진수, 16진수로 변환하여 넣을 수 있다.
	//16진수는 0X 2 진수는 0b를 앞에 붙인다.
	//2진수 0000 0000 > 128 64 32 16 8 4 2 1   2진수의
	//n승으로 상승.
	
	//printf(""); 같이 개행이 안되는 문장은 \n으로 개행 가능하다. 일정 간격을 띄울때는 \t
	
	
	
	
	//참조자료형 String str = "안녕" > 스텍에 저장되지만 실제로는 주소만 저장.
	//str = 참조변수
	//메모리 영역 = 스텍Stack, 힙Heap
	//기본 자료형은 스텍에 데이터를 저장. 참조자료형은 어딘가에 저장이 되어있다. 실제 데이터는 힙에.
	//자바에서는 힙에 간섭할 수 없기 때문에 스텍에 힙에 저장이 되어있는 데이터의 주소를 저장한다.

	
	
	int data = 10;
	//10진수 >> 2진수
	System.out.println(Integer.toBinaryString(data));
	
	//10진수 >> 8진수
	System.out.println(Integer.toOctalString(data));
	
	//10진수 >> 16진수
	System.out.println(Integer.toHexString(data));
	
	//2진수 1010 >> 10진수
	System.out.println(Integer.parseInt("1010",2));

	
	//변수에도 라이프 사이클이 존재한다.
	
	
	/*
	 * {
	 		int t; //변수는 선언한 순간 발생.
		{
			t = 3; //지정은 다음문제다.
		}
	}// t=3;는 여기서 죽는다.
	//지역변수는 자신의 영역을 벗어나는 순간 죽는다.
	
	
	 */
		

	
	
	
	
	
	
	}
	
	
}
