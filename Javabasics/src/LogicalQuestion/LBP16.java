// Ques.16 :-Program to find number of occurrence of the given digits in the given number n.

package LogicalQuestion;
import java.util.Scanner;
public class LBP16 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter key digit");
		int key=sc.nextInt();
		int count=0;
		
		while(n>0) {
			if(n%10==key) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);	
	}
}
