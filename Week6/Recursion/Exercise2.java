package Recursion;

public class Exercise2 {
	private static double finbonacci(int n) {
		// TODO Auto-generated method stub
		if (n <2 ) 
			return n;
		return finbonacci(n-1)+finbonacci(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(finbonacci(3));
	}
}
