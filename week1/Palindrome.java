package week1.day2;

public class Palindrome {
	public static void main(String[] args) {

		String str = "madam", reverseStr = "";
		int strlength = str.length();
		for (int i = (strlength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + "- the given string is a palindrome");
		} else {
			System.out.println(str + "- the given string is not a palindrome");

		}
	}
}
