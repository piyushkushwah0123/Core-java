// Ques.3:- To check whether the given number is leap year or not.

package LogicalQuestion;

import java.util.Scanner;

public class LBP3 {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter year :");
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		
		if(n%4==0) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
