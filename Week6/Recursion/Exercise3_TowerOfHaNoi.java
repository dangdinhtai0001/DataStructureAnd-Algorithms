package Recursion;

public class Exercise3_TowerOfHaNoi {
	private static void change(int top, String source, String auxiliary, String destination) {
		// TODO Auto-generated method stub
		if (top == 1) {
			System.out.println("Disk 1 from " + source + " to "+destination);
		} else {
			change(top - 1, source, destination, auxiliary);
			System.out.println("Disk " + top + " from " + source + " to " + destination);
			change(top - 1, auxiliary, source, destination);
		}
	}
	
	public static void main(String[] args) {
		change(2, "Source", "Auxiliary", "Destination");
	}
}
