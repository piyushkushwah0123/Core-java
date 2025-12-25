package com.stream;

import java.util.*;

//interface I {
//	public void add(int a, int b);
//}
//
//public class DemoLamba {
//
//	public static void main(String[] args) {
//		I i = (a, b) -> System.out.println(a + b);
//		i.add(10, 20);
//	}
//}

//interface I {
//	public int getLengthOftheString(String str);
//}
//
//public class DemoLamba {
//	public static void main(String[] args) {
//
//		I i = str -> str.length();
//		System.out.println(i.getLengthOftheString("Piyush"));
//
//	}
//}

///////////////// Even Odd///////////////////

//interface I {
//	boolean EvenOdd(int n);
//}
//
//public class DemoLamba {
//	public static void main(String[] args) {
//		I i = n -> n % 2 == 0; 
//		System.out.println(i.EvenOdd(10)); 
//	}
//}

////////////////////////// Sum /////////////////////////////
//interface I {
//    public int Sum(int n, int m);
//}
//public class DemoLamba {
//    public static void main(String[] args) {
//        I i = (n, m) -> n + m; 
//        System.out.println(i.Sum(10, 20));
//    }
//}

///////////////////////// IS Empty/////////////////
//interface I {
//	public boolean empty(String str);
//}
//
//public class DemoLamba {
//	public static void main(String[] args) {
//
//		I i = str -> str.isEmpty();
//		System.out.println(i.empty(""));
//	}
//}

/////////////////// Lower Case /////////////////////////////
//interface I {
//	public String lower(String str);
//}
//
//public class DemoLamba {
//	public static void main(String[] args) {
//
//		I i = str -> str.toLowerCase();
//		System.out.println(i.lower("SURESH"));
//	}
//}

/////////////////// Upper case////////////////
//interface I {
//	public String upper(String str);
//}
//
//public class DemoLamba {
//	public static void main(String[] args) {
//
//		I i = str -> str.toUpperCase();
//		System.out.println(i.upper("suresh"));
//	}
//}

/////////////////////// Factorial /////////////////////////////////////
//interface I {
//	int factorial(int n);
//}
//public class DemoLamba {
//	public static void main(String[] args) {
//		I i = n -> {
//			int f = 1;
//			for (int j = 1; j <= n; j++) {
//				f = f * j;
//			}
//			return f;
//		};
//		System.out.println(i.factorial(5));
//	}
//}

///////////////////////// PRIME  //////////////////////////////
//interface I {
//	boolean isPrime(int n);
//}
//
//public class DemoLamba {
//	public static void main(String[] args) {
//		I i = n -> {
//			if (n <= 1)
//				return false;
//			for (int j = 2; j <= n / 2; j++) {
//				if (n % j == 0)
//					return false;
//			}
//			return true;
//		};
//		System.out.println(i.isPrime(4));
//	}
//}

///////////////////// Concate two string using lamda expression //////////////////
//interface I {
//	String Concate(String s, String s1);
//}
//
//public class DemoLamba {
//	public static void main(String[] args) {
//		I i = (s, s1) -> s.concat(s1);
//		System.out.println(i.Concate("Piyush"," Jatin"));
//	}
//}

//////////////////// check if string is pallindrome using lamda expresson /////////////

interface I {
	String poll(String s);
}

public class DemoLamba {
	public static void main(String[] args) {
		I i = s -> {
			int low = 0;
			int high = s.length() - 1;
			while (low < high) {
				if (s.charAt(low) != s.charAt(high)) {
					return "Not Palindrome";
				}
				low++;
				high--;
			}
			return "Palindrome";
		};
		System.out.println(i.poll("madam"));
	}
}
