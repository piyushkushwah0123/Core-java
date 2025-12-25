// Ques.21:-Implement a program to find Square of each Element present in a matrix

package LogicalQuestion;
import java.util.Scanner;
public class LBP21 {

	public static void main(String[] args) {
		
		int arr[][]= new int[3][3];
		int i,j;
		Scanner sc= new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing........");
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j]*arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
