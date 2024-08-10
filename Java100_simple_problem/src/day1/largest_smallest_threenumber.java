package day1;

import java.util.Scanner;

public class largest_smallest_threenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("finding out the largest and smallest of three number");
		
		Scanner sc=new Scanner(System.in);
		
	   System.out.println("Enter the first value:");
	   
	   int num1=sc.nextInt();
      System.out.println("Enter the second value:");
	   
	   int num2=sc.nextInt();
	   
     System.out.println("Enter the third value:");
	   
	   int num3=sc.nextInt();
	   
	   int largest= largest(num1,num2,num3);
	   int smallest =smallest(num1,num2,num3);
	   
	   System.out.println(largest);
	   System.out.println(smallest);
	   
	   
	   
	   
	   
		
		
	}
	
	static int largest(int a,int b,int c) {
		
		int max=a;
		if(b>max) {
			max=b;
			if(c>max) {
				
				max=c;
			}
		}
		return max;
	}
static int smallest(int a,int b,int c) {
		
		int min=a;
		if(b<min) {
			min=b;
			if(c<min) {
				
				min=c;
			}
		}
		return min;
	}

}
