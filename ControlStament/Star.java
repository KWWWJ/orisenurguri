package ControlStament;

import java.util.Scanner;

public class Star {
	
	public static void main(String[] agrs) {
		
		
		//별찍기 우선 1번 ->2번 ->3번 순
		
		
		

		
		
		int seat=5;
		
		
		for (int i=1; i<=seat; i++) {   //1번 별
			for (int j=5; j>=i; j--) {
				System.out.print( " *");
			}
			System.out.println();
		}
		
		for (int i=1; i<=seat; i++) { //2번 별
			for (int j=1; j<=(-i+5); j++) {
				System.out.print( "  ");
				}
			for (int k=1; k<=i;k++) {
				System.out.print( " *");
			}
			System.out.println();
		
		}
		
		for (int i=1; i<=seat; i++) { //3번 별
			for (int j=2; j<=i; j++) {
				System.out.print( "  ");
				}  
		    for (int k=5; k>=i; k--) {
		    	System.out.print( " *");
		    }
		System.out.println();
	}
		
		for (int i=1; i<=seat; i++) {
			for (int j=1; j<=(-i+6); j++) {
				System.out.print( " ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print( " *");
			}
			System.out.println();
		}
		
		for (int i=1; i<=seat; i++) {
			for (int j=1; j<=i+1; j++) {
				System.out.print( " ");
			}
			for (int k=1; k<=(-i+5); k++) {
				System.out.print( " *");
			}
			System.out.println();
		}
		
		
		
		
		
		
}
}
