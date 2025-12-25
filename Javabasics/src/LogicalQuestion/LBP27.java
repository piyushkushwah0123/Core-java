// Ques.27 :- Write a program to that takes a number as its argument and returns an array of all its factors

package LogicalQuestion;
import java.util.Scanner;
public class LBP27 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}
