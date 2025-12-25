package LogicalQuestion;

public class NEW {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr.length- 1; i++) {
			if (arr[i] != arr[i + 1]) {
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println(arr[arr.length-1]);
	}
}