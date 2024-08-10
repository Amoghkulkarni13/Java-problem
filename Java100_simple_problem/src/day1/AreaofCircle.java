package day1;

import java.util.Scanner;


public class AreaofCircle {
         public static void main(String[] args) {
			
		
	
	
	Scanner sc=new Scanner(System.in);
	
	int raduis=sc.nextInt();
	
	 AreaofCIrecumference(raduis);
	
         }
	static void AreaofCIrecumference(int raduis) {
		
		double area;
		double circum;
		
		area= Math.PI *(raduis*raduis);
		
		circum = 2* Math.PI* raduis;
		
		System.out.println("area of circle and circumferecnce"+ area +" " +  circum);
		
	}
	
	

}
