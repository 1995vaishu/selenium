package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		System.out.println("Addition");
		return num1 + num2 + num3;

	}

	public int sub(int num1, int num2) {
		System.out.println("Substraction");
		return num1 - num2;

	}

	public double multiply(double num1, double num2) {
		System.out.println("Multiplication");
		return num1 * num2;

	}

	public float divide(float num1, float num2) {
		System.out.println("Division");
		return num1 / num2;

	}

}