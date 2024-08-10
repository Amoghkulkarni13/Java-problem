package day1;

import java.util.Scanner;

public class swap_no_withvarible {
	
	public static void main(String[] args) {
		
		int a;
		int temp;
		int b;
	
		
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	
	System.out.println("enter the value for a " + a);
	System.out.println("enter the value for b " + b);
	
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("After swapping two number");
	System.out.println( "two number after swapping "+ a);
	System.out.println( "two number after swapping "+ b);
	}

}
