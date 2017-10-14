package practice;

public class Dog extends Animal{
	String breed;

	public Dog(int age, int height, int noOfLegs, String color, String name, String breed) {
		super(age, height, noOfLegs, color, name);
		this.breed = breed;
		
		
		
	}

	public String getBreed() {
		return breed;
	}
	

}
