package package01_basic_concepts;

public class Class02_PrimitiveDataTypes {

	// There are 4 data types in Java. These are:

	// 1. Integers
		// -------------------------------
		// 1.1: byte
		// Takes up 8 bits in size
		// Ranges from (-2⁷) to (2⁷ - 1)
		// Has a default value of 0
		// -------------------------------
		// 1.2: short
		// Takes up 16 bits in size
		// Ranges from (-2¹⁵) to (2¹⁵ - 1)
		// Has a default value of 0
		// -------------------------------
		// 1.3: int
		// Takes up 32 bits in size
		// Ranges from (-2³¹) to (2³¹ - 1)
		// Has a default value of 0
		// -------------------------------
		// 1.4: long
		// Takes up 64 bits in size
		// Ranges from (-2⁶³) to (2⁶³ - 1)
		// Has a default value of 0
		// -------------------------------

	// 2. Fractions
		// ----------------------------------------
		// 2.1: float
		// Takes up 32 bits in size
		// Ranges from approximately ±3.40 * 10³⁸
		// Maximum of 7 digits after decimal point
		// Has a default value of 0.0f
		// ----------------------------------------
		// 2.2: double
		// Takes up 64 bits in size
		// Ranges from approximately ±1.79 * 10³⁰⁸
		// Maximum of 15 digits after decimal point
		// Has a default value of 0.0d

	// 3. Characters
		// 3.1: char
		// Takes up 16 bits in size
		// Is any single character
		// Has a default value of \u0000'
		// Also known as the null character
	
	
	// 4. Boolean
		// 4.1: boolean
		// Takes up 1 bit in size
		// Can either be true or false
		// Has a default value of false
	
	
	public static void main(String[] args) {
		byte b1 = 123;
		short s1 = 4567;
		int i1 = 890123;
		long l1 = 456789012;
		float f1 = 1.234f;
		double d1 = 5.6789d; // You do not need to specify the d at the end
		char c1 = 'A'; // Must be stored within single quotes
		boolean b2 = true;
		String s2 = "Hello world!"; // Strings are not a primitive data type, but is usually seen with them
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(b2);
		System.out.println(s2);
	}

}
