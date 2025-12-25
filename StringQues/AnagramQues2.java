package StringQues;
import java.util.Arrays;
public class AnagramQues2 {

		public static void main(String[] args) {
			String str1 = "keep";
			String str2 = "peek";

			char ar1[] = str1.toCharArray();
			char ar2[] = str2.toCharArray();

			Arrays.sort(ar1);
			Arrays.sort(ar2);

			if (Arrays.equals(ar1,ar2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}
}
