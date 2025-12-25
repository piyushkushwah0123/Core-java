package LogicalQuestions;

import java.util.Scanner;

public class Q09 {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int factor=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factor++;
			}	
		}
		if(factor==2) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
