package Inheritance;

public class JuniorEmployee extends Person{
	
	public JuniorEmployee(int age, float salary, String name, String role, String organization) {
		super(age, salary, name, role, organization);
		JuniorOperations();
		
	}



	public void JuniorOperations() {
		System.out.println(name  + " performs junior level opertaions");
	}



}
