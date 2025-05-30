package package05_inheritance_and_abstraction;

public class Class07_MethodOverridingMain {
	public static void main(String[] args) {
		Class04_MethodOverriding c1 = new Class04_MethodOverriding();
		c1.whoAmI();
		
		Class05_MethodOverriding2 c2 = new Class05_MethodOverriding2();
		c2.whoAmI(); // The method from Class05 overrides the method in Class04
		
		Class06_MethodOverriding3 c3 = new Class06_MethodOverriding3();
		c3.whoAmI(); // The method from Class06 overrides the method in Class04
	
	}
}