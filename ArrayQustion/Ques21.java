// Q:- Find the some of odd elements in the given array using for-each loop.

package ArrayQustion;

public class Ques21 {
	
	public static void main(String[] args) {
		
		int sum=0;
		int[] arr = { 3, 7, 8, 2, 5, 6, 4 };
		for(int i:arr) {
			if(i%2!=0) {
				sum=sum+i;
			}	
		}	
		System.out.println(sum);
	}

}
