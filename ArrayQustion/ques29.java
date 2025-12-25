// Q:- Swap Smallest and Largest Elements in the Array

package ArrayQustion;

public class ques29 {

	public static void main(String[] args) {
				int[] arr = { 3, 7, 8, 2, 5, 6, 4 };

				int min = 0;
				int max = 0;

				for (int i = 1; i < arr.length; i++) {
					if (arr[i] < arr[min]) {
						min = i;
					}
					if (arr[i] > arr[max]) {
						max = i;
					}
				}
				//this is to indicate old array just for better answer
				System.out.println("----------old array------------");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
					System.out.println();
					System.out.println();
					
				// swap
				int temp = arr[min];
				arr[min] = arr[max];
				arr[max] = temp;
				
				System.out.println("----------new array------------");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			}	
	}
