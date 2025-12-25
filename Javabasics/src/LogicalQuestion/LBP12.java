// Ques.12   :-Implement a program to calculate sum of digits that are divisible by 3 in the given nnumber.

package LogicalQuestion;

import java.util.Scanner;

public class LBP12 {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int d=n%10;
			if(d%3==0) {
				sum=sum+d;
			}
			n=n/10;
		}
		System.out.println(sum);
	}
}

