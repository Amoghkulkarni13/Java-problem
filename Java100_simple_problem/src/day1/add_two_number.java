/*
 * package day1;
 * 
 * import java.util.Scanner;
 * 
 * public class add_two_number { public static void main(String[] args) {
 * 
 * int x; int y;
 * 
 * Scanner sc=new Scanner(System.in); x=sc.nextInt(); y=sc.nextInt(); int z;
 * z=x+y;
 * 
 * System.out.println(z); }
 * 
 * }
 */
package day1;

import java.util.Scanner;

public class add_two_number{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char ch=  sc.next().trim().charAt(1);
				
				if(ch>='a' && ch<='z') {
					
					System.out.println("LowerCase");
				}
				else {
					System.out.println("Uppercase");
				}
	}
}
