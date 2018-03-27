package Recursion;

public class Exercise4_LietKeNhiPhan {
	static int count;
	static int n;
	static int[] x = new int[100];

	public static void printSolution() {
		count++;
		// System.out.println("configuration " + count);
		for (int i = 0; i < n; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
	}

	public static void tryy(int k) {
		for (int v = 0; v <= 1; v++) {
			x[k] = v;
			if (k == n - 1) {
				printSolution();
			} else {
				tryy(k + 1);
			}

		}
	}

	public static void main(String[] args) {
		n = 3;
		count = 0;
		tryy(0);
	}
}
