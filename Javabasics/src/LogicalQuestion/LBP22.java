// Ques.22 :- Remove Duplicate Characters from a String in Java.

package LogicalQuestion;
import java.util.Scanner;
public class LBP22 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		
		String rs="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(rs.indexOf(ch)<0){
				
				rs=rs+ch;
			}
		}
		System.out.println(rs);
	}
}
