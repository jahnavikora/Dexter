package practice;

public class InheritanceDemo {

	

	public static void main(String[] args) {
		
		Dog d = new Dog(5, 4, 6, "blue", "jimmy", "doggie" );
		
		d.eat();
		d.walk();
		d.GiveBirth();
		
		Cow c = new Cow(2, 5, 1, "white", "jimm");
		c.eat();
		c.walk();
		c.GiveBirth();
		c.milk();
		
		Cat cat = new Cat(5, 4, 6, "blue", "jimmy");
		cat.eat();
		cat.walk();
		cat.GiveBirth();
		
		
		
		
	
		
		
				

	}

}
