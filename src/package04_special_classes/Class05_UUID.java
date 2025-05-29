package package04_special_classes;

import java.util.UUID;

public class Class05_UUID {
	public static void main(String[] args) {
		// Stands for Universally Unique Identifier
		// Is better than using random numbers as those may contain duplicates
		// Like the Scanner and Random class, we need to import it from the java.util class
		// It is 128 bits in length and only contains 
		System.out.println(UUID.randomUUID());
	}
}