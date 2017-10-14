package practice;

public class Cow extends Animal{
	
	public Cow(int age, int height, int noOfLegs, String color, String name) {
		super(age, height, noOfLegs, color, name);
		
	}

	public void milk()
	{
		System.out.println(name + "is milking");
	}
	
	}
