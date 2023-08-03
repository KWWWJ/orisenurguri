package mypakc;

import java.io.IOException;

public class New {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		
		byte[] input = new byte[256];
		
		try {
			System.in.read();
			System.in.read(input);
		
			System.out.println(new String(input));
		}catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
	}

}
}