// Ques.6:- Implement a program that takes n cups bought and print the total number of cups.

package LogicalQuestion;

import java.util.Scanner;

public class LBP6 {
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of cups I have: ");
		
		n = sc.nextInt();

		int total = n + (n / 6);

		System.out.println("Total Number of cups I have: " + total);

	}
}
