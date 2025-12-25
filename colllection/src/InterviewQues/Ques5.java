// Ques 5 - Move all zeros to end without using extra list.

package InterviewQues;

import java.util.ArrayList;

public class Ques5 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(0);
		al.add(3);
		al.add(0);
		al.add(5);

		int index = 0;

		
		for (int i = 0; i < al.size(); i++) {
		    if (al.get(i) != 0) {
		        al.set(index, al.get(i));
		        index++;
		    }
		}

		while (index < al.size()) {
		    al.set(index, 0);
		    index++;
		}

		System.out.println(al);

	}

}
