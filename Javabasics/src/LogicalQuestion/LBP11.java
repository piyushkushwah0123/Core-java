// Ques 11   :- Write a Java Program to calculate sum of prime digits in a given number.

package LogicalQuestion;
import java.util.Scanner;
public class LBP11 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Number:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		
		while(n>0){
			int d= n%10;
			if(d==2 || d==3 || d==5 || d==7) {
				sum= sum+d;	
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
