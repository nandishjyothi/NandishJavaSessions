package javaSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels = 4;
	
	// Static class variables should be the common value

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "Blue";
		//c1.wheels = 4;
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 70;
		c2.color = "White";
		//c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 15;
		c3.color = "Black";
		//c3.wheels = 4;
		
		// one common thing in the above code is that the wheel property value is same for all the objects
		// in java when ever the value is common that property should be defined as static in java
		// static is applicable only for class variable it cannot be applied to local variable 
		
		System.out.println(c1.name+":"+c1.price+":"+c1.color);
		
		//how to access static variable:
		//1. within the same class , you can access them directly
		System.out.println(wheels);
		
		//2. you can call by the class name:
		System.out.println(Car.wheels);// best way use static var
		
		//3. call by object refe:
		System.out.println(c1.wheels);// not a good way to use
		
		
		
		
	}

}
