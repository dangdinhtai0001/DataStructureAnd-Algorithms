package Recursion;

public class Exercise4_LietKeNhiPhan2 {
	static int n;
	static int[] x = new int[100]; 

	public static void printSolution() {
		// System.out.println("configuration " + count);
		for (int i = 0; i < n; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
	}

	public static void tryy(int i) {
		if (i == n) {
			printSolution(); 
		}

		else {
			for (int t = 0; t < 2; t++) { // thay 2 = n đc chuỗi n phân
				x[i] = t;
				tryy(i + 1);
			}
		}
	}

	public static void main(String[] args) {
		n = 3;
		tryy(0);
	}
}
