package Recursion;

public class Exercise4_LietKeToHop {
	static int n, k;
	static int[] x = new int[100];

	public static void printSolution() {
		// System.out.println("configuration " + count);
		for (int i = 0; i < n; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
	}

	public static void tryy(int i) {
		for (int v = x[i - 1] + 1; v <= n - k + 1; v++) {
			x[i] = v;
			if (i == k) {
				printSolution();
			} else
				tryy(i + 1);
		}
	}

	public static void main(String[] args) {
		k = 5;
		n = 5;
		x[0] = 0;
		tryy(1);
	}
}
