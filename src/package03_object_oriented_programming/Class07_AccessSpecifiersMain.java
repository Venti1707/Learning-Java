package package03_object_oriented_programming;

public class Class07_AccessSpecifiersMain {
	public static void main(String[] args) {
		Class06_AccessSpecifiers aS = new Class06_AccessSpecifiers();
		aS.publicMethod();
		aS.defaultMethod();
		// aS.privateMethod();
		// The private method will throw an error if executed
	}
}