package package01_basic_concepts;

public class Class05_BitwiseOperators {
	public static void main(String[] args) {
		int i1 = 355; // 101100011 in binary
		int i2 = 113; // 001110001 in binary
		
		// There are 3 bitwise operators in Java.
		// These convert a given integer to binary and performs the respective operation
		
		// 1. &
		// Bitwise AND
		// 1 & 1 makes 1
		// 1 & 0 makes 0
		// 0 & 1 makes 0
		// 0 & 0 makes 0
		System.out.println(i1 & i2);
		
		// 2. |
		// Bitwise OR
		// 1 | 1 makes 1
		// 1 | 0 makes 1
		// 0 | 1 makes 1
		// 0 | 0 makes 0
		System.out.println(i1 | i2);
		
		// 3. ~
		// Bitwise complement
		// ~1 makes 0
		// ~0 makes 1
		System.out.println(~i1);
	}
}