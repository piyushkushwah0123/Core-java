// Q:- Swap first and second elements in the array then print elements using for-each loop.

package ArrayQustion;

import java.util.Scanner;

public class Ques22 {
	public static void main(String[] args) {
		System.out.println("Enter the size");
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
	int arr[] = new int[n];
	
	System.out.println("enter"+ n +"Elements");
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int temp=arr[0];
	arr[0]=arr[1];
	arr[1]=temp;
	
	System.out.println("after swap");
	for(int num:arr) {
		System.out.println(num);
	}
	}

}
