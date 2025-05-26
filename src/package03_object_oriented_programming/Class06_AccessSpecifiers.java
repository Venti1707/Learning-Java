package package03_object_oriented_programming;

public class Class06_AccessSpecifiers {
		// There are 4 access specifiers in Java. You can use these for variables and methods.
		// These are:
		
		// 1. Public access
		// Can only be used within all packages and all classes
		// To import this from a different package, use the following code
		// import packageName.className;
		public void publicMethod() {
			System.out.println("Public");
		}
		
		// 2. Default access (Also known as the no access specifier)
		// Can only be used within the same package and the same class
		void defaultMethod() {
			System.out.println("Default");
		}
		
		// 3. Private access
		// Is the least visible access method
		// Can only be accessed within the same class
		private void privateMethod() {
			System.out.println("Private");
		}
		
		// 4. Protected access
		// Can be used within the same package and class
		// Can also be used within the same project if inherited
}