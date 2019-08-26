package hw1;

public class Strings {
	public static String uniqueLetters(String str) {

		int[] count = new int[256];
		String s = "";
		/* Count array with frequency of characters */
		int i;
		for (i = 0; i < str.length(); i++)
			if (str.charAt(i) != ' ')
				count[(int) str.charAt(i)]++;//change into the int value
		
		for (i = 0; i < str.length(); i++)

			if (count[(int) str.charAt(i)] == 1)

				s = s + str.charAt(i);//if value = 1 then add to string

		return s;

	}

	public static void main(String[] args) {
		String message = uniqueLetters("harrasses");
		System.out.println(message);

	}

}
