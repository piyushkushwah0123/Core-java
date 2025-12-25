// Ques.14   :- Write a Java Program to reverse the given number.

package LogicalQuestion;

import java.util.Scanner;

public class LBP14 {
	
	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;		
		}
		System.out.print(rev);
	}

}

