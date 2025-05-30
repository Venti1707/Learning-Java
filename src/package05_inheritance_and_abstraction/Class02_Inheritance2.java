package package05_inheritance_and_abstraction;
//           ----- Becomes the sub class     ----- Becomes the super class
//           |                               |
public class Class02_Inheritance2 extends Class01_Inheritance {
	public void subtraction() {
		System.out.println("num1 - num2 = " + (num1 - num2));
	} //                                       |      | 
	//                                         ------------- These are from Class01_Inheritance, so they need not be defined again
}