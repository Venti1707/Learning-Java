package package01_basic_concepts;

public class Class12_DoWhileLoops {
	public static void main(String[] args) {
		// The do-while loop will run at least once, regardless whether the condition is true
		int a = 100;
		do {
			a -= 5;
			System.out.println(a);
		} while (a > 500);
			  // |
			  // ----- The code will run as long as this condition is true
	}
}