package package00_exercises.folder02_object_oriented_programming;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "John";
		e1.id = 2405;
		e1.salary = 9000;
		e1.calculateBonus();

		Employee e2 = new Employee();
		e2.name = "Jane";
		e2.id = 2510;
		e2.salary = 8500;
		e2.calculateBonus();
	}
}