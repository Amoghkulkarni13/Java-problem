package day1;

import java.util.Arrays;

public class Selection_Sort {
	
  public static void main(String[] args) {
	int [] arr= {45,65,12,1,3,4};
	
	Selection(arr);
	System.out.println(Arrays.toString(arr));
}
  
  
  static void Selection(int[] arr) {
	  int min;
	  for(int i=0;i<arr.length;i++) {
		  
		 min=i; 
		 int temp=0;
	  

		 
		 for(int j=i+1;j<arr.length;j++) {
		  
		  if(arr[j]<arr[min]) {
			  min=j;
			  
			  
		  }
	  }
	  temp=arr[i];
	 arr[i]=arr[min];
	 arr[min]=temp;
		  
		  
	  }
  }

}

