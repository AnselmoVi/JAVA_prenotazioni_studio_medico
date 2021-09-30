package studio_medico;

import java.util.Scanner;

public class Input {
	
	public Input() {}
	
	public String getStringa() {
			
		Scanner obj= new Scanner(System.in);
		String string= obj.nextLine();
		return string;
		
	}
	public Float getFloat() { 
		Scanner obj = new Scanner(System.in);
		float number= obj.nextFloat();
		return number;
		
	}
	
	public int getInt() {
		Scanner obj= new Scanner(System.in);
		int number= obj.nextInt();
		return number;
		
	}
}
