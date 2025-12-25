// Q:- Display first even number in the array.

package ArrayQustion;

public class Ques27 {
	
	public static void main(String[] args) {
		
		int arr[] = { 3, 7, 8, 2, 5, 6, 4 };
		for(int i=1;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				break;
			}	
		}
	}

}