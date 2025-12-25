// Q:- Create new array with only odd numbers of given array.

package ArrayQustion;

public class Ques35 {
	
	
	public static void main(String[] args) {
        int arr1[] = {3, 7, 8, 2, 5, 6, 4};
        int arr2[] = new int[arr1.length];
     
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }


        System.out.println("Old Array");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("New Array");
        for (int num : arr2) {
        		if(num%2!=0) {
        			System.out.print(num + " ");
        		} 
        }
    }
}
