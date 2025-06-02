package package05_inheritance_and_abstraction;
//   Sub -----                             ----- Super
//           |                             |
public class Class10_SuperKeyword2 extends Class09_SuperKeyword {
	int num1 = 10;
	public void doThis() {
		System.out.println("doThis() from Class 10 called");
	}
	
	public void doThis2() {
		super.doThis();
//      |
//      ----- To call the doThis() method from class 9, use the super keyword
		System.out.println(super.num1);
		//                 |
		//                 ----- To call num1 from class 9, the super keyword is also used
		System.out.println("doThis2() has been called");
	}
}
