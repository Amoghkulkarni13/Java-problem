package day1;

import java.util.Arrays;

public class Bubble_Sort {
	
	
	public static void main(String[] args) {
		
		int[] arr= {67,32,89,12,1};
		
		Bubble_Sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static void Bubble_Sort(int arr[]){
		
		int flag=1;
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1-i;j++) {
				
				
				if(arr[j]> arr[j+1]) {
					
					
					int temp=arr[j];
					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			
			if(flag==0) {
				
				break;
			}
		}
		
		

}
}
