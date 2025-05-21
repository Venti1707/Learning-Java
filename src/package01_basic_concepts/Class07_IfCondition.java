package package01_basic_concepts;

public class Class07_IfCondition {
	public static void main(String[] args) {
		int i1 = 355;
		int i2 = 113;
		
		// A condition is anything that will return a boolean value
		
		if (i1 > i2) {
			// All the code in this block will be executed if the condition is true
			System.out.println("i1 is greater than i2");
		} else {
			// Conversely, all the code in this block will be executed if the condition is false
			System.out.println("i1 is not greater than i2");
		}
	}
}