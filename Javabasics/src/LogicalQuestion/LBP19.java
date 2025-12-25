// Ques.19:- GCD Program in Java | Find Greatest Common Divisor (HCF) using For Loop

package LogicalQuestion;
import java.util.Scanner;
public class LBP19 {

	public static void main(String[] args) {
		
		int n1,n2,n3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers....");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(int i=1;i<=n1 && i<=n2 ;i++) {
			if(n1%i==0 && n2%i==0) {
				n3=i;			
			}	
		}
		System.out.println(n3);
	}
}

