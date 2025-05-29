package package04_special_classes;

import java.util.Random;

public class Class04_Random {
	public static void main(String[] args) {
		// To create random numbers, the Random class is used
		// Like the Scanner class, it is from the java.utils class, so we need to import it
		Random r1 = new Random();
		
		// To generate a random between 0 and (x - 1), use the nextInt() method
		System.out.println(r1.nextInt(100));
		
		// To generate a number between x and y, where y > x > 0, use the following as a guide
		// Note that y will not be generated
		// nextInt(k) + x
		// y = k + x => k = y - x
		// So, to generate between 42 and 1708
		System.out.println(r1.nextInt(1666) + 42);
	}
}