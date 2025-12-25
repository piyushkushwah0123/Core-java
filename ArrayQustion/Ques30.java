// Q:- Swap First even and last odd Elements in the Array 

package ArrayQustion;

public class Ques30 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 2, 5, 6, 4};

        int i, j;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
            	break;
            }
        }
        for (j = arr.length - 1; j >= 0; j--) {
            if (arr[j] % 2 != 0) {
            	break;
            }
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

