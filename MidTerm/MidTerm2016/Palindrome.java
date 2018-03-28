package MidTerm2016;

public class Palindrome {
	private static boolean isPalindrome(String[] a) {
		// TODO Auto-generated method stub
//		String[] a = string.split("");
		for (int i = 0; i < a.length / 2; i++) {
			if (!(a[i].equals( a[a.length - 1 - i]))) {
				return false;
			}
		}
		return true;
	}
	private static boolean isPalindrome(String a[], int n, int i) {
		// TODO Auto-generated method stub
		if (n < 1 ) {
			return true;
		}
		if (!a[i].equals(a[n])) {
			return false;
		}
		return isPalindrome(a, n-1, i+1);
	}
	public static void main(String[] args) {
		String [] a = "ABCCDCBA".split("");
		System.out.println(isPalindrome(a));
		System.out.println(isPalindrome(a, a.length-1, 0));
	}
}
