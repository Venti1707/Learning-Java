package package01_basic_concepts;

public class Class13_Break {
	public static void main(String[] args) {
		int a = 100;		
		while (a > 50) {
			a -= 5;
			if (a == 75) {
				break; // Stop the loop if the above condition is met
			}
			System.out.println(a);
		}
	}
}