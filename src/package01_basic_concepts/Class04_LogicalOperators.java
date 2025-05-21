package package01_basic_concepts;

public class Class04_LogicalOperators {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		// There are 3 logical operators in Java. These are:
		
		// 1. &&
		// Logical AND
		// Returns true if both conditions are true
		System.out.println(b1 && b2);
		
		// 2. ||
		// Logical OR
		// Returns true if either conditions are true
		System.out.println(b1 || b2);
		
		// 3. !
		// Logical NOT
		// Returns true if false and vice versa
		System.out.println(!(b1 && b2));
	}
}