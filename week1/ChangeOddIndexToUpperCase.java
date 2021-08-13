package week1.day2;

public class ChangeOddIndexToUpperCase {

		public static void main(String[] args) {
		String str = "chan geme";
		char[] charArray = str.toCharArray();
		for (int i = 0; i <charArray.length; i++) {
			if (i % 2 == 0) {

				System.out.println(Character.toUpperCase(charArray[i]));

			} else {
				System.out.println(charArray[i]);
			}
		}

	}
}
