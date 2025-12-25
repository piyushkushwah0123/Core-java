// Ques.4:-Sales range and group.

package LogicalQuestion;

import java.util.Scanner;

public class LBP4 {
	
    public static void main(String[] args) {
    	
    	int n;
    	System.out.print("Enter sales count : ");
        Scanner sc = new Scanner(System.in);
        
         n = sc.nextInt();

        if (n >= 30 && n <= 50) {
            System.out.println("D");
        } else if (n >= 51 && n <= 60) {
        	System.out.println("C");
        } else if (n >= 61 && n <= 80) {
        	System.out.println("B");
        }else if (n >= 81 && n <= 100) {
        	System.out.println("A");
        } else {
        	System.out.println("Invalid sales range");
        }
    }
}
