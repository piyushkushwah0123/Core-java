// Ques.30 :- Java Program to Move All Zeros to the Start of an Array and Maintain the Order of Non-Zero

package LogicalQuestion;
public class LBP30 {
	
	public static void moveZeros(int numbers[]) {
		int lastindex=numbers.length-1;
		for(int i=numbers.length-1;i>=0;i--) {
			if(numbers[i]!=0) {
				numbers[lastindex]=numbers[i];
				lastindex--;
			}
		}
		for(int i=0;i<=lastindex;i++) {
			numbers[i]=0;
		}
	}
	
	public static void main(String[] args) {
		
		int numbers[] = {1,0,3,0,6,7};
		moveZeros(numbers);
		
		for(int num:numbers) {
			System.out.print(num+ "  ");
		}
	}

}
