package ArrayPractice;

public class PalindromeInArray {
public static void main(String[] args) {
	int arr[]= {101,343,455,678};
	
	for(int i=0;i<arr.length;i++) {
	int original= arr[i];
	int rev=0;
	
	while(original!=0){
		int rem = original %10;
		rev= rev*10+rem;
		original = original /10;
		
	}
	if(original==rev){
		System.out.println(arr[i] + " is Palindrome");
	}else{
		System.out.println(arr[i]+ " is not palindrome");
	}
	}
}
}
