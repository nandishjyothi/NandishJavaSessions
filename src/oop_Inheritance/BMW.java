package oop_Inheritance;

public class BMW extends Car{
	
	//Method Overloading: only with in the same class
	//Poly(Many) + Morphism(Forms) --> Compile time polymorphism

	// Method Overriding:
	//Poly(Many) + Morphism(Forms) --> Run Time Polymorphism
	
	//When you have a method in the parent class and the same method you have in the child class with:
	//the same name
	//same number of parameters
	//with the same signature
	//private methods can not be overridden
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
//	public static void drive() {
//		// this is a individual method of BMW 
//		// we cannot override static method in java
//		System.out.println("Static method drive from BMW");
//	}
	

}
