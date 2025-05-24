package package02_string_operations;

public class Class06_StringConversionOperators {
	public static void main(String[] args) {
		int integer = 1707;
		
		// To convert an integer into a string, use the Integer.toString() method
		System.out.println(Integer.toString(integer));
		
		// To convert an integer into a binary string, use the Integer.toBinaryString() method
		System.out.println(Integer.toBinaryString(integer));
		
		// To convert an integer into an octal string, use the Integer.toOctalString() method
		System.out.println(Integer.toOctalString(integer));
		
		// To convert an integer into a hexadecimal string, use the Integer.toHexString() method
		System.out.println(Integer.toHexString(integer));
		
		// To convert a string from any of the above to a number, use the Integer.parseInt() method
		// This method takes in two values, the string and the base to convert to
		// If no base is specified, it is automatically set to 10
		String str1 = "1707";
		String str2 = "11010101011";
		String str3 = "3253";
		String str4 = "6ab";
		System.out.println(Integer.parseInt(str1));
		System.out.println(Integer.parseInt(str2, 2));
		System.out.println(Integer.parseInt(str3, 8));
		System.out.println(Integer.parseInt(str4, 16));
	}
}