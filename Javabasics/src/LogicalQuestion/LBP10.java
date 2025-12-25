//Ques.10   :- Write a Java Program to calculate sum of odd digits in a given number.

package LogicalQuestion;

import java.util.Scanner;

public class LBP10 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		while(n>0) {
			int d=n%10;
			if(d%2!=0) {
				sum=sum+d;	
			}
			n=n/10;
		}
		System.out.println("sum of odd digits in given number is:"+sum);	
	}

} 
