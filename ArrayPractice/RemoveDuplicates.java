package ArrayPractice;

import java.util.Arrays;

public class RemoveDuplicates {
public static void main(String[] args) {
	int arr[]= {2,5,3,3,7,4};
	//sort the array firstly
//	Arrays.sort(arr);
	
//	Or if we want to remove duplicates in the original array do no sort it.
	
	//remove the duplicates
	System.out.println(arr[0]);
	
	for(int i=1;i<arr.length;i++) {
		if(arr[i]!=arr[i-1]) {
			System.out.println(arr[i]);
		}
	}
   
}
}
