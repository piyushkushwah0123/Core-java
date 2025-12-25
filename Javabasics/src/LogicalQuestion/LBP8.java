// Ques.8   :- Write a Java Program to calculate sum of digits in a given number.

package LogicalQuestion;
import java.util.Scanner;
public class LBP8 {
	
	public static void main(String[] args) {
		
		System.out.println("enter n number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);	
	}

}

