package package04_special_classes;

public class Class01_Math {
	public static void main(String[] args) {
		// The Math class is used to perform numeric operations
		int num1 = 17;
		int num2 = 7;
		
		// To find the minimum of 2 numbers. use the Math.min() method
		System.out.println(Math.min(num1, num2));
		
		// To find the maximum of 2 numbers, use the Math.max() method
		System.out.println(Math.max(num1, num2));
		
		// To get the value of π, use Math.PI
		System.out.println(Math.PI);
		
		// To get the value of e, use Math.E
		System.out.println(Math.E);
		
		// To find the result of an exponential, use the Math.pow() method
		// The first number is the base, the second number is the exponent
		System.out.println(Math.pow(num1, num2));
		
		// To find the square root of any number, use the Math.sqrt() method
		System.out.println(Math.sqrt(num1));
		
		// To find the cube root of any number, use the Math.cbrt() method
		System.out.println(Math.cbrt(num2));
		
		// To find the ceiling of any number, use the Math.ceil() method
		// The ceiling function ignores any number after the decimal point and increases the whole number part by 1
		System.out.println(Math.ceil(Math.sqrt(num1)));
		System.out.println(Math.ceil(Math.cbrt(num2)));
		
		// To find the floor of any number, use the Math.floor() method
		// The floor function ignores any number after the decimal point and returns only the whole number part
		System.out.println(Math.floor(Math.sqrt(num1)));
		System.out.println(Math.floor(Math.cbrt(num2)));
		
		// To round any number, use the Math.round() method
		// The round function acts as a ceiling if the number after the decimal place is greater than or equal to 5
		// and a floor if the decimal place is lesser than or equal to 4
		System.out.println(Math.round(Math.sqrt(num1)));
		System.out.println(Math.round(Math.cbrt(num2)));
		
		// To find the sine of any number, use the Math.sin() method
		System.out.println(Math.sin(Math.PI));
		
		// To find the cosine of any number, use the Math.cos() method
		System.out.println(Math.cos(Math.PI));
		
		// To find the tangent of any number, use the Math.tan() method
		System.out.println(Math.tan(Math.PI));
		
		// To generate a random number between 0 and 1, use the Math.random() method
		System.out.println(Math.random());
	}
}