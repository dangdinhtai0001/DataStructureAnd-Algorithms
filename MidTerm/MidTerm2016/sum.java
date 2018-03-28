package MidTerm2016;

public class sum {
	private static  int recursion(int a[], int i) {
		int re = 0 ;
		if (i >= a.length) {
			return re ;
		}
		re += a[i];
		return re += recursion(a, i+1);
	}
	
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		System.out.println(recursion(a, 0));
	}
}
