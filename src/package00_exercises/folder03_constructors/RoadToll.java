package package00_exercises.folder03_constructors;

public class RoadToll {
	String type;
	int tyreCount;
	
	public void calculateToll() {
		if (tyreCount == 2) {
			System.out.println("Toll: $0");
		} else if (tyreCount == 4) {
			System.out.println("Toll: $10");
		} else if (tyreCount > 4) {
			System.out.println("Toll: $20");
		} else {
			System.out.println("Invalid tyre count");
		}
	}
	
	// Default constructor code
	// Is not considered to be a member of the class
	// Gets executed automatically
	// You can have any number of constructors, they just have to differ in arguments
	// Whether in the argument data types or the number of arguments
	// This is known as constructor overloading
	public RoadToll() {
		// System.out.println("Constructor code has been executed");
	}
	
	// If we do not use an explicitly created constructed together with the default constructor,
	// the main method will expect all instances of an object to be made with the proper arguments
	public RoadToll(String type, int tyreCount) {
		this.type = type;
		this.tyreCount = tyreCount;
	//  |
	//  ----- The this keyword refers to the member of the class, not the argument of the method
	}
}