package package00_exercises.folder04_stringbuilder;

public class PalindromeChecker {
	public static void main(String[] args) {
		String front = "step on no pets";
		String back = "";
		
		for (int i = (front.length() - 1); i >= 0; i--) {
			back += front.charAt(i);
		}
		
		System.out.println(back);
		
		if (front.equals(back)) {
			System.out.println("The original string is a palindrome");
		} else {
			System.out.println("The original string is NOT a palindrome");
		}
	}
}