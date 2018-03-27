package Sort;

import java.util.Arrays;

public class MergeArray {
	public static int[] mergeArray(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int c[] = new int[a.length + b.length];
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;

		while (indexA < a.length && indexB < b.length) {
			if (a[indexA] <= b[indexB]) {
				c[indexC] = a[indexA];
				indexA++;
			} else {
				c[indexC] = b[indexB];
				indexB++;
			}

			indexC++;
		}

		// System.out.println(Arrays.toString(c));

		if (indexA == a.length) {
			for (int i = indexC; i < c.length && indexB < b.length; i++) {
				c[i] = b[indexB];
				indexB++;
			}
		}
		if (indexB == b.length) {
			for (int i = indexC; i < c.length && indexA < a.length; i++) {
				c[i] = a[indexA];
				indexA++;
			}
		}

		return c;
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8 };
		int b[] = { 1, 3, 4, 5, 7 };

		int c[] = mergeArray(a, b);

		System.out.println(Arrays.toString(c));
	}
}
