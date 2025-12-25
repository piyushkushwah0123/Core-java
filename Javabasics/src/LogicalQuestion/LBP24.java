// Ques.24:-  Rotate Array.

package LogicalQuestion;
public class LBP24 {
	public static void reverse(int arr[] , int start , int end) {
		
		while(start < end) {
			int temp =arr [start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		
		int nums []= {10,20,30,40,50,60,70};
		int k=3;
		
		k = k%nums.length;
		
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		
		for (int num : nums) {
			System.out.println(num);
		}
	}
}
