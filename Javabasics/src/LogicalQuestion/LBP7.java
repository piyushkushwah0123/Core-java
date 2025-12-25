// Ques.7:- Write a Java Program to extract digits from the Given Number. 

package LogicalQuestion;

import java.util.Scanner;

public class LBP7{
	
	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0) {
			int d=n%10;
			n=n/10;
			System.out.print(d+" ");
		}	
	}
}