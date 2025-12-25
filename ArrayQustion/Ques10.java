// Q:- Display sum of 2 middle elements in the given even array of elements.

package ArrayQustion;

public class Ques10 {
	    public static void main(String[] args) {
	        int[] arr = {3, 7, 8, 2, 5, 6, 4, 1};

	        int mid1 = arr.length / 2 - 1; 
	        int mid2 = arr.length / 2;    
	        int sum = arr[mid1] + arr[mid2];

	        System.out.println(arr[mid1] + " and " + arr[mid2]+"----->"+sum);
	    }
}
