package package01_basic_concepts;

public class Class03_ArithmeticOperators {

	public static void main(String[] args) {
		int num1 = 355;
		int num2 = 113;
		
		// There are 11 arithmetic operators in Java. These are:
		
		// 1) +
		// Addition
		int num3 = num1 + num2;
		System.out.println(num3);
		
		// 2) -
		// Subtraction
		int num4 = num1 - num2;
		System.out.println(num4);
		
		// 3) *
		// Multiplication
		int num5 = num1 * num2;
		System.out.println(num5);
		
		// 4) /
		// Division
		int num6 = num1 / num2;
		System.out.println(num6);

		// 5) %
		// Modulus
		// Returns the remainder when dividing the number on the left with the number on the right
		int num7 = num1 % num2;
		System.out.println(num7);
		
		// 6) ++
		// Increment
		int num8 = num1++;
		System.out.println(num8);
		
		// 7) --
		// Decrement
		int num9 = num1--;
		System.out.println(num9);
		
		// 8) +=
		// Increment by a specific value
		int num10 = num1;
		num10 += num2;
		System.out.println(num10);
		
		// 9) -=
		// Decrement by a specific value
		int num11 = num1;
		num11 -= num2;
		System.out.println(num11);
		
		// 10) *=
		// Multiply by a specific value
		int num12 = num1;
		num12 *= num2;
		System.out.println(num12);
		
		// 11) /=
		// Divide by a specific value
		int num13 = num1;
		num13 /= num2;
		System.out.println(num13);
	}

}
