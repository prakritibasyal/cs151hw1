package hw1;

import java.util.*;

public class Encoding {
	public static void main(String[] s) {
	     HashSet<String> result1 = new HashSet<>();
	     result1 = morseCode(2, 1);
	     for(String str: result1) {
		   System.out.println(str);
				
			}
		}

	public static HashSet<String> morseCode(int m, int n) {

			String str = morseCodehelper(m, n);
			 System.out.println(str);
			HashSet<String> result1 = (helper(str, ""));

			return result1;
		}

		public static String morseCodehelper(int m, int n) {
			String s = "";
			for (int i = 0; i < m; i++) {
				s = s + ".";
			}
			for (int j = 0; j < n; j++) {
				s = s + "-";
			}
			return s;
		}

	   static HashSet<String> s = new HashSet();

		public static HashSet<String> helper(String str, String ans) {
			if (str.length() == 0) {
			 s.add(ans);

			} else {

				for (int i = 0; i < str.length(); i++) {

					// ith character of str
					char ch = str.charAt(i);

					// Rest of the string after excluding
					// the ith character
					String ros = str.substring(0, i) + str.substring(i + 1);

					// Recurvise call
					helper(ros, ans + ch);
				}

			}
			return s;

		}

}
