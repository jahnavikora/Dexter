package Polymorphism;

public class Dog extends Animal{
void walk() {
	System.out.println("Animal is walking");
	
}	public static void main(String args[]) {
	Animal a =new Dog();
	a.walk();
}

}
