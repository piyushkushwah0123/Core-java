// Ques.17 :- Program to check Whether the given number is Pallindrome or not

package LogicalQuestion;
import java.util.Scanner;
public class LBP17 {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;	
			n=n/10;
		}
			if(temp==rev) {
				System.out.println("It is Pallindrome number");
			}
			else {
				System.out.println("Not Pallindrome");
			}
	}

}

