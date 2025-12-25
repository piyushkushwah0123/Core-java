// Q:- Display largest element in the array

package ArrayQustion;

public class Ques25 {
	
	public static void main(String[] args) {
		
		int arr[] = { 3, 7, 8, 2, 5, 6, 4 };
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
