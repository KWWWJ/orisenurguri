package ControlStament;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] agrs) {
		
		int[][] card=new int[4][13];
		int[][] match=new int[4][2];
		int[][] myCard=new int[4][2];
		//int count=0;
		
		
		for (int i=0; i<card.length; i++) 
		{
			for (int j =0; j<card[i].length; j++) 
			{
			card[i][j]=j;
			//System.out.println(card[i][j]);
			}
		}
		for (int i=0; i<card.length; i++) 
		{
			int k1=(int)(Math.random()*12)+1;
			int k2=(int)(Math.random()*12)+1;
			int k3=(int)(Math.random()*12)+1;
			int k4=(int)(Math.random()*12)+1;
			for(int j=0; j<card[i].length; j++) 
			{
			int temp1=card[0][j];
			card[0][j]=card[0][k1];
			card[0][k1]=temp1;
			int temp2=card[1][j];
			card[1][j]=card[1][k2];
			card[1][k2]=temp2;
			int temp3=card[2][j];
			card[2][j]=card[2][k3];
			card[2][k3]=temp3;
			int temp4=card[3][j];
			card[3][j]=card[3][k4];
			card[3][k4]=temp4;
			
			//count+=1;
			//System.out.println(card[i][j]);
			//System.out.println("===="+count+"======");
		    }
		    }
		for(int i=0; i<match.length; i++) 
		{
			for(int j=0; j<match[i].length; j++) 
			{
				match[i][j]=card[i][j];
				//System.out.println(match[i][j]);
		    }
		}
		for(int i=0; i<myCard.length; i++) 
		{
			for(int j=0; j<myCard[i].length; j++) 
			{
				myCard[i][j]=card[i][j];
				//System.out.println(myCard[i][j]);
		    }
		}
		
		}
		
		
		Scanner game = new Scanner(System.in);
		
		
		
		
		
		
		}


	

	
	
