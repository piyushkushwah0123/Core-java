package StringQues;

public class AnagramInBuiltMethod {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		if (isAnagram(s1, s2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	static boolean isAnagram(String s1, String s2) {

		// Step 1: Length check
		if (s1.length() != s2.length()) {
			return false;
		}

		// Step 2: Frequency array
		int[] count = new int[256];

		// Step 3: Increase count for s1
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}

		// Step 4: Decrease count for s2
		for (int i = 0; i < s2.length(); i++) {
			count[s2.charAt(i)]--;
		}

		// Step 5: Check all values are zero
		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
