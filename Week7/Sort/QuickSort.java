package Sort;

import java.util.Random;

public class QuickSort {

	private static int partition(int[] array, int left, int right ,int pivotIndex) {
		// TODO Auto-generated method stub
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, right);
		int storeIndex = left;
		for (int i = left; i < right; i++) {
			if (array[i] < pivot) {
				swap(array, storeIndex, i);
				storeIndex++;
			}
		}
		swap(array, storeIndex, right);
		return storeIndex;
	}

	private static void quickSort(int array[], int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			int index = partition(array, left, right,left);

			if (left < index) {
				quickSort(array, left, index - 1);
			}

			if (right > index) {
				quickSort(array, index + 1, right);
			}
		}
	}

	private static int[] input(int n) {
		// TODO Auto-generated method stub
		int a[] = new int[n];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(50);
		}
		return a;
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void print(int a[]) {
		// TODO Auto-generated method stub
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = input(10);
		// int a[] = { 11, 1, 4, 10, 12, 8, 28, 2, 6, 24, 8, 3 };
		print(a);
		 quickSort(a, 0, a.length-1);
//		partition(a, 0, a.length - 1,0);
		print(a);
	}
}
