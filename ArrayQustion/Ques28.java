// Q:- Display last odd element in the array.

package ArrayQustion;

public class Ques28 {
		
		public static void main(String[] args) {
			
			int arr[] = { 3, 7, 8, 2, 5, 6, 4 };
			for(int i=arr.length-1;arr.length>0;i--){
				if(arr[i]%2!=0) {
					System.out.println(arr[i]);
					break;
				}	
			}
		}
}
