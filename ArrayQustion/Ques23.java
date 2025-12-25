// Q:- Swap elements in specified location of array.

package ArrayQustion;

public class Ques23 {
	
	public static void main(String[] args) {
		
		int[] arr = { 3, 7, 8, 2, 5, 6, 4 };
		int x=0,y=3;
		
		int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        
        for (int n : arr) {
            System.out.print(n + " ");
        }
		
	}

}
