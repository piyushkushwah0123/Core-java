// Ques.20:-Implement a Program to read a Matrix and display only diagonal Elements

package LogicalQuestion;
import java.util.Scanner;
public class LBP20 {
	public static void main(String[] args) {	
		int arr[][]= new int [3][3];
		Scanner sc= new Scanner (System.in);
		int i,j;
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				arr[i][j]=sc.nextInt();
			}
		}	
		System.out.println("Printing.......");
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++){
				if(i==j) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}	
			System.out.println();
		}		
	}
}
