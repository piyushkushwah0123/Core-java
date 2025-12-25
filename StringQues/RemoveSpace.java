package StringQues;

public class RemoveSpace {

	public static void main(String[] args) {

		// remove spaces without using inbuilt methods

		String str = "Piyush Kushwah Java";
		String emptyString = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				emptyString = emptyString + ch;

			}
		}
		System.out.println(emptyString);
	}

}
