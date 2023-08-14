package mypakc;

public class varible01 {

	public static void main(String[] args) {
		
		//TypeCasting(형변환)
		//대입연산자 중심으로 왼쪽과 오른쪽 자료형을 일치해야 할 때가 있음.
		
		double num = 58.2;
		
		//(타입) 피연산자
		int score = (int)num; //원본 num은 그대로 더블타입이지만 형변환되어 int형식으로 나올 뿐이다.
		System.out.println(score);
		
		
		//float value = (int)5.3;
		//float value2 =(float)5.3;
		//float value3 = 5.3f; // 2, 3중에서는 보통 이쪽
		
		int charTypeCasting = 65;
		char intTypeCasting = 65;
		int intTofloat = 10;
		
		System.out.println(intTypeCasting); //대응되는 데이터타입을 가져온다.
		System.out.println((char)charTypeCasting); //65지만 캐릭터 타입으로 변환되어 A.
		System.out.println((float)intTofloat);
		
		//1.데이터 타입 / 데이터 타입별 특징(표현 가능한 범위나 크기 등)
		//2.자바 메모리 영역 > 발표
		
	}
	
}
