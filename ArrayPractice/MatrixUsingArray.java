package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixUsingArray {
public static void main(String[] args) {
	//converting matrix of array
	int arr[][]= new int[3][3];
	System.out.println("Enter the matrix number");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			Scanner sc= new Scanner(System.in);
			arr[i][j] =sc.nextInt();
		}
//		System.out.println("Matrix is "+ Arrays.deepToString(arr));

	}
	
	System.out.println("Matrix is "+ Arrays.deepToString(arr));

	
}
}
