package Inheritance;

public class Manager extends Person {
	

	public Manager(int age, float salary, String name, String role, String organization) {
		super(age, salary, name, role, organization);
		ManagerOperations();
		
	}

	

	public void ManagerOperations() {
		System.out.println(name + " manages the organization");
	}

}
