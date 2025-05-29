package package04_special_classes;

public class Class02_StringBuilder {
	public static void main(String[] args) {
		// The StringBuilder class is used to build modifiable strings
		// In Java, strings are immutable
		String str1 = "Venti1707";
		str1 = str1 + " is my GitHub username";
		// This is not modifying the string as you are just referring to the original string
		// As such, 3 string objects are made
		// 1. Venti1707
		// 2.  is my GitHub Username
		// 3. Venti1707 is my GitHub Username
		System.out.println(str1);
		
		// To prevent the creation of multiple objects, use the StringBuilder method
		StringBuilder sB1 = new StringBuilder("Venti1707");
		sB1.append(" is my GitHub username");
		System.out.println(sB1);
		
		// To insert a string at any given position, use the insert() method
		// It takes in 2 arguments:
		// 1. The insert position (Note that it starts with 1)
		// 2. The string to insert
		sB1.insert(22, " and YouTube");
		System.out.println(sB1);
		
		// To replace a string at any given position, use the replace() method
		// It takes in 3 arguments
		// 1. The start position
		// 2. The end position (This is not included in the replace)
		// 3. The string to replace with
		// This is different from the replace() method using strings as that does not take into account the index
		sB1.replace(16, 34, "YouTube and GitHub");
		System.out.println(sB1);
		
		// To delete a character at any given position, use the deleteCharAt() method
		// It takes in a single argument
		// 1. The index of the character to remove (Starts from 0)
		sB1.append("!");
		System.out.println(sB1);
		sB1.deleteCharAt(43);
		System.out.println(sB1);
		
		// To delete a substring at any given position, use the delete() method
		// It takes in 2 arguments
		// 1. The start position
		// 2. The end position (This is not included in the replace)
		sB1.delete(24, 35);
		System.out.println(sB1);
		
		// To reverse a string, use the reverse() method
		sB1.reverse();
		System.out.println(sB1);
	}
}