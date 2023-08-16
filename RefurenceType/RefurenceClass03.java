package RefurenceType;

public class RefurenceClass03 
{
	public static void main(String[] agrs)
	{
		//String
		//
		//String 참조변수 = "어쩌구저쩌구..."; -문자열 값만 입력
		//String 참조변수 = new String("어쩌구저쩌구..."); -생성자 값을 입력
		//String클래스는 ()(생성자)에 의해 생성된다.
		/*
		String str1 = new String("안녕?");
		String str2="이녀석";
		System.out.println(str1);
		System.out.println(str2);
		//
		*/
		/*
		String str1 = new String("안녕?");
		String str2=str1; //str1의 주소를 str2의 주소에 덮어씌우기
		str1="안녕하세요"; //str1의 주소를 다른 참조변수값으로 저장
		System.out.println(str1);
		System.out.println(str2);
		*/
		String str1=new String("안녕");
		String str2="안녕";
		String str3="안녕"; //이미 앞에서 문자열 리터럴을 생성했디 떄문에 공유한다.(메모리 효율이 좋다.)
		String str4=new String("안녕"); //무조건 새로운 객체 생성
		
		System.out.println(str1==str2);
		System.out.println(str2==str3); //힙상 주소가 같은 곳을 가리키고 있다.
		System.out.println(str3==str4);
		System.out.println(str1==str4);
		//new로 생성하면 무조건 새롭게 객체를 생성
		//문자열 리터럴로 생성하면 힙 메모리에 리터럴로 생성된 동일한
		//문자열을 포함하고 있는 객체가 있으면 그 객체를 공유한다.
	}

}
