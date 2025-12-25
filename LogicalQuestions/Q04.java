// Question 4:- Implement a program to accept a two digit number and check wheather it is a special two digits number or not. 

package LogicalQuestions;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n,a,b,c;
		n= sc.nextInt();
		
		
		a=n%10;
		b=(n/10)%10;
		c = (a+b)+(a*b);
		
		System.out.println((c==n)?"Special two digit Number" : " Not special two digits Number") ;
	}
}
