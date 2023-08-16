package RefurenceType;

import java.util.Scanner;

public class Puzzel 
{
	public class PuzzelCalss 
	{
		public static void main(String[] agrs) 
		{
	        int[] number=new int[25];
			int inputNum=0;
			//고전 셔플용 변수 
			//int dest,sour,temp;
			//int k=0;
			//int save=24; 0의 위치
			//int move; 0의 움직임
			
			// for (int i=0; i<number.length; i++)
			//{
			//    number[save-1]=i;
			//} 나머지는 ,for문을 사용한 렌덤함수 세팅과 셔플.
			
			Scanner scanner = new Scanner(System.in);
			
			for(int i=0; i<24; i++) 
			{
				number[i]=i+1;
			}
			//셔플
			for(int i=0; i<number.length; i++) 
			{
				int k=(int)(Math.random()*24);
				
				int temp=number[i];
				number[i]=number[k];
				number[k]=temp;
			}
			
			while(true) 
			{
				System.out.println("퍼즐판 : 위(8), 아래(2), 왼쪽(4), 오른쪽(6)");
				for(int i=0; i<number.length; i++)
				{
					System.out.print(number[i]+"\t");
					if((i+1)%5==0) 
					{
						System.out.printf("\n\n"); 
					}
				}
				
				for (int i=0; i<number.length; i++)
				{
					if(number[i]==0)
					{
						inputNum=scanner.nextInt();
						switch(inputNum) 
						{
							case 2:
								//if(save>19){break;}
								//move=number[save];
								//number[save+5]=move;
								//save+=5;
								if(i>19)
								{
									i-=5;
									int temp1=number[i];
									number[i]=number[i+5];
									number[i+5]=temp1;
								}
								int temp1=number[i];
								number[i]=number[i+5];
								number[i+5]=temp1;
								break;
								
							case 4:
								//if(save%5==0){break;}
								//move=number[save];
								//number[save-1]=move;
								//save--;
								if(i%5==0) 
								{
									i+=1;
									int temp2=number[i];
									number[i]=number[i-1];
									number[i-1]=temp2;
								}
								int temp2=number[i];
								number[i]=number[i-1];
								number[i-1]=temp2;
								break;
								
							case 6:
								//if((save+1)%5==0){break;}
								//move=number[save];
								//number[save+1]=move;
								//save++;
								if((i+1)%5==0) 
								{
									i-=1;
									int temp3=number[i];
									number[i]=number[i+1];
									number[i+1]=temp3;
								}
								int temp3=number[i];
								number[i]=number[i+1];
								number[i+1]=temp3;
							    break;
							    
							case 8:
								//if(save<5){break;}
								//move=number[save];
								//number[save-5]=move;
								//save-=5;
								if(i<4) 
								{
									i+=5;
									int temp4=number[i];
									number[i]=number[i-5];
									number[i-5]=temp4;
								}
								int temp4=number[i];
								number[i]=number[i-5];
								number[i-5]=temp4;
								break;
						}
						break;
					}
				}
				scanner.close();
			}//while 종료
			
			
			////////////////////
			//만들어진 빙고판에 숫자를 입력하는 것으로 숫자를 움직인다.(빙고판과 별개로 만들기)
			//셔플을 사용해 인덱스값을 바꿔 움직이는 것 처럼 보이게 한다.(인덱스가 얼마나 변하냐에 따라 어느정도 변하는지 확인)
			
		}
	}
}
