// Q:- Display array elements in reverse order.

package ArrayQustion;
import java.util.Scanner;
public class Ques13 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter" + n + "elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int low=0;
		int high=arr.length-1;
		
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;	
		}
		System.out.println("reverse array");
		for(int i=0;i<n;i++) {		
			System.out.println(arr[i]);	
		}
	}
}
