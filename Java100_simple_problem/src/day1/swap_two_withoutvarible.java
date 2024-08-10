package day1;

import java.util.Scanner;

public class swap_two_withoutvarible {
	
public static void main(String[] args) {
		
		int a;
		
		int b;
	
		
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	
	System.out.println("Before swapping two variable");
	System.out.println("value for  a is " + a);
	System.out.println("value for b is  " + b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After swapping two number");
	System.out.println( "two number after swapping "+ a);
	System.out.println( "two number after swapping "+ b);
	}

}


