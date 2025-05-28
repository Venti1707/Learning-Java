package package03_object_oriented_programming;

public class Class03_Methods {
	public static void main(String[] args) {
		Class03_Methods mE = new Class03_Methods();
		mE.DoThis();
		mE.addition(17, 7);
		int x = mE.multiplication(17, 7);
		//  |
		//  ----- Create another variable to store the returned value
		//        This variable can be used for further processing
		System.out.println(x);
		
	}
	
	//          ----- This is the name of the method
	//          | 
	public void DoThis() {
		// The scope of any method is within the 2 curly brackets
		System.out.println("DoThis() method has been called"); // This code is executed, not returned
	}
	
	//                       ----- These are arguments for the addition method
	//                       |     Arguments must be stored inside the bracket
	//                       |
	public void addition(int num1, int num2) {
		System.out.println(num1 + num2); // This code is also executed
	}
	
	
	//     ----- The void keyword implies that no values are expected to return
	//     |     If something is to be returned, the data type of it must be used instead
	//     |
	public int multiplication(int int1, int int2) {
		int int3 = int1 * int2;
		return int3;
	}
}