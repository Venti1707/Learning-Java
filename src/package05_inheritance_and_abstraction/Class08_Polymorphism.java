package package05_inheritance_and_abstraction;

public class Class08_Polymorphism {
	// Polymorphism refers to an object taking multiple forms
	public static void main(String[] args) {
		Class04_MethodOverriding c;
		// You can declare a parent object and instantiate it with the constructor of a child
		c = new Class04_MethodOverriding();
		c.whoAmI();
		
		c = new Class05_MethodOverriding2();
		c.whoAmI();
		
		c = new Class06_MethodOverriding3();
		c.whoAmI();
	}
}