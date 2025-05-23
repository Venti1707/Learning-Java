package package02_string_operations;

public class Class05_StringReplaceOperators {
	public static void main(String[] args) {
		String str1 = "CONCENTRAT1234ON 1234MPROVES W1234TH PRACT1234CE";
		
		// To replace a string, use the replace() method
		// If no occurrence of the string to be replace is found, nothing will be changed
		System.out.println(str1.replace("1234", "I"));
		
		// To replace with Regular Expressions, use the replaceAll() method
		String str2 = "EI#$T%HER #YO&*U CON#@$TR^O(L Y$O&U*R* #M%I^N^D O^R& I&*(T W&I(*)L%L ()C^O#N%T&R@$%@OL @Y$O$U%";
		String pattern = "[^A-Za-z0-9\\s]";
		System.out.println(str2.replaceAll(pattern, ""));
	}
}