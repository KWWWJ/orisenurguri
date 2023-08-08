package ControlStament;

import java.util.Scanner;

public class ScannerAuto {
	
	public static void main(String[] ages) {
		
		while(true) {
			Scanner hand = new Scanner(System.in);
			
			//
			//int random = (int)(Math.random)()*3+1; 랜덤 함수
			
		
			System.out.println("가위바위보!");
			
			int start = 0;
			start = hand.nextInt();
			int redy = (int)(Math.random()*3)+1;
			
			String gameResult = " ";
			
			if (start==1) {
				if(redy==2) {
					gameResult ="lose";
				}
				else if(redy==3) {
					gameResult ="win";
				}
				else {
					gameResult ="draw";
				}
			}
			if(start==2) {
				if(redy==3) {			
					gameResult ="lose";
				}
				else if(redy==2) {
					gameResult ="draw";			
					}
				else {
					gameResult ="win";
				}
			}
			if(start==3) {
				if(redy==2) {
					gameResult ="win";
				}
				else if(redy==1) {
					gameResult ="lose";
				}
				else {
					gameResult ="draw";
				}
				
			}
			
			System.out.println("you "+ gameResult);
	
			
			
			
			switch(redy/start) {
			case 1:
				System.out.println("you draw");
				break;
			case 2:
				System.out.println("you lose");
				break;
			case 3:
				System.out.println("you win");
				break;
				}	
			switch(redy-start) {
			    case -1:
				    System.out.println("you win");
				    break;
			    case -2:
			    	System.out.println("you lose");
			    	break;
			}
			hand = new Scanner(System.in);
			continue;
		
			
		}
	
	}
	}
	
