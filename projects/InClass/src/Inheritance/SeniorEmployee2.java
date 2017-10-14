package Inheritance;

public class SeniorEmployee2 extends Person{
	
	
	public SeniorEmployee2(int age, float salary, String name, String role, String organization) {
		super(age, salary, name, role, organization);
		SeniorOperations();
		
	}

	public void SeniorOperations() {
		System.out.println(name  + " performs senior level operations");
	}


	

}
