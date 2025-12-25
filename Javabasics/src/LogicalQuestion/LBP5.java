// Ques.5:- Implemennt a program that takes a number as an argument,increments the number by +1 and return the result.

package LogicalQuestion;

import java.util.Scanner;

public class LBP5 {
	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.println("incremented value is = " + (++n));
	}
}
