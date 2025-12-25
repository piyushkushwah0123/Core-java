// Ques 4 - Find all pairs whose sum equal to its target 

package InterviewQues;

import java.util.ArrayList;

public class Ques4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(7);
		al.add(11);
		al.add(15);

		int target = 9;

		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {

				if (al.get(i) + al.get(j) == target) {
					System.out.println(al.get(i) + ", " + al.get(j));
				}

			}
		}

	}

}
