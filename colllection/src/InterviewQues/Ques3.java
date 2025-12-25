// Ques 3 - Find second highest and second lowest without using sorting.
// Condition:- No Collection.sort()allowed.

package InterviewQues;

import java.util.ArrayList;

public class Ques3 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(20);
		al.add(50);
		al.add(30);

		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;

		for (int n : al) {
			if (n > highest)
				highest = n;
			if (n < lowest)
				lowest = n;
		}

		int secondHighest = Integer.MIN_VALUE;
		int secondLowest = Integer.MAX_VALUE;

		for (int n : al) {

			if (n != highest && n > secondHighest) {
				secondHighest = n;
			}

			if (n != lowest && n < secondLowest) {
				secondLowest = n;
			}
		}

		System.out.println("Second Highest = " + secondHighest);
		System.out.println("Second Lowest = " + secondLowest);
	}
}
