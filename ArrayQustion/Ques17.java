// Q:- Display sum of even numbers in the given array.

package ArrayQustion;

public class Ques17 {

	public static void main(String[] args) {
		
		int sum=0;
		int[] arr = { 3, 7, 8, 2, 5, 6, 4 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
