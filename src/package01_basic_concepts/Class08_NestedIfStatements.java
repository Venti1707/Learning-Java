package package01_basic_concepts;

public class Class08_NestedIfStatements {
	public static void main(String[] args) {
		// Suppose that a grading system is as follows:
		// Honours with highest distinction: 4.50 ≤ CGPA ≤ 5.00
		// Honours with distinction: 4.00 ≤ CGPA < 4.50
		// Honours with merit: 3.50 ≤ CGPA < 4.00
		// Honours: 3.00 ≤ CGPA < 3.50
		// Pass: 2.00 ≤ CGPA < 3.00
		
		float cGPA = 4.23f;
		
		// We can achieve this by using if statements with else if statements
		if ((cGPA >= 4.5) && (cGPA <= 5)) {
			System.out.println("Honours with highest distinction");
		} else if ((cGPA >= 4) && (cGPA < 4.5)) {
			System.out.println("Honours with distinction");
		} else if ((cGPA >= 3.5) && (cGPA < 4)) {
			System.out.println("Honours with merit");
		} else if ((cGPA >= 3) && (cGPA < 3.5)) {
			System.out.println("Honours");
		} else if ((cGPA >= 2) && (cGPA < 3)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
