package Polymorphism;

public class OverRideDemo {

	public static void main(String[] args) {
		
		Square s = new Square();
		System.out.println("Area of square is " +s.area(8));
	    Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle is " +r.area(9));
	}

}
