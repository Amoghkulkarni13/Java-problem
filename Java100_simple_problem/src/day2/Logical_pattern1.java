package day2;

public class Logical_pattern1 {
	
	
//	*               
//	* *              
//	* * *
//	* * * *
	static void  pattern() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
	System.out.println();
		}
	}
	
	
	//2 problem
//	* *  * *
//	* *  *
//	* *
//	*

	
	  static void pattern1() {
		  
		  for(int i=1;i<=4;i++) {
			  for(int j=4;j>=i;j--) {
				  System.out.print("*");
			  }
			  System.out.println("");
		  }
	  }
	  
	  static void pattern3() {
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
		System.out.println();
			}
			 for(int i=1;i<=4;i++) {
				  for(int j=3;j>=i;j--) {
					  System.out.print("*");
				  }
				  System.out.println("");
			  }
		  
		  
	  }
	public static void main(String[] args) {
		

		
		//pattern(4);
		
		//pattern1();
		
		pattern3();
		
	}
		


}
