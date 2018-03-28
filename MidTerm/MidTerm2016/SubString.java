package MidTerm2016;

public class SubString {

	private static boolean contains(String a[], String string) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase(string)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isContains(String a[], String b[]) {
		for (int i = 0; i < a.length; i++) {
			if (contains(b, a[i]) == false) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isContains2(String a[], String[]b) {
		return recursion(a, b, a.length-1);
	}
	
	private static boolean recursion (String a[] , String[] b ,int i) {
		if (i < 0 ) {
			return true;
		}
		
		if (contains(b, a[i]) == false) {
			return false;
		}
		
		return recursion(a, b, i-1);
	}

	public static void main(String[] args) {
		String a = "abcd";
		String[] ar = a.split("");
		String b = "abcde";
		String [] br = b.split("");
		System.out.println(isContains(ar, br));
		System.out.println(isContains2(ar, br));
		System.out.println(b.contains(a));
	}
}
