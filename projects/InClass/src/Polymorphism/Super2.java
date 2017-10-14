package Polymorphism;

public class Super2 extends Super1 {
	float Salary;

	public Super2(int id, String name,float Salary) {
		super(id, name);
		this.Salary=Salary;
		display();
	}
		
		public void display(){
			System.out.println(id+""+Salary+""+name);
		}
		
		
	
			
	}
	


