package package01_basic_concepts;

public class Class11_WhileLoops {
	public static void main(String[] args) {
		// The while loop will only run if the condition is true
		int a = 100;
			// ----- The code will run as long as this condition is true
			// |
		while (a > 50) {
			a -= 5;
			System.out.println(a);
		}
	}
}