package oop_Inheritance;

public class Car extends Vehicle {
	
	//final class -- can not be a parent
	//final method -- can not be overridden 
	
	public final void logo() {
		
	}

	@Override
	public void start() {
		System.out.println("Car -- Start");
	}
	
	public void stop() {
		System.out.println("Car -- Stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void drive() {
		System.out.println("Static method drive from Car class");
	}
	
}
