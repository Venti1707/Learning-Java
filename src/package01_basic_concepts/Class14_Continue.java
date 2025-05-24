package package01_basic_concepts;

public class Class14_Continue {
	public static void main(String[] args) {
		int a = 100;		
		while (a > 50) {
			a -= 5;
			if (a == 75) {
				continue; // Skip the rest of the loop if the above condition is met
			}
			System.out.println(a);
		}
	}
}