package ControlStament;

public class IterationStatement {
	
	public static void main(String[] agrs) {
		
		
		
		//루프명령 while, do while, for
		
		/*
		int i = 0;
		
		while(i<5){//조건식이 true일 때 반복 실행. 명령이 한줄이면 {} 생략가능
			System.out.println("while문이"+ (i+1)+"번째 바복 실행중입니다.");
			i++;//i++을 제거하면 변수값이 항상 1이기 때문에 무한루프에 들어간다
			//조건식의 결과를 변경하는 명령문을 삽입한다.
			//조건식의 결과가 어느순간 false로 나가 종료되도록 유도한다.
		}
		System.out.println("while문이 종료된 후 변수 i의 값은 "+i+"입니다.");
		*/
		
		int i = 1, j =1;
		
		while(i<1){
			System.out.println("while문이 "+i+"번째 반복 실행중입니다.");
			i++;
		}
		System.out.println("while문이 종료된 후의 변수 i의 값은 "+i+"입니다.");
		
		
		do { //먼저 루프를 실행하고 조건식을 검사한다.
			System.out.println("while문이 "+i+"번째 반복 실행중입니다.");
			j++;
		
		}while(j<1);
		System.out.println("do/whlie문이 종료된 이후 변수 j의 값은 "+j+"입니다.");
		
		
		for(i=0;i<5;i++) { //초기식; 조건식; 증감식; 자바에서는 for문 안에서만 변수를 초기식에서 직접 선언가능하다. 이후 종료시 소멸
			System.out.println("for문이 "+(i+1)+"번째 반복 실행중입니다");
		}
		System.out.println("for문이 종료된 후 변수 i의 값은 "+i+"입니다.");
		
		
		
		//루프의 제어 continue, break
		
		for(int c =1; c<100; c++) {
			if(c%5 == 0 || c%7 == 0) {
				System.out.println(c);
			}else {
				continue;
			}
		}
		
		int num = 1, sum =0;
		
		while(true) {
			sum += num;
			if(num == 100) {
				break;//만약 num이 100에 도달하면 빠져 나와라.
			}
			
			num++;//num은 계속 1씩 증가하는데 sum은 num을 더한 값을 지니므로 무한 상승한다.
		}
		System.out.println(sum);
		
		allLope :
			for(int c=2; c<10; c++) {
				for(int a =2; a<10; a++) {
					if(c==5) {
						break allLope;
					}
					System.out.println(c+"*"+a+"="+(c*a));
		
					
				}
				
				int l;
				
				int number = 3;
				
				for(int k =1; k<=9; k++) {
					l = number*k;	
					System.out.println(number+"*"+k+"="+l);
				}
			}
		
		
		
		
	}

}
