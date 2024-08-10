package day1;

import java.util.Scanner;

public class Far_to_celusis {
	public static void main(String[] args) {
		
		float temp;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp value");
	
		temp=sc.nextFloat();
		float cel= ((temp-32))*5/9;
		
		float far=((temp*9/5)+32);
		
		
		
		System.out.println("the far to celsius value is "+ cel);
		
		System.out.println("the cel to far value is "+ far);
		
		
	}

}
