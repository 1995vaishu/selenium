package week1.day2;

public class Missingelements {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 6, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i) {
				System.out.println(" missing element :" + i);
				break;
			}
		}

	}
}
