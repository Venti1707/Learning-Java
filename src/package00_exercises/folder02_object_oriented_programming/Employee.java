package package00_exercises.folder02_object_oriented_programming;

public class Employee {
	String name;
	int id;
	float salary;
	
	public void calculateBonus() {
		float bonus = salary * 0.2f;
		System.out.println("Employee " + name + " (ID " + id + ") has a bonus of $" + bonus);
	}
}