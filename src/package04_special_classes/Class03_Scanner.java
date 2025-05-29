package package04_special_classes;

import java.util.Scanner;

public class Class03_Scanner {
	public static void main(String[] args) {
		// The Scanner class is used for user inputs during the execution of a Java program
		// It is from the java.util class, so the following code snippet has to be added if the Scanner class is to be used
		// import java.util.Scanner;
		Scanner s1 = new Scanner(System.in);
		System.out.println("What is your name?");
		String str = s1.nextLine(); // This picks up any text from the input and stores it within the variable
		System.out.println("Hello " + str + "!");
		String rts = ""; // This is the backwards of str
		
		for (int i = (str.length() - 1); i >= 0; i--) {
			rts += str.charAt(i);
		}
		
		System.out.println("Useless information: Your name backwards is " + rts);
		// To get an integer from the user, use s1.nextInt() instead
	}
}