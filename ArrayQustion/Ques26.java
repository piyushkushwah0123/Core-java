// Q:- Display smallest element in the array.

package ArrayQustion;

public class Ques26 {

	public static void main(String[] args) {

		int arr[] = { 3, 7, 8, 2, 5, 6, 4 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
