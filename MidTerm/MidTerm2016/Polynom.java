package MidTerm2016;

public class Polynom {


	private static double eval1(double a[], double x) {
		// TODO Auto-generated method stub
		double result = 0 ;
		for (int i = 0; i < a.length; i++) {
			result += a[i] * Math.pow(x, i);
		}
		return result;
	}
	
	private static double eval2(double a[] , double x ) {
		return eval(a, x, a.length-1);
	}

	private static double eval(double a[], double x , int index) {
		double result = 0 ;
		if (index <= 0) {
			return result += a[index] ;
		}
		result += a[index]*Math.pow(x, index);
		return result += eval(a, x, index-1);
	}

	public static void main(String[] args) {
		double a[] = { 1, 2, 3, 4 };
		double x = 2;
		System.out.println(eval1(a, x));
		System.out.println(eval2(a, x));
	}
}
