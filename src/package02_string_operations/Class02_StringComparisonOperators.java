package package02_string_operations;

public class Class02_StringComparisonOperators {
	public static void main(String[] args) {
		String str1 = "Venti1707";
		String str2 = "venti1707";
		
		// We can use the equals() method to see if two strings are the same, and is case sensitive when comparing
		System.out.println(str1.equals(str2));
		
		// A non-case sensitive method to compare two string is the equalsIgnoreCase() method
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// To compare the strings with their Unicode values, we can use the compareTo() method
		// If string1 > string2, it returns a positive number
		// If string1 < string2, it returns a negative number
		// If string1 is the same as string2, it returns 0
		System.out.println(str1.compareTo(str2));
		
		// To ignore their case, use the compareToIgnoreCase() method
		System.out.println(str1.compareToIgnoreCase(str2));
		
		// To see if a string matches a Regular Expression pattern, use the matches() method
		String pattern = "V.*1707";
		System.out.println(str1.matches(pattern));
	}
}