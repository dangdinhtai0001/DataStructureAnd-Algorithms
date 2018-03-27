package Recursion;

public class SinhNhiPhan {
	public static void main(String[] args) {
		System.out.println(result(binary(12)));
	}
	
	public static String result(String string ) {
		String[] a = string.split("");
		String b = "" ;
		for (int i = a.length-1; i >= 0; i--) {
			b += a[i];
		}
		return b;
	}

	private static String binary(int n) {
		// TODO Auto-generated method stub
		String c = "";
		if (n == 1) {
			return c += "1";

		}
		if (n == 0) {
			return c += "0";
		}

		c += String.valueOf(n % 2);
		return c += binary(n / 2);

	}
}
