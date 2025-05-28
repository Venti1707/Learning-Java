package package03_object_oriented_programming;

public class Class12_StaticKeywordMain {
	public static void main(String[] args) {
		Class11_StaticKeyword sW1 = new Class11_StaticKeyword();
		Class11_StaticKeyword.name = "T";
		sW1.age = 18;
		
		Class11_StaticKeyword sW2 = new Class11_StaticKeyword();
		Class11_StaticKeyword.name = "N";
		sW2.age = 22;

		// T will get overwritten by N in both cases due to the static keyword
		// All changes made to the name variable will be shared across all objects
		// The name variable therefore belongs to the class, so you can use the name of the class instead of the object
		sW1.displayDetails();
		sW2.displayDetails();
		
	}
}