package day1;

import java.util.Scanner;

public class voteabove18 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		boolean b= vote(num);
		System.out.println(b);
	}
	
	static boolean vote(int n) {
		
		return (n>=18);
		
	}

}
