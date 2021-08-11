package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] num = { 8, 9, 5, 6, 4, 2, 1 };

		Arrays.sort(num);

		System.out.println("Second  Largest element in the array:" + num[num.length - 2]);

	}

}
