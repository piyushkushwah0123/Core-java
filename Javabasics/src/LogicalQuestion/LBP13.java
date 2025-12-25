// Ques.13   :- Write a Java Program to calculate number of digits in a given number.

package LogicalQuestion;

import java.util.Scanner;

public class LBP13 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}




