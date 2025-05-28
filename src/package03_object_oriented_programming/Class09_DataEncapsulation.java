package package03_object_oriented_programming;

public class Class09_DataEncapsulation {
	// These variables are private so they can't be accessed outside of this class
	private String module;
	private int enrolment;

	// The following 4 methods are getters and setters
	// They prevent access to the variables directly
	// and if the name of the class variable is changed, it is easily changeable
	// (Change the name of the variables at the top and at this.variableName)
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public int getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(int enrolment) {
		this.enrolment = enrolment;
	}

	public void displayDetails() {
		System.out.println(module + " has an enrolment of " + enrolment);
	}
}