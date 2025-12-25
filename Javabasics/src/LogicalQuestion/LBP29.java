// Ques.29 :- Write a java program to find duplicate in Array.

package LogicalQuestion;

public class LBP29 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,2,6,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}	
			}
		}
	}
}
