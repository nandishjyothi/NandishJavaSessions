package oop_Abstract;

//Abstract class object cannot be created 


public abstract class Page {
	
	// abstract class can have abstract methods and non abstarct methods
	// abstract method does not have method body
	// abstract keyword is required to define abstract method and abstract class  
	// abstract class object can not be created 
	
	// can we create abstract class constructor?
	// yes constructor can be created in the abstract class
	
	// so what is the use of defining the constructor? - 
	// at the time of object creation during the runtime if default constructor or any constructor is not present then
	// java will by default create default constructor internally i.e hidden constructor
	// whenever we are creating object for the class it will go inside the class and check for the constructor, if that class 
	// has extended another class or abstract class it will check for the constructor and execute the constructor of parent class 
	// and the child class 
	// so in the abstract class the constructor is called when the child class object is created 
	// always parent class constructor is called first and then the subclass/child class constructor is called during object creation
	
	
	// main difference b/w abstract class and interface is abstract class can have constructor but interface cannot have constructor
	// Is it Compulsory to define abstract method in abstract class? 
	// it is not mandatory to create abstract method in abstract class 
	// can we have only abstract method in abstract class- yes it is allowed 
	// 0% abstraction -> no abstract methods
	// 100% abstraction -> only abstract methods
	// 0-100% partial abstraction -> abstract methods + non abstract methods
	
	// in interface it is 100% abstraction 
	// after JDK 1.8 it is not 100% abstraction
	// when to use interface and when to use abstract
	// when you want 100% abstraction we can go for interface 
	// when you want partial abstraction we can go for abstract class
	
	// we can override the abstract method in child interface from parent interface but we cannot give the body 
	
	public Page() {
		System.out.println("PAGE - default constructor");
	}
	
	public Page(int t) {
		System.out.println("PAGE - one parameter constructor");
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public void header() {
		System.out.println("Page header");
	}
	
	public final void logo() {
		System.out.println("Page -- logo");
	}

}
