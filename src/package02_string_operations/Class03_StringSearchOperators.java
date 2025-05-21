package package02_string_operations;

public class Class03_StringSearchOperators {
	public static void main(String[] args) {
		String str = "Venti1707";
		
		// To find if a string is found within another string, use the contains() method
		// This method is a case sensitive method.
		// To check if the string does indeed exist, convert both strings to either lower case or upper case
		System.out.println(str.contains("Venti"));
		
		// To find if a sting starts with another string, use the startsWith() method
		System.out.println(str.startsWith("Ven"));
		
		// To find if a string ends with another string, use the endsWith() method
		System.out.println(str.endsWith("707"));
		
		// To find the index of a given character/string, use the indexOf() method
		// It will return the first index of the given string
		// Should there be multiple occurrences, the first occurrence will be returned
		// If no occurrences are found, -1 is returned
		// This method can also take in a second argument, which is the index to start the search from
		System.out.println(str.indexOf("7"));
		
		// To find the last index of a given character/string use the lastIndexOf() method
		System.out.println(str.lastIndexOf("7"));
	}
}