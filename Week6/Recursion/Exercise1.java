package Recursion;

public class Exercise1 {
	private static double factorial(int i) {
		// TODO Auto-generated method stub
		if (i <= 1)
			return 1;

		return i * factorial(i - 1);

	}

	private static double doublefactorial(int n) {
		// TODO Auto-generated method stub
		if (n <= 1)
			return 1;
		return n * doublefactorial(n-2);
	}

	public static void main(String[] args) {
		System.out.println(factorial(8));
		System.out.println(doublefactorial(8));
	}
}
