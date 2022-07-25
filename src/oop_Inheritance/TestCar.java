package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();// latest implementation will be picked up i.e from child class, overriden method
		b.stop();// inherited method from parent class CAR
		b.refuel();// inherited method from parent class CAR
		b.autoParking();// individual method from child class BMW
		b.engine();// can be accessed from vehicle class
		BMW.drive();
		b.drive();
		
		Car c = new Car();
		c.start();// parent class method
		c.stop();
		c.refuel();
		//c.autoparking not able access
		c.engine();// can be accessed from vehicle class
		Car.drive();
		
		//Child class object can be reffered by parent class ref variable:
		// it is called top casting 
		Car c1 = new BMW();
		c1.start();// BMW start method is picked up
		c1.stop(); // stop method can be accessed bcoz it is inherited from the parent class and reference type is checked
		c1.refuel();
		//c1.autoParking not able to access bcoz it is individual method of bmw class, only bmw class obj can access 
		
		
		//Child class object can be reffered by parent class ref variable:
		// it is called top casting
		// only inherited methods can be accessed and latest implementation will be picked up
		Vehicle v1 = new BMW();
		v1.engine();
		//v1.start(); cannot be accessed
		v1.start();
		
		
		//Down Casting: Not Allowed in java at runtime 
		// Parent class object can be reffered by child class reference variable?
		//BMW b1 = new Car(); // every car is not a BMW so it is giving error
		// but every bmw is car 
		//BMW b1 = (BMW) new Car();// JavaClassCastException (Car cannot be cast to class oop_Inheritance.BMW )
		//b1.start();
		
		//Grant parent class object can be reffered by child class ref variable?
		//BMW b2 = (BMW) new Vehicle(); JavaClassCastException
		
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.theftSafety();
		a.sportsMode();
		
		
		
		
		
		

	}

}
