package BTTuan1;

import MyTools.Tool;

public class Exe1 {
	public static void main(String[] args) {
		int[] array = Tool.newIntArray();
		Tool.showIntArray(sort(array));
	}

	public static int[] sort(int[] array) {
		int[] a = new int[array.length];
		int end = array.length - 1;
		int start = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				a[start] = array[i];
				start++;
			} else {
				a[end] = array[i];
				end--;
			}
		}
		return a; 
	}
}
