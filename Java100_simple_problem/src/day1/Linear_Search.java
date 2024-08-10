package day1;



public class Linear_Search {
	
	public static void main(String[] args) {
		int [] arr= {2,3,5,6,7,4,1};
		int item=7;
	
		
		Linear_Search(arr,item);
		
		
		
		
	}
	
	static void Linear_Search(int [] arr, int item) {
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			
			if(item==arr[i]) {
				
				
				System.out.println(i);
				temp=temp+1;
			}
		}
		if(temp==0) {
		
		System.out.println("element not found");
	}
	}


}
