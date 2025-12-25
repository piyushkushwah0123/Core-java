// Q:- Display Second Smallest Element in the Array .

package ArrayQustion;

public class Ques32 {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 2, 5, 6, 4 };

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int Min2 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < Min2 && arr[i] != min) {
				Min2 = arr[i];
			}
		}

		System.out.println("Second biggest element: " + Min2);
	}
}
