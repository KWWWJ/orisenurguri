package Assignment;

import java.util.Scanner;

public class AssignmentClass {
	
	public static void main(String[] agrs) {
		
		
		//숫자야구 풀이
		
		int[] number = new int[10];
		int[] comNumber= new int[3];
		int[] myNumber = new int[3];
		
		int ball;
		int strike;
		int match=0;
		
		//숫자 초기화
		for (int i=0; i< number.length; i++) {
			number[i]=i;
		}
		//셔플
		for (int i =0; i<number.length; i++) {
			int k=(int)(Math.random()*10); // Random random=new Random();을 사용할 수 있다.
			//비교적 단순한 난수 발생에 사용     // random.nextInt(100); 옵션이 더 많아 난수를 제어하기 편하다.
			int temp=number[i]; 
			number[i]=number[k]; //k에서 발생한 난수를 i에 대입
			number[k]=temp;
		}
		
		//초기화하고 섞었으니 그 수를 컴퓨터한테 넘겨줌
		for (int i=0; i<comNumber.length; i++) {
			comNumber[i]=number[i];
		}
		//확인할때는 같은 for문에 System.print(comNumber[i]+" ");로 가능
		
		Scanner input=new Scanner(System.in);
	    while(true) {
		   System.out.println("0~9까지의 숫자를 입력해라");
		   
		   for (int i =0; i<myNumber.length; i++) {
			   myNumber[i]=input.nextInt();
			   
		   }
		   
		   ball=0;
		   strike=0;
		   
		   //비교
		   
		   for (int i=0; i<comNumber.length; i++) {
			   for (int j=0; j<myNumber.length; j++) {
				   if (comNumber[i]==myNumber[j]) {
					   if(i==j) { //인덱스
						   strike++;
					   }
					   else {
						   ball++;
					   }
				   }
			   }
		   }//end of for
		   
		   System.out.println(ball+"볼"+strike+"스트라이크");
		   if (strike==3||match==10) {
			   System.out.println("끝");
			   break;
			 
		   }
		   match++;
		   System.out.println(match+"번째 판");
		  
	    }//end of while
	    
	    //주 행복으루위한 로또번호 생성기 만들기.
	    //렌덤하게 배열에 데이터를 저장, 6개 추출.
	    
	    int[] allLotto=new int[45];
	    int[] lotto=new int[6];
	    
	    for (int i=0; i<allLotto.length; i++) {
	    	allLotto[i]=i;
	    }
	    
	    
	    for (int i=0; i<allLotto.length; i++) {
	    	int r=(int)(Math.random()*45);
	    	int temp=allLotto[i];
	    	allLotto[i]=allLotto[r];
	    	allLotto[r]=temp;
	    }
	    
	    System.out.println("금주의 로또번호는 차례대로 ");
	    for (int i=0; i<lotto.length; i++) {
	    	lotto[i]=allLotto[i];
	    	if(lotto[i]==0) {
	    		lotto[i]+=1;
	    	}
	    	 System.out.println(lotto[i]+"번");
	    }
	    System.out.println("입니다.");
	   
		
	}

}
