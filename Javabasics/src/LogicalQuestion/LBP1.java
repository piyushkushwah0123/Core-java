// Ques.1:-Program to check whether the  given number is even or odd number.

package LogicalQuestion;

import java.util.Scanner;

public class LBP1 {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is even");

		} else {
			System.out.println("Invalid number");
		}
	}
}

