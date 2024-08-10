package day1;

import java.util.Scanner;

public class input_using_Scanner {
	
	public static void main(String args[]) {
		
	
	int i;
	String s;
	float f;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string value");
	
	s=sc.nextLine();
	
	System.out.println("the string value is "+ s);
	
	
	System.out.println("Enter the integer value");
	
	i=sc.nextInt();
	
    System.out.println("the integer value is" + i );
    
    System.out.println("enter the float value");
    f=sc.nextFloat();
    
    System.out.println("the float value is"+ f);
	
	
}
}
