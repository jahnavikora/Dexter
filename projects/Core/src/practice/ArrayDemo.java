package practice;

public class ArrayDemo {
	

	public static void main(String[] args) {
		String[] students = new String[20];
		students[0]="Ram";
		students[3]="Apple";
		students[8]="vinnu";
		System.out.println("Third student is" + students[8]);
		System.out.println("Te4nth student is" + students[10]);
		
		

	
for(String student : students) {
	System.out.println("all the students are" + students);
}
}}
