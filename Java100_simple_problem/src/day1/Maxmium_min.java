package day1;


public class Maxmium_min {

	
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,1,0};
		
	int ans=	max_min(arr);
	System.out.println(ans);
	}
	
	static int max_min(int arr[] ) {
		
int max=arr[0];
for(int i=1;i<arr.length;i++) {
	if(arr[i]>max) {
		
		max=arr[i];
	}
	
	
}
return  max;
		
	}
	
}
