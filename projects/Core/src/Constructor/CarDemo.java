package Constructor;

public class CarDemo {

	public static void main(String[] args) {
		
		Car c = new Car("6575","Sonata","Hyndai" );
		c.start("Sam");
		c.start("John", 18);
		
	    c = new Car("Accent","9865");
		c.start("Tom");
		c.start("Emila", 20);
		
	
	
		
	}

}
