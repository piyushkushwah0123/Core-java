// Ques 1 - Find first non-repeating element form ArrayList.

package InterviewQues;

import java.util.ArrayList;
import java.util.Collections;

public class Ques1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(30);

		for (Integer n : al) {
			if (Collections.frequency(al, n) == 1) {
				System.out.println("First non-repeating element:" + n);
				break;
			}
		}
	}
}
