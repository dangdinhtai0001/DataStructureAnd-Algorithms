package BaiTap;

import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		
		System.out.println("INPUT");
		
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		System.out.println("OUTPUT");
		
		int[] array = output(a, x);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
	}
	
	public static int[] output (int[] a,int x) {
		int [] array = new int[a.length+1];
		for (int i = 0; i < a.length; i++) {
			array[i] = a[i];
		}
		array[a.length] = x;
		
		int position = a.length;
		int value = x;
		
		while(position > 0 && a[position-1] >= value) {
			array[position] = array[position-1];
			position--;
		}
		array[position] = value;
		
		return array;
	}
}
