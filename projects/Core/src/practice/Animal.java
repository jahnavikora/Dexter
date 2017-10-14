package practice;

public class Animal {
private int age;
int height;
int NoOfLegs;
String color;
String name;

public Animal(int age, int height, int noOfLegs, String color, String name) {
	super();
	this.age = age;
	this.height = height;
	NoOfLegs = noOfLegs;
	this.color = color;
	this.name = name;
}
public void walk() {
	System.out.println(name + "is walking");
}
public void eat() {
	System.out.println(name + "eating");
}
public void GiveBirth() {
	System.out.println(name + "gives birth");


}
public int getAge() {
	return age;
}
public int getHeight() {
	return height;
}
public int getNoOfLegs() {
	return NoOfLegs;
}
public String getColor() {
	return color;
}
public String getName() {
	return name;
}
}
