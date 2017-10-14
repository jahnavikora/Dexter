package Inheritance;

public class Person {
	int age;
	float salary;
	String name;
	String role;
	String organization;
	public Person(int age, float salary, String name, String role, String organization) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.role = role;
		this.organization = organization;
	}
	
	

	public int getAge() {
		return age;
	}
	public float getSalary() {
		return salary;
	}
	public String getName() {
		
		return name;
	}
	public String getRole() {
		return role;
	}
	public String getOrganization() {
		return organization;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public void setOrganization(String organization) {
		this.organization = organization;
	}
	



}
