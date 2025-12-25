// Ques.31 :-  Java Program to Find Second Largest Element in Array.

package LogicalQuestion;
public class LBP32 {
	public static void main(String[] args) {
		int arr[]= {12,45,1,99,23,76};
		
		int largest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				SecondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>SecondLargest && arr[i]!=largest) {
				SecondLargest=arr[i];
			}	
		}
		if(SecondLargest==Integer.MIN_VALUE) {
			System.out.println("not found Second Largest value");
		}
		else {
			System.out.println("Second Largest element is "+SecondLargest);
		}
	}
}
