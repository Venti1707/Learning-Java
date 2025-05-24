package exercises;

public class Class01_FibonacciForLoop {
	public static void main(String[] args) {
		int limit = 18; // Set this number above 2 to find the first (limt + 2) numbers 
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i = 1; i <= limit; i++) {
			num3 = num2 + num1;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}