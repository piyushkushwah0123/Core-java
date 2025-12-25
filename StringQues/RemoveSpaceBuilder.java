package StringQues;

public class RemoveSpaceBuilder {
	public static void main(String[] args) {
		String str = "Piyush Kushwah Java";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}

}
