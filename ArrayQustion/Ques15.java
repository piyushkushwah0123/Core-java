// Q:- Display only even numbers in the  given array.

package ArrayQustion;

public class Ques15 {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 7, 8, 2, 5, 6, 4};
		
		for(int i=0;i<arr.length;i++) {
        	if(arr[i]%2==0) {
        		System.out.print(arr[i]+" ");
        	}
        }
		
	}

}
