package package03_object_oriented_programming;

public class Class01_ConceptOfClasses {
	// Classes are a "template" to create an object
	// These contain the characteristics for the object
	// Specifically, these are the variables that makes up an object, and the methods associated with it
		
	// These are the variables
	String colour = "Black";
	String brand = "Toyota";
	String type = "MPV";
	
	// These are the methods
	public void displayDetails() {
		System.out.println("I have a " + brand + " " + type + " which is " + colour + " in colour");
	}
}