package Object;

//다른 패키지의 클래스를 사용하고자 할때 포함.
//import ReferenceType.RefurenceClass01; //RefurenceTyp 패키지의 RefurenceClass01을 가져온 것.

//class Student//이름만 다르면 제약없이 생성 가능. 단, public가 붙은 클래스는 하나만 올 수 있다.(이름도 파일명과 같아야 함.)
//{
//	//public 클래스 밖에는 패키지, 외부 클래스, import 세 종류다.
//}
//클래스는 대문자로 시작한다.

class TV //TV를 만들기 위한 설계도.
{
	String color; //인스턴스 변수, String은 참조형
	boolean power; //false로 초기화
	int channel; //0으로 초기화
	
	void power() //void = 반환값이 없다. / 인스턴스 메서드
	{
		power =! power;
	}
	void Channelup()
	{
		channel++;
	}
	void ChannelDwon()
	{
		channel--;
	}
}

public class Class01 
{
//	class A
//	{
//		//클래스 안에 클래스 생성 가능(이너클래스)
//	}
//	int a=3; //인스턴스 변수(지역변수와는 달리 메서드에 포함되지 않음.)
//	static int num=5; //클래스 변수(static의 유무)
	
	//int sum(int a, int b)메서드
	
//	Class01()
//	{
//		//생성자. 생성자 또한 메서드로 취급하나 일반적인 메서드와는 달리 1회만 호출된다.(생성하지 않으면 컴파일러가 알아서 선언한다.)
//	}
//	Class01(int a, int b)
//	{
//		//생성자 오버로딩. 매개변수 추가로 생성은 되었으나 리턴타입을 가질 수 없다. 단지 초기화를 위한 작성.
//	}
//	class Test
//	{
//		
//	}
	
	public static void main(String[] args)
	{
		TV tv; //인스턴스를 참조하기 위한 참조형 변수 생성. /없으면 접근 불가.(static을 붙이면 가능)
		tv=new TV(); //tv인스턴스 생성 - 주소값이 tv에 저장
		//TV tv=new TV();로 생성과 동시에 선언가능
		tv.channel=11; //tv 인스턴스 변수인 channel의 값을 11로 한다.
		tv.ChannelDwon();//tv 인스턴스 메서드 ChannelDwon()을 호출
		System.out.println("내가 누른 채널 : "+tv.channel+"번.");
		
		TV tv1=new TV(); //위의 tv와는 다름. 각 인스턴스와는 설계도(클래스)는 같지만 인스턴스 자체의 주소가 달라져 서로 다르다. 
		tv1.channel=12;
		tv1.ChannelDwon();
		System.out.println("내가 누른 채널 : "+tv1.channel+"번.");
	}
	//과제
	//클래스
	//클래스란 무엇인가.
	//클래스의 구성요소
	//인스턴스 변수 및 인스턴스 메서드
	//학생이라는 클래스를 만들어서 이름String, 나이int, 학번, 키, 전화번호 있고
	//학생정보를 출력하는 메서드를 만들어서 출력하라.
}
