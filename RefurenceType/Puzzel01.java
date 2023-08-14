package RefurenceType;

import java.util.Scanner;

public class Puzzel01 {
	
	public static void main(String[] agrs) 
	{
		int[][] number = new int[5][5];
		int input=0;

		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<number.length; i++)
		{
			for(int j=0; j<number[i].length; j++)
			{
				number[i][j]=j;
				//System.out.print(number[i][j]);
			}
		}
		while(true)
		{
			for(int i=0; i<number.length; i++)
			{
				for(int j=0; j<number[i].length; j++)
				{
					System.out.print(number[i][j]+"\t");
				}
				System.out.print("\n\n");
			}
		}
		for(int i=0; i<number.length; i++)
		{
			for(int j=0; j<number[i].length; j++)
			{
				if(input==2)
				{
				number[i][j]=number[i+1][j];
				}
			}
		}
	
		
		
		
		
		
		
		
	}
}
