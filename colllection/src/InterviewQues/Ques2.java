// Ques 2 - Remove dublicates without using set.

package InterviewQues;

import java.util.ArrayList;

public class Ques2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(40);
		
		System.out.println(al);
		
		 ArrayList<Integer> al1 = new ArrayList<>();
		
		 for (Integer num : al) {
	            if (!al1.contains(num)) {
	                al1.add(num);
	            }
	        }
		 
	        System.out.println(al1);
	    }
	}
