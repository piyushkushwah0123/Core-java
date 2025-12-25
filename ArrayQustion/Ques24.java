// Q:- Swap array elements with its adjacent element for the specified location.

package ArrayQustion;

import java.util.Scanner;

public class Ques24 {
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the location");
			int loc=sc.nextInt();
			
			int[] arr = { 3, 7, 8, 2, 5, 6, 4 };
			
			int temp = arr[loc];
	        arr[loc] = arr[loc+1];
	        arr[loc+1] = temp;
	        
	        for (int n : arr) {
	            System.out.print(n + " ");
	        }
	}

}
