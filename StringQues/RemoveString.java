package StringQues;

public class RemoveString {

	public static void main(String[] args) {
		String s = "Piyush Kushwah Java";
//		s=s.replace(" ","");
//		System.out.println(s);

		s = s.replaceAll("\\s+", "");
		System.out.println(s);

	}

}
