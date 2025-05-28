package package03_object_oriented_programming;

public class Class02_Objects {
	public static void main(String[] args) {
		// To create the object of a given class, declare it with respect to the class
		//                                ----- This is known as the constructor of the class
		//                                |     Is similar to the method inside the class
		//    Name of object -----        |     The name must be the same as the class name
		//                       |        |
		Class01_Classes c1 = new Class01_Classes();
		//                            |
		//                            ----- This new keyword is used to instantiate the object of any class
	
		c1.colour = "Green";
		c1.brand = "Nissan";
		c1.displayDetails();
		
		// We can create multiple objects by repeating the above code, but changing the object name
	}
}