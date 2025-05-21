package package02_string_operations;

public class Class01_StringBasics {
	public static void main(String[] args) {
		String str1 = "GitHub username: ";
		String str2 = "Venti1707";
		
		// To concatenate a string, we can either use the + operator
		String str3 = str1 + str2;
		System.out.println(str3);
		
		// or the concat() method
		String str4 = str1.concat(str2);
		System.out.println(str4);
		
		String str5 = "Venti";
		int num = 1707;
		// When the + operator is used with a string and another data type, it becomes the concatenate operator
		System.out.println(str5 + num);
		
		// To find the length of a string, use the length() method
		System.out.println(str2.length());
		// The index of the first character of any string is 0
		// The final character would be the (length of the string - 1)
		
		// To remove empty characters from the start and end of strings, use the trim() method
		String str6 = "         Venti   1707          ";
		System.out.println(str6.trim());
		
		// To turn a string into upper case, use the toUpperCase() method
		System.out.println(str2.toUpperCase());
		
		// To turn a string into lower case, use the toLowerCase() method
		System.out.println(str2.toLowerCase());
		
		// To check if a string is empty, use the isEmpty() method
		String str7 = "";
		System.out.println(str2.isEmpty());
		System.out.println(str7.isEmpty());
	}
}