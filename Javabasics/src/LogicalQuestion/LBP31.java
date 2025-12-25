// Ques.31 :- Java Program to Check Armstrong Number

package LogicalQuestion;
import java.util.Scanner;
public class LBP31 {
		public static void main(String[] args) {
			System.out.println("Enter the number ");
			Scanner sc=new Scanner(System.in);
			int num = sc.nextInt();
			
			int OrignalNumber=num;
			int sum=0;
			while(num>0) {
				int digits=num%10;
				sum=sum+(digits*digits*digits);
				num=num/10;
			}
			if(sum==OrignalNumber) {
				System.out.println(sum+" is an Armstrong number ");
			}
			else {
				System.out.println("It is not Armstrong number ");
			}
	}

}
