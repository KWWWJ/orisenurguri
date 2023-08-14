package ControlStament;

import java.util.Scanner;

public class Testq {
	
	public static void main(String[] agre) {
		
Scanner scanner = new Scanner(System.in);

		
		int testResult = 0;
		testResult = scanner.nextInt();
		
		String outResult1 =" ";
	
	
		
		if(testResult>=90) {
			outResult1 ="A";
			}
		else if(testResult>97) {
				outResult1 ="A+";
			}
		else if(testResult<95) {
				outResult1 ="A-";
			}
			
		
		
		if(testResult<90) {
			outResult1 ="B";
		}
		else if(testResult>88) {
			outResult1 ="B+";
			
		}
		else if(testResult<85) {
			 outResult1 = "B-";
		 }
		 
		 
		if(testResult<=79){
			 outResult1 = "C";
	
		
		}
		System.out.println("학점 : "+outResult1);
		scanner.close();
		
}

	}


