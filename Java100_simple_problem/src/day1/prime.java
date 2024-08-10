package day1;

public class prime {
	

	
	public static void main(String[] args) {
		
		
		isPrime(7);
		
		
	}
	
	static void isPrime(int n) {
		
		
		int c=2;
		while(c*c<=n) {
			
			if(n%c==0) {
				
				System.out.println("not prime");
				break;
			}
			c+=1;
		}
		
		if(c*c>n) {
		System.out.println("prime number");
		}
		
	}

}


