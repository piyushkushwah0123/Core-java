// Q:-Display Second biggest Elements in the Array

package ArrayQustion;

public class Ques31 {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 2, 5, 6, 4 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int Max2 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Max2 && arr[i] != max) {
				Max2 = arr[i];
			}
		}

		System.out.println("Second biggest element: " + Max2);
	}
}

