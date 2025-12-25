// Ques 6 - Rotate ArrayList by k position.

package InterviewQues;

import java.util.*;

public class Ques6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		System.out.print("Enter k: ");
		int k = sc.nextInt();

		int n = al.size();

		reverse(al, 0, n - 1);

		reverse(al, 0, k - 1);

		reverse(al, k, n - 1);

		System.out.println("Rotated List: " + al);
	}

	public static void reverse(ArrayList<Integer> al, int start, int end) {
		while (start < end) {
			int temp = al.get(start);
			al.set(start,al.get(end));
			al.set(end, temp);
			start++;
			end--;
		}
	}
}
