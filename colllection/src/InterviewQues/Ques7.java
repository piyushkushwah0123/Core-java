// Ques 7 - Find the missing number in a list of 1 to N.

package InterviewQues;

import java.util.ArrayList;

public class Ques7 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);

		int n = 5;

		int expectedSum = n * (n + 1) / 2;

		int actualSum = 0;
		for (int num : list) {
			actualSum += num;
		}
		
		int missing = expectedSum - actualSum;

		System.out.println("Missing Number = " + missing);

	}
}
