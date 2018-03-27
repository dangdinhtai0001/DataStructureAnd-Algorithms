package BT1_SimpleSort;

import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {
		int[] a = getRandom(5, 20);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static int[] getRandom(int n, int m) {
		Random random = new Random();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(m);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					a[i] = random.nextInt(m);
				}
			}
		} 
		return a;
	}
}
