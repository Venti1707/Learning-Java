package package03_object_oriented_programming;

public class Class05_MethodOverloadingMain {
	public static void main(String[] args) {
		Class04_MethodOverloading mO = new Class04_MethodOverloading();
		mO.addition(17, 7);
		mO.addition(1.7, 0.07);
		mO.addition(1, 7, 7);
		mO.addition(17, 0.07);
		mO.addition(1.7, 7);
	}
}