package Inheritance;

public class InheritanceTest {
	
	public static void main(String[] args) {

	SeniorEmployee sr = new SeniorEmployee(21, 3000, "apple", "developer", "dexter");
	JuniorEmployee jr = new JuniorEmployee(25, 3500, "sam", "developer", "dexterr");
	Manager M = new Manager(28, 5000,"Tom", "Manager", "Dexter");
	
	

System.out.println("Name of Senior Employee: " + sr.getName());

System.out.println("Age of Junior Employee: " + jr.getAge());

System.out.println("Role of Manager: " +M.getRole());
}
}