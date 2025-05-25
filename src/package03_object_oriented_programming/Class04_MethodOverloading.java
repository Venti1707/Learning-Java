package package03_object_oriented_programming;

public class Class04_MethodOverloading {
		// Method overloading refers to using methods of the same name, but differ in:
			// 1. Data type of arguments
			// 2. Number of arguments
			// 3. Order of arguments
		
		public void addition(int num1, int num2) {
			System.out.println(num1 + num2);
		}
		
		public void addition(double dou1, double dou2) {
			System.out.println(dou1 + dou2);
		}
		
		public void addition(int num3, int num4, int num5) {
			System.out.println(num3 + num4 + num5);
		}
		
		public void addition(int num6, double dou3) {
			System.out.println(num6 + dou3);
		}
		
		public void addition(double dou4, int num7) {
			System.out.println(dou4 + num7);
		}
		
}