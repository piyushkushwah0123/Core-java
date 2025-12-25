// Ques 26 :- Implement a program to find sum of last three digits in the given number.

package LogicalQuestion;

import java.util.Scanner;

public class LBP26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int n=sc.nextInt();
		
		int a=n%10;
		int b=(n/10)%10;
		int c=(n/100)%10;
		System.out.println("sum of last three digits = " + (a+b+c));
	}
}
