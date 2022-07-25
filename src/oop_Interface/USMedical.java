package oop_Interface;

public interface USMedical extends WHO{
	
	public int min_fee = 100;
	
	// Cannot have method body
	// only method prototype - called abstract method(non static methods only)
	// no method body only method declaration 
	// interface can not have the business logic
	// Interface to Interface we have to use extends
	//public interface USMedical extends WHO, UN--> not possible 
	
	public void physioService();
	
	public void cardioService();
	
	public void oncologyServices();
	
	public void emergencyServices();
	
	//After JDK 1.8 2 major changes happened 
	//1.) you can have static methods with the body:
	public static void billing() {
		System.out.println("US Medical -- billing");
	}
	
	//public static void billing2(); // because static method cannot be overridden 
	
	//2.) can have default method with method body (non static)
	// default keyword should be used
	default void medInsurance() {
		System.out.println("US med Insurance");
	}
	default void medInsurance1() {
		System.out.println("US med Insurance");
	}
	
	

}
