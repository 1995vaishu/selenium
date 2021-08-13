package week1.day2;

public class CharOccurance {
	public static void main(String[] args) {

		String str1 = "Welcome to Chennai";
		int count = 0;
		char charOcc = 'n';
		char[] charArr = str1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == charOcc) {
				count++;

			}

		}
		System.out.println("No. of times 'n' occured in a string is " + count);
	}

}
