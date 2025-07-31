package ArrayPractice;

import java.util.Arrays;

public class SecondLastNumber {
	//Sort the array and print the second last number.
	public static void main(String[] args) {
		//define array
		int arr[]= {2,4,6,8,7};
		//sort method
		Arrays.sort(arr);
		System.out.println("Sorted Array" +Arrays.toString(arr));
//		int length = arr.length;
//		int second_Last= arr[length-2];      Or
		int second_Last= arr[arr.length-2];
		System.out.println("Second Last no. in the Array is " +second_Last);
		
		
}
}
