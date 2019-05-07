package calculator;

public class JavaCalculator {

	public int sum(int a, int b) {

		return a + b;
	}

	public int sub(int a, int b) {

		return a - b;
	}

	public int mul(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {

		JavaCalculator cal = new JavaCalculator();
		System.out.println(cal.sum(10, 1));

		System.out.println(cal.sub(10, 2));
		System.out.println(cal.mul(10, 2));
	}

}
