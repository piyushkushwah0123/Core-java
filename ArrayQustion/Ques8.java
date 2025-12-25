// Q:- Print multiplication table for last element in the array.

package ArrayQustion;

public class Ques8 {
	public static void main(String[] args) {
		
		
		int [] arr = {3,7,8,2,5,6,4};
		for(int i=1;i<10;i++) {
			
			System.out.println(arr[arr.length-1]+" * " + i + " = " + arr[arr.length-1]*i);
		}
	}

}
