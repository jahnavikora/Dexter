package Inheritance;

public class SeniorEmployee extends Person{
	
	
	public SeniorEmployee(int age, float salary, String name, String role, String organization) {
		super(age, salary, name, role, organization);
		SeniorOperations();
		
	}

	public void SeniorOperations() {
		System.out.println(name  + " performs senior level operations");
	}


	

}
