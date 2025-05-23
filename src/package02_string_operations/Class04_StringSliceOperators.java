package package02_string_operations;

public class Class04_StringSliceOperators {

	public static void main(String[] args) {
		String str1 = "Venti1707";
		String str2  = "V_e_n_t_i_1_7_0_7";
		
		// To find the character at a certain index in Java, use the charAt() method
		// If the specified index is out of bounds, an exception will be thrown
		System.out.println(str1.charAt(2));

		// We can use the charAt() method to reverse a string
		int len = str1.length();
		String temp = "";
		for (int i = 0; i < (len - 1); i++) {
			temp = str1.charAt(i) + temp;
		}
		System.out.println(temp);
		
		// To get the substring of a given string, use the substring() method
		// It takes in the beginning index, but you can also specify the end index
		// The end index is not included in the substring
		System.out.println(str1.substring(0, 5));
		
		// To split the string into an array with a delimiter, use the split() method
		String[] array = str2.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}